package flyweight.formatText;

import java.util.ArrayList;
import java.util.List;

public class FormattedText {

    private String plainText;
    private List<TextRange> formatting = new ArrayList<>();

    public FormattedText(String plainText) {
        this.plainText = plainText;
    }

    public TextRange getRange(int start, int end) {
        TextRange range = new TextRange(start, end);
        formatting.add(range);
        return range;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); ++i) {
            char c = plainText.charAt(i);
            for (TextRange range : formatting)
                if (range.covers(i) && range.capitalize)
                    c = Character.toUpperCase(c);
            sb.append(c);
        }
        return sb.toString();
    }

}
