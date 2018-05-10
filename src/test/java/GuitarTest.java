import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void setUp() throws Exception {
        guitar1 = new Guitar("Wood", "Black", "String", 6, "Acoustic");
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar1.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", guitar1.getColour());
    }

    @Test
    public void canGetFamily() {
        assertEquals("String", guitar1.getFamily());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar1.getNumberOfStrings());
    }

    @Test
    public void canGetStyle() {
        assertEquals("Acoustic", guitar1.getStyle());
    }
}
