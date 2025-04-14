package pazet;

public class Entity extends Game {
    int hp;
    int defense;
    String name;
    int damage;
    public void takeDamage(int damage) {
        this.hp -= damage;
    }    
    public void walk() {
        System.out.println(name + "berjalan... ");
    }
    public void jump() {
        System.out.println(name + "melompat... ");
    }
}
