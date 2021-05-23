package visitor.intrusiveVisitor;

public class DoubleExpression extends Expression {

    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append(value);
    }
}
