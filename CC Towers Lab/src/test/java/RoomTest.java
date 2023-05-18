import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room roomVariable;

    @Before
    public void setUp(){
        roomVariable = new Room(RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, roomVariable.getRoomType());
    }

    @Test
    public void doubleHasValue2(){
        assertEquals(2, roomVariable.getValueFromEnum());
    }



}
