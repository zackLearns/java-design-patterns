package proxy.propertyProxy;

public class Creature {

    private Property<Integer> agility = new Property<>(10);

    public Integer getAgility() {
        return agility.getValue();
    }

    public void setAgility(Integer agility) {
        this.agility.setValue(agility);
    }

    @Override
    public String toString() {
        return "Creature{" +
                "agility=" + agility +
                '}';
    }
}
