package factories.innerFactory;

import static factories.innerFactory.Point.Factory.*;

public class InnerFactoryDemo {

    public static void main(String[] args) {
        Point cartesianPoint = newCartesianPoint(3 , 4);
        Point polarPoint = newPolarPoint(3, 4);

        System.out.println(cartesianPoint);
        System.out.println(polarPoint);
    }
}
