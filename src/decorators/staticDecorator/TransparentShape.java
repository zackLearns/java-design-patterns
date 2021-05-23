package decorators.staticDecorator;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

    private Shape shape;
    private int transparency;

    public TransparentShape(Supplier<? extends T> constructor, int transparency) {
        shape = constructor.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has transparency " + transparency;
    }
}
