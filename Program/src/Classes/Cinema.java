package Classes;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    String _name;
    String _address;

    List<Room> _rooms = new ArrayList<>();

    public Cinema(String name, String address) {
        this._name = name;
        this._address = address;
    }

    public void addRoom(Room room) {
        this._rooms.add(room);
    }

    public void showRooms() {
        for (Room room : this._rooms) {
            room.roomInfo();
        }
    }
}
