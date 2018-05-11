import instruments.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet1;

    @Before
    public void setUp() throws Exception {
        clarinet1 = new Clarinet("Wood", "Black", "Woodwind", 9);
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(9, clarinet1.getNumberOfKeys());
    }

    @Test
    public void canGetSoundFromPlay() {
        assertEquals("toot toot", clarinet1.play());
    }
}
