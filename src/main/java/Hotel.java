import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(ArrayList<Room>rooms){
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public Room getRoom(Room chosenRoom){
        for (Room room : this.rooms){
            if (room == chosenRoom) return room;
        }
        return null;
    }

    public void checkIn(Guest newGuest, Room room){
        Room room1 = getRoom(room);
        room1.addGuest(newGuest);
    }

    public void checkOut(Guest byeGuest, Room room){
        Room room1 = getRoom(room);
        room1.removeGuest(byeGuest);
    }

}
