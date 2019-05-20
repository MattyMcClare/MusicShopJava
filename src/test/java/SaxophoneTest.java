import MusicShop.Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Yamaha", 5, 4000, 3500, "Brass", "woodwind", "Eb");
    }

    @Test
    public void hasName() {
        assertEquals("Yamaha", saxophone.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(5, saxophone.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(4000, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(3500, saxophone.getBuyingCost(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("woodwind", saxophone.getType());
    }

    @Test
    public void hasPianoType() {
        assertEquals("Eb", saxophone.getKey());
    }
}
