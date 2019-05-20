import MusicShop.Accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
    GuitarString guitarString;

    @Before
    public void setUp(){
        guitarString = new GuitarString("Acoustic", 34, 11, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Acoustic", guitarString.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(34, guitarString.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(11, guitarString.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(4, guitarString.getBuyingCost(), 0.01);
    }
}
