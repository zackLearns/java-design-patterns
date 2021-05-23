package singleton.unitTestable;

import java.util.List;

public class ConfigurableRecordFinder {

    private Database database;

    public ConfigurableRecordFinder(Database database) {
        this.database = database;
    }

    public int getTotalPopulation(List<String> names) {
        int totalPopulation = 0;
        for(String name : names) {
            totalPopulation += database.getPopulation(name);
        }
        return totalPopulation;
    }
}
