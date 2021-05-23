package adapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

    private static final List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(1, 1, 10, 10),
            new VectorRectangle(3, 3, 6, 6)
    ));

    public static void main(String[] args) {
        draw();
        draw();
    }

    public static void draw() {
        for (VectorObject vectorObject : vectorObjects) {
            for (Line line : vectorObject) {
                LineToPointAdapter lineToPointAdapter = new LineToPointAdapter(line);
                lineToPointAdapter.forEach(AdapterDemo::drawPoint);
            }
        }
    }

    public static void drawPoint(Point p) {
        System.out.println(".");
    }
}
