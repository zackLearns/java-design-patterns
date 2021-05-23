package chainOfResponsibility.methodChain;

public class MethodChainDemo {

    public static void main(String[] args) {

        Creature goblin = new Creature("goblin", 10 ,10);
        System.out.println(goblin);

        CreatureModifier root = new CreatureModifier(goblin);

        System.out.println("Let's double " + goblin.name + "'s attack...");
        root.add(new DoubleAttackModifier(goblin));

        System.out.println("Let's increase " + goblin.name + "'s defense...");
        root.add(new IncreaseDefenseModifier(goblin));

        root.add(new NoBonusesModifier(goblin));
        System.out.println("Attempting to increase " + goblin.name + "'s defense after NoBonusesModifier...");
        root.add(new DoubleAttackModifier(goblin));

        root.handle();
        System.out.println(goblin);


    }
}
