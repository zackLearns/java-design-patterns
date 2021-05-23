package visitor.reflectiveVisitor;

public class ExpressionPrinter {

    public static void print(Expression expression, StringBuilder stringBuilder) {
        if( expression instanceof DoubleExpression) {
            stringBuilder.append(((DoubleExpression) expression).value);
        } else if(expression instanceof AdditionExpression) {
            AdditionExpression additionExpression = (AdditionExpression)expression;
            stringBuilder.append("(");
            print(additionExpression.left, stringBuilder);
            stringBuilder.append("+");
            print(additionExpression.right, stringBuilder);
            stringBuilder.append(")");
        }
    }
}
