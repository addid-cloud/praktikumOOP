package peretemuan2.ContohObjClass;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player1",100,20);
        Enemy enemy1 = new Enemy("setan", 100, 10);
        Item item1 = new Item();
        item1.name = "swordohh";
        item1.Effect = "menambah 50 atk poin";
        player1.ATKPoin +=50;
        player1.items[0] = item1;
        player1.takeDamage(50);
        System.out.println(player1.health);
        player1.useItem(0, player1);
        enemy1.attack(player1);
        player1.attack(enemy1);
    }
}
