package state.handmade;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.AbstractMap.SimpleEntry;
import static state.handmade.State.*;
import static state.handmade.Trigger.*;


public class PhoneCallDemo {

    private static Map<State, List<SimpleEntry<Trigger, State>>> rules = new HashMap<>();
    private static State currentState = OFF_HOOK;
    private static State exitState = ON_HOOK;

    static {
        rules.put(OFF_HOOK, Arrays.asList(
                new SimpleEntry<>(CALL_DIALED, CONNECTING),
                new SimpleEntry<>(STOP_USING_PHONE, ON_HOOK))
        );
        rules.put(CONNECTING, Arrays.asList(
                new SimpleEntry<>(HUNG_UP, OFF_HOOK),
                new SimpleEntry<>(CALL_CONNECTED, CONNECTED)
        ));
        rules.put(CONNECTED, Arrays.asList(
                new SimpleEntry<>(LEFT_MESSAGE, OFF_HOOK),
                new SimpleEntry<>(HUNG_UP, OFF_HOOK),
                new SimpleEntry<>(PLACED_ON_HOLD, ON_HOLD)
        ));
        rules.put(ON_HOLD, Arrays.asList(
                new SimpleEntry<>(TAKEN_OFF_HOLD, CONNECTED),
                new SimpleEntry<>(HUNG_UP, OFF_HOOK)
        ));
    }

    public static void main(String[] args) {

        BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in)
        );

        while(true) {
            System.out.println("The phone is currently " + currentState);
            System.out.println("Select a trigger: ");

            for(int i = 0; i < rules.get(currentState).size(); i++) {
                Trigger trigger = rules.get(currentState).get(i).getKey();
                System.out.println("" + i + ". " + trigger);
            }

            boolean parseOK;
            int choice = 0;
            do {

                try {
                    System.out.println("Please enter you choice: ");
                    choice = Integer.parseInt(console.readLine());
                    parseOK = choice >= 0 && choice < rules.get(currentState).size();
                } catch(Exception e) {
                    parseOK = false;
                }

            } while(!parseOK);

            currentState = rules.get(currentState).get(choice).getValue();
            if(currentState == exitState) break;
        }
        System.out.println("Done!");
    }
}
