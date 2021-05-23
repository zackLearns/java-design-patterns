package visitor.classicVisitor;

public interface ExpressionVisitor {

    void visit(DoubleExpression doubleExpression);
    void visit(AdditionExpression additionExpression);
}
