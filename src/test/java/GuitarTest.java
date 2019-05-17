import MusicShop.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Fender", 2, 200.00, 150.00, "Mahogany", "String", 6);
    }

    @Test
    public void hasName() {
        assertEquals("Fender", guitar.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(2, guitar.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(200.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(150.00, guitar.getBuyingCost(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }
}
