import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    ArrayList<Guest> bedroomGuests;
    ArrayList<Guest> conferenceGuests;
    Guest guest;
    Guest guest2;


    @Before
    public void before(){
        bedroomGuests = new ArrayList<>();
        conferenceGuests = new ArrayList<>();
        bedroom = new Bedroom(RoomType.SINGLE, bedroomGuests, 2);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, conferenceGuests, "Toby's Room");
        guest = new Guest("Toby");
        guest2  = new Guest("Aneeqa");
//        lewis = new Guest("Lewis");
//        geri = new Guest("Geri");
//        rodger = new Guest("Rodger");
//        greg = new Guest("Gregorio");
//        bedroomGuests.add(toby);
//        conferenceGuests.add(aneeqa);
//        bedroomGuests.add(lewis);
//        bedroomGuests.add(geri);
//        conferenceGuests.add(rodger);
//        conferenceGuests.add(greg);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void singleHasValueToo() {
        assertEquals(1, bedroom.getCapacityFromEnum());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.noOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest);
        assertEquals(1 ,bedroom.noOfGuests());
    }



}

