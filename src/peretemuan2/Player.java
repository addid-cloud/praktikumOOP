package peretemuan2;

public class  Player {
    int poin;
    String name;
    Player(String name){
        this.name = name;
    }
    public int guess(){
        int ran = (int)(Math.random() *10);
        return ran;
    }
}
