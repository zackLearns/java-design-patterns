package decorators.stringDecorator;

public class MagicStringDemo {

    public static void main(String[] args) {
        MagicString magicString = new MagicString("hello");
        System.out.println(magicString + " has " + magicString.getNumberOfVowels() + " vowels.");
    }
}
