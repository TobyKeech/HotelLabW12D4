import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Room> rooms;
    Guest aneeqa;
    Room room;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        rooms = new ArrayList<>();
        hotel = new Hotel(rooms);
        aneeqa = new Guest("Aneeqa");
        guests = new ArrayList<>();
        room = new Bedroom(RoomType.DOUBLE, guests, 101);
        rooms.add(room);
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(aneeqa, room);
        assertEquals(1, room.noOfGuests());
    }

    @Test
    public void canCheckOut(){
        hotel.checkIn(aneeqa, room);
        hotel.checkOut(aneeqa, room);
        assertEquals(0, room.noOfGuests());
    }

    @Test
    public void cantCheckInIfFull(){
        hotel.checkIn(aneeqa,room);
        hotel.checkIn(aneeqa,room);
        hotel.checkIn(aneeqa,room);
        assertEquals(2, room.noOfGuests());
    }
}
