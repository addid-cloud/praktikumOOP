package peretemuan2.MyApp;
// jadi kita buat kelas user dulu kak
public class User {
    //terus kita buat attribut / variblenya yang perlu 
    // btw ini tak buat private biar gak bisa diset dari luar
    private String username; // ini buat nama usernya
    private Movie[] watchedMovie; // ini buat film yang sudah ditonton
    private int[] rating; //ini buat rating film yang sudah ditonton
    private int indexWatchedMovie; // ini buat index film yang sudah ditonton

    public User(String username, int max) { //buat konstruktor biar gampang init awalnya paramnya uname sama panjang array film yang bisa ditonton
        this.watchedMovie = new Movie[max]; //init array film yang sudah ditonton dengan panjang array 
        this.rating = new int[max]; // init array rating film yang sudah ditonton dengan panjang array
        this.indexWatchedMovie = 0; // init index film yang sudah ditonton dengan 0
        this.username = username; // init username dengan username yang diinput di konstruktor
    }

    public void rateMovie(Movie movie, int rating) { //buat method rateMovie yang parameternya movie dan rating buat nambahin film yang sudah ditonton sekalian ratingnya
        try { // ini try catch biar kalo lebih dari max errornya dihandle sama error buatan sendiri
            this.watchedMovie[indexWatchedMovie] = movie; // nambahin film yang sudah ditonton
            this.rating[indexWatchedMovie] = rating; // nambahin rating film yang sudah ditonton
            indexWatchedMovie++;} // nambahin index film yang sudah ditonton
        catch (ArrayIndexOutOfBoundsException e) { // buat kustom errornya
            System.out.println("Film sudah mencapai batas maksimal");
        }
    }
        // terus sisanya getter doang sih kak biar bisa diakses dari luar
    public String getUsername() {
        return username;
    }

    public Movie[] getWatchedMovie() {
        return watchedMovie;
    }

    public int[] getRating() {
        return rating;
    }

    public int getIndexWatchedMovie() {
        return indexWatchedMovie;
    }
}
