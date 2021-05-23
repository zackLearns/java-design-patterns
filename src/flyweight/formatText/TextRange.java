package flyweight.formatText;

public class TextRange {

    public int start, end;
    public boolean capitalize, bold, italic;

    public TextRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean covers(int position) {
        return position >= start && position <= end;
    }
}
