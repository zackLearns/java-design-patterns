package proxy.protectionProxy;

public class CarProxy extends Car {

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if(driver.age >= 17)
            super.drive();
        else
            System.out.println("Driver too young.");
    }
}
