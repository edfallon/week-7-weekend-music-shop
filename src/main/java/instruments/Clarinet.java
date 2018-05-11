package instruments;

public class Clarinet extends Instrument {

    private int numberOfKeys;

    public Clarinet(int buyingPrice, int sellingPrice, String material, String colour, String family, int numberOfKeys) {
        super(buyingPrice, sellingPrice, material, colour, family);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "toot toot";
    }
}
