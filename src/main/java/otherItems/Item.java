package otherItems;

import instruments.ISell;

public abstract class Item implements ISell {

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

    public int calculateMarkup(){
        return sellingPrice -= buyingPrice;
    }
}
