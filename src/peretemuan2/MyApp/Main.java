package peretemuan2.MyApp;

public class Main {
    public static void main(String[] args) {
        Movie[] allMovies = {
            new Movie("interstellar", "Sci-Fi"),
            new Movie("ao no exorcist", "Action"),
            new Movie("amazing spiderman", "Action"),
            new Movie("amazing spiderman 2", "Action"),
            new Movie("amazing spiderman 3", "Action"),
            new Movie("the queens gambit", "Drama"),
            new Movie("peaky blinders", "Drama"),
            new Movie("the matrix", "Sci-Fi"),
            new Movie("Adventure Time", "Adventure"),
            new Movie("Money Heist", "Action"),
            new Movie("The Dark Knight", "Action"),
            new Movie("Stranger Things", "Adventure"),
            new Movie("The Witcher", "Adventure"),
            new Movie("Breaking Bad", "Drama"),
            new Movie("The Godfather", "Drama"),
            new Movie("the thory of everythings", "Drama"),
            new Movie("The Lord of the Rings", "Adventure"),
            new Movie("Itaewon Class", "Drama"),
            new Movie("Dan Dan Dan", "Action"),
            new Movie("Spy X Family", "Adventure"),
            new Movie("The Avengers", "Action"),
            new Movie("kaiju no 8", "Action"),  
            new Movie("Assasination classRoom", "Action"),
        };

        User user = new User("addid", 10);
        user.rateMovie(allMovies[0], 5); // interstellar (Sci-Fi)
        user.rateMovie(allMovies[6], 5); // peaky blinders (Drama)
        user.rateMovie(allMovies[7], 2); // the matrix (Sci-Fi)
        

        RecomenderSystem recommender = new RecomenderSystem(allMovies);
        Movie recommended = recommender.getRecommendedMovie(user);

        if (recommended != null) {
            System.out.println(" Rekomendasi untuk " + user.getUsername() + ": " + recommended.getTitle() + " (" + recommended.getGenre() + ")");
        } else {
            System.out.println("Tidak ada rekomendasi tersedia.");
        }
    }
}
