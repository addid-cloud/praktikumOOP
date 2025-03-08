package peretemuan2.MyApp;

//nah ini kelas paling penting pada tugas ini fungsinya buat ngasih rekomendasi film ke user
// jadi kita buat kelasnya dulu
public class RecomenderSystem {
    private Movie[] movies; // ini buat array film yang bisa direkomendasikan

    public RecomenderSystem(Movie[] movies) { // ini konstruktornya parameternya array film
        this.movies = movies;
    }

    public String getFavoriteGenre(User user) { // ini method buat ngambil genre favorit user dari rata rata rating film yang sudah ditonton
        //jadi idenya itu kita loop semua film yang sudah ditonton sama ratingnya
        // terus kita hitung rata rata rating film berdasarkan genre
        // contoh nih ya sci-fi={5,6,7} action={4,5,6} trs dirata ratain jadi sci-fi=6 action=5
        // terus kita ambil genre yang rata rata ratingnya paling tinggi
        Movie[] watchedMovies = user.getWatchedMovie(); // ini buat ngambil film yang sudah ditonton
        int[] ratings = user.getRating(); // ini buat ngambil rating film yang sudah ditonton
        int movieCount = user.getIndexWatchedMovie(); // ini buat ngambil jumlah film yang sudah ditonton

        String[] genres = new String[movieCount]; // ini buat array genre film yang sudah ditonton
        int[] genreRatings = new int[movieCount]; // ini buat array rating genre film yang sudah ditonton
        int[] genreCount = new int[movieCount]; // ini buat array jumlah genre film yang sudah ditonton
        int indexGenreBeda = 0; // ini buat index genre film yang sudah ditonton

        for (int i = 0; i < movieCount; i++) { // ini buat loop buat ngambil genre film yang sudah ditonton
            String genre = watchedMovies[i].getGenre(); // masukin genre film yang sudah ditonton ke variabel genre
            int rating = ratings[i]; // masukin rating film yang sudah ditonton ke variabel rating
            boolean genreFound = false; // ini buat ngecek genre film yang sudah ditonton udah ada di array genre apa belum

            for (int j = 0; j < indexGenreBeda; j++) { // ini buat loop buat ngecek genre film yang sudah ditonton udah ada di array genre apa belum
                // kalo udah ada tinggal nambahin rating sama jumlahnya aja
                if (genres[j].equals(genre)) {
                    genreRatings[j] += rating;
                    genreCount[j]++;
                    genreFound = true;
                    break;
                }
            }
            // kalo belum ada masukin ke array genre sama rating sama jumlahnya
            if (!genreFound) {
                genres[indexGenreBeda] = genre;
                genreRatings[indexGenreBeda] = rating;
                genreCount[indexGenreBeda] = 1;
                indexGenreBeda++;
            }
        }

        String favoriteGenre = null;
        double maxAvgRating = 0;
        // ini buat ngambil genre yang rata rata ratingnya paling tinggi
        for (int i = 0; i < indexGenreBeda; i++) {
            double avgRating = (double) genreRatings[i] / genreCount[i];
            if (avgRating > maxAvgRating) {
                maxAvgRating = avgRating;
                favoriteGenre = genres[i];
            }
        }

        return favoriteGenre;
    }

    public Movie getRecommendedMovie(User user) {
        //nah ini method buat ngasih rekomendasi film ke user
        // jadi idenya itu kita ambil genre favorit user
        // terus kita cari film yang belum ditonton sama genre sama dengan genre favorit user
        // terus kita kasih rekomendasi film yang belum ditonton dari genre favorit user
        String favoriteGenre = getFavoriteGenre(user);
        for (Movie movie : movies) { 
            boolean alreadyWatched = false;
            for (Movie watched : user.getWatchedMovie()) {
                if (watched != null && watched.getTitle().equals(movie.getTitle())) {
                    alreadyWatched = true;
                    break;
                }
            }
            if (!alreadyWatched && movie.getGenre().equals(favoriteGenre)) {
                return movie;
            }
        }

        return null;
    }
}
