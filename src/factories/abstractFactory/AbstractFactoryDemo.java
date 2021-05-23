package factories.abstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) throws Exception {
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        HotDrink hotDrink = hotDrinkMachine.makeDrink();
        hotDrink.consume();
    }
}
