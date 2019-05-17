import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steinway", 1, 2000, 1800, "Maple wood", "percussion", "Upright");
    }

    @Test
    public void hasName() {
        assertEquals("Steinway", piano.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(1, piano.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2000, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(1800, piano.getBuyingCost(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Maple wood", piano.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("percussion", piano.getType());
    }

    @Test
    public void hasPianoType() {
        assertEquals("Upright", piano.getPianoType());
    }
}
