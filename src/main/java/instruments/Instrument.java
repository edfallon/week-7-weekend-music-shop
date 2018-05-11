package instruments;

public abstract class Instrument implements IPlay{
    private int buyingPrice;
    private int sellingPrice;
    private String material;
    private String colour;
    private String family;

    public Instrument(int buyingPrice, int sellingPrice, String material, String colour, String family) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.material = material;
        this.colour = colour;
        this.family = family;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getFamily() {
        return family;
    }
}
