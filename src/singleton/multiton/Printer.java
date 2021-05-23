package singleton.multiton;

import java.util.HashMap;

/**
 * This printer implements a multiton pattern. i.e. Limited number of instances.
 */
public class Printer {

    private static int instanceCount = 0;
    private static HashMap<Subsystem, Printer> instances = new HashMap<>();

    private Printer() {
        instanceCount++;
        System.out.println("Instances created so far: " + instanceCount);
    }

    public static Printer get(Subsystem subsystem) {
        if(instances.containsKey(subsystem))
            return instances.get(subsystem);

        Printer instance = new Printer();
        instances.put(subsystem, instance);
        return instance;
    }
}
