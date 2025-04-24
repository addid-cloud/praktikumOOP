package sinau;
class Main {
    public static void main(String[] args) {
        // Create a new game object
        Game game = new Game("Action", "Halo", "Bungie", "Microsoft");
        Game game2 = new Game("Adventure", "Zelda", "Nintendo", "Nintendo");
        Game game3 = new Game("RPG", "Final Fantasy", "Square Enix", "Square Enix");
        Game game4 = new Game("Simulation", "The Sims", "Maxis", "Electronic Arts");
        Manusia key = new Manusia("key", "faza", 19, "mahasiswa");
        System.out.println(game.genre);
        System.out.println(game.title);
        System.out.println(key.nama);
        // Print the game details
        System.out.println("Game Genre: " + "action");
        System.out.println("Game Title: " + "the sims4");
        System.out.println("Game Developer: " + "ea");
        System.out.println("Game Publisher: " + "microsoft");
        game.printInfo(); // print method
        game2.printInfo();
        game3.printInfo();
        game4.printInfo();
    }
}