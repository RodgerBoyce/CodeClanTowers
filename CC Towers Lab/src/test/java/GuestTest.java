import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest newGuest;
    @Test
    public void hasName(){
        newGuest = new Guest("Mar");
        assertEquals("Mar", newGuest.getName());
    }

}
