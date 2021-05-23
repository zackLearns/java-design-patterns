package flyweight.formatText;

public class TextFormattingDemo {

    public static void main(String[] args) {
        FormattedText formattedText = new FormattedText("This is a brave new world");
        formattedText.getRange(10, 15).capitalize = true;
        System.out.println(formattedText);
    }
}
