package MusicShop.Instruments;

public class Piano extends Instrument{
    private String pianoType;

    public Piano(String name, int quantity, double sellingPrice, double buyingCost, String material, String type, String pianoType) {
        super(name, quantity, sellingPrice, buyingCost, material, type);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }
}
