package singleton.unitTestable;

import java.util.Dictionary;
import java.util.Hashtable;

public class SingletonDatabase implements Database {

    private Dictionary<String, Integer> capitals = new Hashtable<>();
    private static int instanceCount = 0;

    private SingletonDatabase() {
        instanceCount++;
        System.out.println("Initializing database...");
    }

    private static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public int getPopulation(String name) {
        return capitals.get(name);
    }
}
