import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;

    @Before
    public void setUp() throws Exception {
        piano1 = new Piano("Mahogany", "Brown", "Keyboard", 88, 3, "Grand");
    }

    @Test
    public void getMaterial() {
        assertEquals("Mahogany", piano1.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", piano1.getColour());
    }

    @Test
    public void canGetFamily() {
        assertEquals("Keyboard", piano1.getFamily());
    }

    @Test
    public void canGetNUmberOfkeys() {
        assertEquals(88, piano1.getNumberOfKeys());
    }

    @Test
    public void canGetNumberOfPedals() {
        assertEquals(3, piano1.getNumberOfPedals());
    }

    @Test
    public void canGetStyle() {
        assertEquals("Grand", piano1.getStyle());
    }
}
