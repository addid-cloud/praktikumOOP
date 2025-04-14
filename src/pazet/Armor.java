package pazet;

public class Armor extends Item {
    int defense;
    String type;
    
    public Armor(String name, String description, int defense, String type) {
        super(name, description);
        this.defense = defense;
        this.type = type;
    }
    
    public void showInfo() {
        super.showInfo();
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + type);
    }
    
}
