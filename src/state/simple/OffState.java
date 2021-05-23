package state.simple;

public class OffState extends State {

    public OffState() {
        System.out.println("Light turned off.");
    }

    @Override
    void on(LightSwitch lightSwitch) {
        System.out.println("Switching light on...");
        lightSwitch.setState(new OnState());
    }
}
