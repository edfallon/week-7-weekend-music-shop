import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;

    @Before
    public void setUp() throws Exception {
        shop1 = new Shop();
    }

    @Test
    public void checkStockArrayStartsEmpty() {
        assertEquals(0, shop1.stockCount());
    }
}
