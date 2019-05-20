package MusicShop.Instruments;

import MusicShop.Product;

public abstract class Instrument extends Product {

    private String material;
    private String type;

    public Instrument(String name, int quantity, double sellingPrice, double buyingCost, String material, String type) {
        super(name, quantity, sellingPrice, buyingCost);
        this.material = material;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }
}
