import instruments.Bongo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BongoTest {

    Bongo bongo1;

    @Before
    public void setUp() throws Exception {
        bongo1 = new Bongo(30, 120, "Wood", "Green", "Percussion", "Leather");
    }

    @Test
    public void canGetTypeOfSkin() {
        assertEquals("Leather", bongo1.getTypeOfSkin());
    }

    @Test
    public void canGetSoundFromPlay() {
        assertEquals("bum de bum", bongo1.play());
    }
}
