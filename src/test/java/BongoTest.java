import org.junit.Before;
import org.junit.Test;

public class BongoTest {

    Bongo bongo1;

    @Before
    public void setUp() throws Exception {
        bongo = new Bongo("Wood", "Green", "Percussion", "Leather");
    }

    @Test
    public void canGetTypeOfSkin() {
        assertEquals("Leather", bongo1.getTypeOfSkin());
    }
}
