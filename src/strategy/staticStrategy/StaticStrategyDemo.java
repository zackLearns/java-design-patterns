package strategy.staticStrategy;

import java.util.List;

public class StaticStrategyDemo {

    public static void main(String[] args) {
        TextProcessor<MarkdownListStrategy> textProcessor1 = new TextProcessor<>(MarkdownListStrategy::new);
        textProcessor1.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(textProcessor1);

        TextProcessor<HtmlListStrategy> textProcessor2 = new TextProcessor<>(HtmlListStrategy::new);
        textProcessor2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
        System.out.println(textProcessor2);
    }
}
