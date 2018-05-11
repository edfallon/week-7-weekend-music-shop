package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String style;

    public Guitar(int buyingPrice, int sellingPrice, String material, String colour, String family, int numberOfStrings, String style) {
        super(buyingPrice, sellingPrice, material, colour, family);
        this.numberOfStrings = numberOfStrings;
        this.style = style;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getStyle() {
        return style;
    }

    public String play(){
        return "Twing Twang";
    }
}
