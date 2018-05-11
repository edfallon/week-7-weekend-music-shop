import org.junit.Before;
import org.junit.Test;
import otherItems.DrumStick;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick(10, 30, "Set of two drumsticks");
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(10, drumStick.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(30, drumStick.getSellingPrice());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Set of two drumsticks", drumStick.getDescription());
    }
}
