package pazet;

public class Item extends Game {
    String name;
    String description;
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void showInfo() {
        System.out.println("Item: " + name);
        System.out.println("Description: " + description);
    }
}
