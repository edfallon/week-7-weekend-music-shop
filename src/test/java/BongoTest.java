import instruments.Bongo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BongoTest {

    Bongo bongo1;

    @Before
    public void setUp() throws Exception {
        bongo1 = new Bongo("Wood", "Green", "Percussion", "Leather");
    }

    @Test
    public void canGetTypeOfSkin() {
        assertEquals("Leather", bongo1.getTypeOfSkin());
    }
}
