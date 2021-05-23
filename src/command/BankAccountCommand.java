package command;


public class BankAccountCommand implements Command {

    private BankAccount account;
    private Action action;
    private int amount;
    public boolean succeeded;

    public BankAccountCommand(BankAccount account, Action action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {

        switch(action) {
            case DEPOSIT:
                succeeded = account.deposit(amount);
                break;
            case WITHDRAW:
                succeeded = account.withdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {

        if(!succeeded) return;

        switch(action) {
            case DEPOSIT:
                account.withdraw(amount);
                break;
            case WITHDRAW:
                account.deposit(amount);
                break;
        }
    }
}
