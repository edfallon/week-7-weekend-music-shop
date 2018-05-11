package instruments;

public class Saxophone extends Instrument{

    private int numberOfKeys;
    private String style;

    public Saxophone(int buyingPrice, int sellingPrice, String material, String colour, String family, int numberOfKeys, String style) {
        super(buyingPrice, sellingPrice, material, colour, family);
        this.numberOfKeys = numberOfKeys;
        this.style = style;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getStyle() {
        return style;
    }

    public String play(){
        return "parp parp parp";
    }
}
