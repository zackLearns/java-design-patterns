package strategy.dynamicStrategy;

import java.util.List;

import static strategy.dynamicStrategy.OutputFormat.*;

public class DynamicStrategyDemo {

    public static void main(String[] args) {
        TextProcessor<MarkdownListStrategy> textProcessor1 = new TextProcessor<>(HTML);
        textProcessor1.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(textProcessor1);

        TextProcessor<HtmlListStrategy> textProcessor2 = new TextProcessor<>(MARKDOWN);
        textProcessor2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(textProcessor2);
    }
}
