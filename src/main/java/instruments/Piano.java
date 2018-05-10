package instruments;

import instruments.Instrument;

public class Piano extends Instrument {

    private int numberOfKeys;
    private int numberOfPedals;
    private String style;

    public Piano(String material, String colour, String family, int numberOfKeys, int numberOfPedals, String style) {
        super(material, colour, family);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = numberOfPedals;
        this.style = style;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public String getStyle() {
        return style;
    }
}
