import MusicShop.Accessories.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void setUp(){
        musicSheet = new MusicSheet("Score", 14, 20, 17);
    }

    @Test
    public void hasName() {
        assertEquals("Score", musicSheet.getName());
    }

    @Test
    public void hasQuantity() {
        assertEquals(14, musicSheet.getQuantity());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(20, musicSheet.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingCost() {
        assertEquals(17, musicSheet.getBuyingCost(), 0.01);
    }
}
