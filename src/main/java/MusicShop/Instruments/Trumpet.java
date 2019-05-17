package MusicShop.Instruments;

public class Trumpet extends Instrument {
    private String trumpetType;

    public Trumpet(String name, int quantity, double sellingPrice, double buyingCost, String material, String type, String trumpetType) {
        super(name, quantity, sellingPrice, buyingCost, material, type);
        this.trumpetType = trumpetType;
    }

    public String getTrumpetType() {
        return trumpetType;
    }
}
