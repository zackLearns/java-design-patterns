package chainOfResponsibility.brokerChain;

public class BrokerChainDemo {

    public static void main(String[] args) throws Exception {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

        System.out.println(goblin);

        // modifiers can be piled up
        IncreaseDefenseModifier increaseDefenseModifier = new IncreaseDefenseModifier(game, goblin);

        try (DoubleAttackModifier doubleAttackModifier = new DoubleAttackModifier(game, goblin)) {
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}
