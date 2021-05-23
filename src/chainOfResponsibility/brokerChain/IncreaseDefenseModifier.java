package chainOfResponsibility.brokerChain;

import static chainOfResponsibility.brokerChain.Argument.*;
import static chainOfResponsibility.brokerChain.Argument.DEFENSE;

public class IncreaseDefenseModifier extends CreatureModifier {

    public IncreaseDefenseModifier(Game game, Creature creature) {
        super(game, creature);

        game.queries.subscribe(query -> {
            if(query.creatureName.equals(creature.name)
                    && query.argument == DEFENSE)
                query.result += 12;
        });
    }
}
