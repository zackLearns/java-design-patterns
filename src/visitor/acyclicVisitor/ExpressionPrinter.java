package visitor.acyclicVisitor;


public class ExpressionPrinter implements DoubleExpressionVisitor, AdditionExpressionVisitor {

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void visit(AdditionExpression obj) {
        stringBuilder.append('(');
        obj.left.accept(this);
        stringBuilder.append('+');
        obj.right.accept(this);
        stringBuilder.append(')');
    }

    @Override
    public void visit(DoubleExpression obj) {
        stringBuilder.append(obj.value);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

}
