package state.simple;

public class OnState extends State {

    public OnState() {
        System.out.println("Light turned on.");
    }

    @Override
    void off(LightSwitch lightSwitch) {
        System.out.println("Switching light off...");
        lightSwitch.setState(new OffState());
    }
}
