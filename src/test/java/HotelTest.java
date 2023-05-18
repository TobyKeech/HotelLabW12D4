import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Room> rooms;
    Guest aneeqa;
    Bedroom room;
    ArrayList<Guest> guests;
    ArrayList<Booking> bookings;

    @Before
    public void before(){
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
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

   @Test
    public void createBooking(){
    Booking booking;
    booking = hotel.bookRoom(room, 5);
    assertEquals(5, booking.getNumberOfNights());
}

    @Test
    public void givesCost(){
        Booking booking = hotel.bookRoom(room, 2);
        assertEquals(400, booking.totalCost());
    }
}
