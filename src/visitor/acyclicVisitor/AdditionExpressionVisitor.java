package visitor.acyclicVisitor;

public interface AdditionExpressionVisitor extends Visitor {

    void visit(AdditionExpression obj);
}
