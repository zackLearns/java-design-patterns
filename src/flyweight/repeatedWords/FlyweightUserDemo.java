package flyweight.repeatedWords;

public class FlyweightUserDemo {

    public static void main(String[] args) {

        User johnSmith = new User("John Smith");
        User janeSmith = new User("Jane Smith");

        // "Smith" will not be repeated as they are similar
        User.strings.forEach(System.out::println);
    }
}
