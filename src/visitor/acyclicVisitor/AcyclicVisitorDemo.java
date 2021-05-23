package visitor.acyclicVisitor;

public class AcyclicVisitorDemo {

    public static void main(String[] args) {
        AdditionExpression expression = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                )
        );
        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.visit(expression);
        System.out.println(expressionPrinter.toString());
    }
}
