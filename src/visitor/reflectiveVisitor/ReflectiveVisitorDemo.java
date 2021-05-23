package visitor.reflectiveVisitor;

import visitor.intrusiveVisitor.AdditionExpression;
import visitor.intrusiveVisitor.DoubleExpression;

public class ReflectiveVisitorDemo {

    public static void main(String[] args) {
        // 1+(2+3)
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                ));
        StringBuilder stringBuilder = new StringBuilder();
        e.print(stringBuilder);
        System.out.println(stringBuilder);
    }
}
