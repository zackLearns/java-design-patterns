package chainOfResponsibility.brokerChain;

import static chainOfResponsibility.brokerChain.Argument.*;
import static chainOfResponsibility.brokerChain.Argument.ATTACK;

public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {

    private final int token;

    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);

        token = game.queries.subscribe(query -> {
           if(query.creatureName.equals(creature.name)
                   && query.argument == ATTACK)
               query.result *= 2;
        });
    }


    @Override
    public void close() throws Exception {
        game.queries.unsubscribe(token);
    }
}
