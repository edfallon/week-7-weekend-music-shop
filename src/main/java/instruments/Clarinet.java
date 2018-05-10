package instruments;

public class Clarinet extends Instrument {

    private int numberOfKeys;

    public Clarinet(String material, String colour, String family, int numberOfKeys) {
        super(material, colour, family);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}