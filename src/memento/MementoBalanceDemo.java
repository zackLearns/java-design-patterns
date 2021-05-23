package memento;

public class MementoBalanceDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        Memento memento1 = bankAccount.deposit(50);
        Memento memento2 = bankAccount.deposit(25);
        System.out.println(bankAccount);

        bankAccount.restore(memento1);
        System.out.println(bankAccount);
    }
}
