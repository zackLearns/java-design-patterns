package chainOfResponsibility.brokerChain;

import static chainOfResponsibility.brokerChain.Argument.*;

public class Creature {

    private Game game;
    public String name;
    public int baseAttack, baseDefense;

    public Creature(Game game, String name, int baseAttack, int baseDefense) {
        this.game = game;
        this.name = name;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }

    public int getAttack() {
        Query query = new Query(name, ATTACK, baseAttack);
        game.queries.fire(query);
        return query.result;
    }

    public int getDefense() {
        Query query = new Query(name, DEFENSE, baseDefense);
        game.queries.fire(query);
        return query.result;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "game=" + game +
                ", name='" + name + '\'' +
                ", attack=" + getAttack() +
                ", defense=" + getDefense() +
                '}';
    }
}
