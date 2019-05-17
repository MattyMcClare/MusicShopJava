import MusicShop.Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void setUp() {
        violin = new Violin("Stradivarius", 4, 6000000, 5998000, "Spruce wood", "stringed", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Stradivarius", violin.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(4, violin.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(6000000, violin.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(5998000, violin.getBuyingCost(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Spruce wood", violin.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("stringed", violin.getType());
    }
}
