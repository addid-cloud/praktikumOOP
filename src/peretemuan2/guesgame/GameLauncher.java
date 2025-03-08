package peretemuan2.guesgame;

public class GameLauncher{
    public static void main(String[] args) {
        GuessGame game  = new GuessGame();
        Player winner = game.startGame(10);
        System.out.println(winner.name);
    }
}