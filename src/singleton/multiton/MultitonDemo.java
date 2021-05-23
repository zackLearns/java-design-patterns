package singleton.multiton;

import static singleton.multiton.Subsystem.*;

public class MultitonDemo {

    public static void main(String[] args) {

        Printer main = Printer.get(PRIMARY);
        Printer aux = Printer.get(AUXILIARY);
        Printer aux2 = Printer.get(AUXILIARY);
    }
}
