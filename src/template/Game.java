package template;

public abstract class Game {

    protected int currentPlayer;
    protected final int numPlayer;

    public Game(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public void run() {
        start();
        while(!haveWinner())
            takeTurn();
        System.out.println("Player " + getWinningPlayer() + " wins!");
    }

    protected abstract int getWinningPlayer();
    protected abstract void takeTurn();
    protected abstract boolean haveWinner();
    protected abstract void start();
}
