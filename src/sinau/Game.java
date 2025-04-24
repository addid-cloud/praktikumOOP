package sinau;

public class Game {
    String genre;
    String title;
    String developer;
    String publisher;
    public Game(String genre, String title, String developer, String publisher) {
        this.genre = genre;
        this.title = title;
        this.developer = developer;
        this.publisher = publisher;
    }
    public void printInfo() {
        System.out.println("Game Genre: " + genre);
        System.out.println("Game Title: " + title);
        System.out.println("Game Developer: " + developer);
        System.out.println("Game Publisher: " + publisher);}
}
