package proxy.protectionProxy;

public class ProtectionProxyDemo {

    public static void main(String[] args) {

        Drivable carNoAgeLimit = new Car(new Driver(12));
        carNoAgeLimit.drive();

        Drivable carWithAgeLimit = new CarProxy(new Driver(12));
        carWithAgeLimit.drive();
    }
}
