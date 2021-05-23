package visitor.acyclicVisitor;

public interface ExpressionVisitor extends Visitor {
    void visit(Expression obj);
}
