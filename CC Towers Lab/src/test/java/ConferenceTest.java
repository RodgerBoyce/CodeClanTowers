import Guests.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {
    ConferenceRoom newConferenceRoom;
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
        newConferenceRoom = new ConferenceRoom("Conference Room A", 10, guests);
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(50, newConferenceRoom.getCapacity());
    }
}
