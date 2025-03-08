package peretemuan2.ContohObjClass;

public class Enemy {
    String name;
    int health;
    int ATKPoin;
    public Enemy(String name, int health, int ATKPoin) {
        this.name = name;
        this.health = health;
        this.ATKPoin = ATKPoin;
    }
    public void attack(Player target){
        target.takeDamage(ATKPoin);
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health <= 0){
            System.out.println(name + " mati");
        }
    }
}
