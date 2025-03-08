package peretemuan2.Movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie satu = new Movie();
        satu.title = "ayat ayat cinta";
        satu.genre = "islami";
        satu.rating = 4;
        Movie dua = new Movie();
        dua.title = "the davinci code";
        dua.genre = "misteri";
        dua.rating = 4;
        dua.playIt();
        Movie tiga = new Movie();
        tiga.title = "sang pencerah";
        tiga.genre = "islami";
        tiga.rating = 5;
    }
}
