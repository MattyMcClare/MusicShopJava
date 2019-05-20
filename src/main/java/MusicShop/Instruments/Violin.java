package MusicShop.Instruments;

public class Violin extends Instrument {
    private int numberOfStrings;

    public Violin(String name, int quantity, double sellingPrice, double buyingCost, String material, String type, int numberOfStrings) {
        super(name, quantity, sellingPrice, buyingCost, material, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
