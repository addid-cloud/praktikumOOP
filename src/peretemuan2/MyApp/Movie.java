package peretemuan2.MyApp;
// jadi kita buat kelas movie dulu 
public class Movie {
    // terus kita buat attributnya ada title sama genre
    private String title; // ini buat judul filmnya
    private String genre; // ini buat genre filmnya

    public Movie(String title, String genre) { // ini konstruktornya paramnya title sama genre
        this.title = title; // init title dengan title yang diinput di konstruktor
        this.genre = genre; // init genre dengan genre yang diinput di konstruktor
    }
    // terus sisanya getter doang sih kak biar bisa diakses dari luar
    public String getGenre() {
        return genre;
    }
    public String getTitle() {
        return title;
    }
}
