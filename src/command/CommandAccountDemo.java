package command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static command.Action.*;

public class CommandAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);

        List<BankAccountCommand> bankAccountCommands = new ArrayList<>();
        bankAccountCommands.add(new BankAccountCommand(bankAccount, DEPOSIT, 100));
        bankAccountCommands.add(new BankAccountCommand(bankAccount, WITHDRAW, 1000));

        for(Command command : bankAccountCommands) {
            command.call();
            System.out.println(bankAccount);
        }

        Collections.reverse(bankAccountCommands);
        for(Command command : bankAccountCommands) {
            command.undo();
            System.out.println(bankAccount);
        }
    }
}
