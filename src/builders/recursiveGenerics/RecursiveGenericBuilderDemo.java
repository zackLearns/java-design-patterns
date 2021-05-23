package builders.recursiveGenerics;

import static builders.recursiveGenerics.NyPizza.Size.*;
import static builders.recursiveGenerics.Pizza.Topping.*;


public class RecursiveGenericBuilderDemo {

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .addTopping(PEPPER)
                .addTopping(MUSHROOM)
                .sauceInside()
                .build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
