package Classes;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int _roomID;
    int _capacity;

    List <Movie> _movies = new ArrayList<>();

    public Room(int roomID, int capacity) {
        this._roomID = roomID;
        this._capacity = capacity;
    }

    public void roomInfo() {
        System.out.println("Room ID: " + this._roomID);
        System.out.println("Capacity: " + this._capacity);
    }

    public void addMovie(Movie movie) {
        this._movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        this._movies.remove(movie);
    }

    public List<Movie> getMovies() {
        return this._movies;
    }

    public double emptySeatsPercentage(Movie movie){
        double emptySeatsPercentage = movie.getAllSoldTickets() / this._capacity;
        emptySeatsPercentage *= 100;
        return emptySeatsPercentage;
    }

    public void sellTicket(Movie movie) {

        movie.sellTicket();
    }
}
