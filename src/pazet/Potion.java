package pazet;

public class Potion extends Item {
    int healAmount;
    String type;
    
    public Potion(String name, String description, int healAmount, String type) {
        super(name, description);
        this.healAmount = healAmount;
        this.type = type;
    }
    
    public void showInfo() {
        super.showInfo();
        System.out.println("Heal Amount: " + healAmount);
        System.out.println("Type: " + type);
    }
}
