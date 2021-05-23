package strategy.dynamicStrategy;

public interface ListStrategy {
    default void start(StringBuilder sb) {}
    void addListItem(StringBuilder stringBuilder, String item);
    default void end(StringBuilder sb) {}
}
