package prototypes;

public class PrototypeDemo {

    public static void main(String[] args) {

        Person john = new Person(new String[]{"John", "Smith"},
                new Address("Serangoon Road", 123));

        Person jane = new Person(john);
        jane.setNames(new String[]{"Jane", "Smith"});
        jane.getAddress().setHouseNumber(124);

        System.out.println(john);
        System.out.println(jane);
    }
}
