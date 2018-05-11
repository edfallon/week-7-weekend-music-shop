import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;
    Guitar guitar1;

    @Before
    public void setUp() throws Exception {
        shop1 = new Shop();
        guitar1 = new Guitar(100, 200, "Wood", "Black", "String", 6, "Acoustic");
    }

    @Test
    public void checkStockArrayStartsEmpty() {
        assertEquals(0, shop1.stockCount());
    }

    @Test
    public void canAddISellItemToStockArray() {
        shop1.addISellItem(guitar1);
        assertEquals(1, shop1.stockCount());
    }

    @Test
    public void canRemoveISellItemFromStock() {
        shop1.addISellItem(guitar1);
        shop1.removeISellItem(guitar1);
        assertEquals(0, shop1.stockCount());
    }

    @Test
    public void canGetTotalPossibleProfit() {
        shop1.addISellItem(guitar1);
        assertEquals(100, shop1.getTotalPossibleProfit());
    }
}
