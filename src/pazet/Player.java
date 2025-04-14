package pazet;

public class Player extends Entity {
    public Player(String name, int hp, int damage, int defense) {
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
    public void useWeapon(Weapon weapon) {
        System.out.println(name + " menggunakan senjata " + weapon.name + "!");
        damage += weapon.damage;
        System.out.println("Damage meningkat menjadi " + damage);
    }
    public void useArmor(Armor armor) {
        System.out.println(name + " menggunakan armor " + armor.name + "!");
        defense += armor.defense;
        System.out.println("Defense meningkat menjadi " + defense);
}
    public void usePotion(Potion potion) {
        System.out.println(name + " menggunakan potion " + potion.name + "!");
        hp += potion.healAmount;
        System.out.println("HP meningkat menjadi " + hp);
    }
}
