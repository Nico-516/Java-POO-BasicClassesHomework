package Classes;

public class Movie {
    String _title;
    int _durationMinutes;
    String _genre;
    String _ageRating;
    int _releaseYear;
    int _allSoldTickets;

    public Movie(String title, int durationMinutes, String genre, String ageRating, int releaseYear){
        this._title = title;
        this._durationMinutes = durationMinutes;
        this._genre = genre;
        this._ageRating = ageRating;
        this._releaseYear = releaseYear;
    }

    public void sellTicket(){
        this._allSoldTickets++;
    }

    public int getAllSoldTickets() {
        return this._allSoldTickets;
    }
}
