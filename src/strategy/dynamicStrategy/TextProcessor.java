package strategy.dynamicStrategy;

import java.util.List;

public class TextProcessor<LS extends ListStrategy> {

    private StringBuilder stringBuilder = new StringBuilder();
    // cannot do this
    // private LS listStrategy = new LS();
    private ListStrategy listStrategy;

    public TextProcessor(OutputFormat outputFormat) {
        switch(outputFormat) {
            case HTML:
                listStrategy = new HtmlListStrategy();
                break;
            case MARKDOWN:
                listStrategy = new MarkdownListStrategy();

        }
    }

    // the skeleton algorithm is here
    public void appendList(List<String> items) {
        listStrategy.start(stringBuilder);
        for (String item : items)
            listStrategy.addListItem(stringBuilder, item);
        listStrategy.end(stringBuilder);
    }

    public void clear() {
        stringBuilder.setLength(0);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
