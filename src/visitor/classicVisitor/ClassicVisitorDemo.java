package visitor.classicVisitor;

public class ClassicVisitorDemo {

    public static void main(String[] args) {
        // 1+(2+3)
        AdditionExpression additionExpression = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                ));
        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.visit(additionExpression);
        System.out.println(expressionPrinter);

        ExpressionCalculator calc = new ExpressionCalculator();
        calc.visit(additionExpression);
        System.out.println(expressionPrinter + " = " + calc.result);
    }
}
