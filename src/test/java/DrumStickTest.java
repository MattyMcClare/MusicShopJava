import MusicShop.Accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {
    DrumStick drumStick;

    @Before
    public void setUp(){
        drumStick = new DrumStick("Vater", 50, 10, 7);
    }

    @Test
    public void hasName() {
        assertEquals("Vater", drumStick.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(50, drumStick.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(10, drumStick.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(7, drumStick.getBuyingCost(), 0.01);
    }
}
