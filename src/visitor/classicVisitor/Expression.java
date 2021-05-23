package visitor.classicVisitor;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
