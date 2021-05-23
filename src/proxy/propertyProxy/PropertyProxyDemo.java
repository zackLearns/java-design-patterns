package proxy.propertyProxy;

public class PropertyProxyDemo {

    public static void main(String[] args) {
        Creature creature = new Creature();
        creature.setAgility(10);

        System.out.println(creature);
    }
}
