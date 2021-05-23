package bridge;


public class BridgeDemo {

    public static void main(String[] args) {

        ShapeModule shapeModule = new ShapeModule();
        Circle instance = new Circle(shapeModule);
        instance.radius = 3;
        instance.draw();
        instance.resize(2);
        instance.draw();
    }
}
