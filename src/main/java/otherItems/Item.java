package otherItems;

public abstract class Item {

    private int buyingPrice;
    private int sellingPrice;
    private String description;

    public Item(int buyingPrice, int sellingPrice, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public String getDescription() {
        return description;
    }
}
