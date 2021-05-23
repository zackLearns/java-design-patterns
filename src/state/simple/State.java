package state.simple;

public class State {

    void on(LightSwitch lightSwitch) {
        System.out.println("Light is on.");
    }

    void off(LightSwitch lightSwitch) {
        System.out.println("Light is off.");
    }
}
