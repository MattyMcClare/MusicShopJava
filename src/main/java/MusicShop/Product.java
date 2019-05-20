package MusicShop;

public abstract class Product {
    private String name;
    private int quantity;
    private double sellingPrice;
    private double buyingCost;

    public Product(String name, int quantity, double sellingPrice, double buyingCost) {
        this.name = name;
        this.quantity = quantity;
        this.sellingPrice = sellingPrice;
        this.buyingCost = buyingCost;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingCost() {
        return buyingCost;
    }
}
