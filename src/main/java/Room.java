import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room( RoomType roomType, ArrayList<Guest> guests){
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public int noOfGuests(){
       return this.getGuests().size();
    }

    public void addGuest(Guest guest)
    {if (this.hasCapacity())
        {this.guests.add(guest);}
    }

    public boolean hasCapacity(){
        return this.getCapacityFromEnum() > noOfGuests();
    }

    public void removeGuest(Guest chosenGuest){
        this.guests.removeIf(guest -> guest == chosenGuest);
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getCapacityFromEnum(){
        return this.roomType.getCapacity();
    }


}
