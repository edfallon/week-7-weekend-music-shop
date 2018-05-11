import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone1;

    @Before
    public void setUp() throws Exception {
        saxophone1 = new Saxophone(200, 350, "Brass", "Gold", "Brass", 10, "Tenor");

    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(10, saxophone1.getNumberOfKeys());
    }

    @Test
    public void canGetStyle() {
        assertEquals("Tenor", saxophone1.getStyle());
    }

    @Test
    public void canGetSoundFromPlay() {
        assertEquals("parp parp parp", saxophone1.play());
    }
}
