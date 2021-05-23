package observer.event;

public class HandMadeEventsDemo {

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Subscription sub = person.propertyChanged.addHandler(x -> {
            System.out.println("Person's " + x.propertyName + " has changed.");
        });

        person.setAge(17);
        person.setAge(18);
        sub.close();
        person.setAge(19);
    }
}
