package pazet;

public class Enemy extends Entity {
    public Enemy(String name, int hp, int damage, int defense) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
    }    
    public void attack(Entity entity) {
        entity.takeDamage(damage);
        if(entity.hp <= 0) {
            System.out.println(entity.name + " telah mati!");
        } else {
            System.out.println(entity.name + " tersisa " + entity.hp + " HP.");
        }
    }    
    public void takeDamage(int damage) {
        int totalDamage = damage - defense;
        if (totalDamage < 0) {
            totalDamage = 0;
        }
        super.takeDamage(totalDamage); 
    }
    
}
