import MusicShop.Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Getzen", 10, 3000, 2700, "Brass", "woodwind", "Bb");
    }

    @Test
    public void hasName() {
        assertEquals("Getzen", trumpet.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(10, trumpet.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(3000, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(2700, trumpet.getBuyingCost(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("woodwind", trumpet.getType());
    }

    @Test
    public void hasPianoType() {
        assertEquals("Bb", trumpet.getTrumpetType());
    }
}
