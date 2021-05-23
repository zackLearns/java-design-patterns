package visitor.classicVisitor;

public class ExpressionPrinter implements ExpressionVisitor {

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void visit(AdditionExpression additionExpression) {
        stringBuilder.append("(");
        additionExpression.left.accept(this);
        stringBuilder.append("+");
        additionExpression.right.accept(this);
        stringBuilder.append(")");
    }

    @Override
    public void visit(DoubleExpression doubleExpression) {
        stringBuilder.append(doubleExpression.value);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
