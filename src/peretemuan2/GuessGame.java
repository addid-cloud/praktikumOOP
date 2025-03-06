package peretemuan2;

public class GuessGame {
    Player p1 = new Player("player 1");
    Player p2 = new Player("player 2");
    Player p3 = new Player("player 3");
    Player seri = new Player("seri");
    public Player startGame(int mainX){
        for (int i = 0; i <= mainX ; i++) {
            
            int target = (int) (Math.random() *10);
            if(target == p1.guess()){
                p1.poin +=1;
            }
            if(target == p2.guess()){
                p2.poin +=1;
            }
            if(target == p3.guess()){
                p3.poin +=1;
            }
        }
        return (p1.poin > p2.poin && p1.poin > p3.poin) ? p1 : (p2.poin > p1.poin && p2.poin > p3.poin) ? p2 :(p3.poin > p1.poin && p3.poin > p2.poin) ? p3 : seri;
    }
}
