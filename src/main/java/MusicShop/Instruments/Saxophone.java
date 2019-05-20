package MusicShop.Instruments;

public class Saxophone extends Instrument {
    private String key;

    public Saxophone(String name, int quantity, double sellingPrice, double buyingCost, String material, String type, String key) {
        super(name, quantity, sellingPrice, buyingCost, material, type);
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
