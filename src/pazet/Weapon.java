package pazet;

public class Weapon extends Item{
    int damage;
    int durability;
    String type;
    
    public Weapon(String name, String description, int damage, int durability, String type) {
        super(name, description);
        this.damage = damage;
        this.durability = durability;
        this.type = type;
    }
    
    public void showInfo() {
        super.showInfo();
        System.out.println("Damage: " + damage);
        System.out.println("Durability: " + durability);
        System.out.println("Type: " + type);
    }
}
