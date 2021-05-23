package factories.abstractFactory;

import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.util.AbstractMap.SimpleEntry;

public class HotDrinkMachine {

    private List<SimpleEntry<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {

        Set<Class<? extends HotDrinkFactory>> types = new Reflections("").getSubTypesOf(HotDrinkFactory.class);
        for(Class<? extends HotDrinkFactory> type : types) {
            namedFactories.add(new SimpleEntry<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drinks: ");
        for(int index = 0; index < namedFactories.size(); ++index) {
            SimpleEntry<String, HotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getKey());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = reader.readLine();
            int i, amount;
            if(s != null &&
                (i = Integer.parseInt(s)) >= 0 &&
                (i < namedFactories.size())) {

                System.out.println("Specify amount: ");
                s = reader.readLine();
                if(s != null && (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).getValue().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}
