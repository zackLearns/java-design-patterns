package singleton.staticBlock;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing.");
        File.createTempFile(".", ".");
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            System.err.println("Failed to create singleton.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
