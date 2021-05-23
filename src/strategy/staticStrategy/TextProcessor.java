package strategy.staticStrategy;

import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {

    private StringBuilder stringBuilder = new StringBuilder();
    // cannot do this
    // private LS listStrategy = new LS();
    private LS listStrategy;

    public TextProcessor(Supplier<? extends LS> ctor) {
        listStrategy = ctor.get();
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
