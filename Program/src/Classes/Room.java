package Classes;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int _roomID;
    int _maxCapacity;
    int _currentCapacity;

    List <Movie> _movies = new ArrayList<>();

    public Room(int roomID, int capacity) {
        this._roomID = roomID;
        this._maxCapacity = capacity;
    }

    public void roomInfo() {
        System.out.println("Room ID: " + this._roomID);
        System.out.println("Capacity: " + this._maxCapacity);
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
        double emptySeatsPercentage = (double) this._currentCapacity / this._maxCapacity;
        emptySeatsPercentage *= 100;
        return emptySeatsPercentage;
    }

    public void sellTicket(Movie movie) {
        if(this._currentCapacity < this._maxCapacity) {
            this._currentCapacity++;
            movie.sellTicket();
        } else {
            System.out.println("Room is full");
        }
    }
}
