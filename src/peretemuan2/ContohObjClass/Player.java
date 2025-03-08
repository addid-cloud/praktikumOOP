package peretemuan2.ContohObjClass;

public class Player {
    public String name;
    public int ATKPoin;
    public int health;
    public Item[] items = new Item[10];
    public Player(String name,  int health, int ATKPoin) {
        this.name = name;
        this.ATKPoin = ATKPoin;
        this.health = health;
    }
    public void attack(Enemy target){
        target.takeDamage(ATKPoin);
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health <= 0){
            System.out.println(name + " mati");
        }
    }
    public void useItem(int index, Player target){
        items[index].use(target);
    }
    public void addItem(Item item){
        for (int i = 0; i < items.length; i++) {
            if(items[i] == null){
                items[i] = item;
                break;
            }
        }
    }
}
