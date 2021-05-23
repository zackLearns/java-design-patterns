package chainOfResponsibility.methodChain;

public class IncreaseDefenseModifier extends CreatureModifier {

    private int defenseIncrease = 12;

    public IncreaseDefenseModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.name + "'s defense by " + defenseIncrease);
        creature.defense += 12;
        super.handle();
    }
}
