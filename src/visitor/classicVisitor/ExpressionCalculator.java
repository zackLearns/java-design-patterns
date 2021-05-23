package visitor.classicVisitor;

public class ExpressionCalculator implements ExpressionVisitor {

    public double result;

    @Override
    public void visit(DoubleExpression doubleExpression) {
        result = doubleExpression.value;
    }

    @Override
    public void visit(AdditionExpression additionExpression) {
        additionExpression.left.accept(this);
        double a = result;
        additionExpression.right.accept(this);
        double b = result;
        result = a+b; // this is a test
    }
}
