import Guests.Guest;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom newBedroom;
    Guest newGuest;
    Guest newGuest2;
    ArrayList<Guest> guests;
    @Before
    public void setUp(){
        newGuest = new Guest("Rodger");
        newGuest2 = new Guest("Greg");
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(newGuest);
        guests.add(newGuest2);
        newBedroom = new Bedroom(guests, RoomType.DOUBLE, 100);
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(2, newBedroom.getCapacity());
    }
}
