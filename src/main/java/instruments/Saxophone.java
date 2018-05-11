package instruments;

public class Saxophone extends Instrument{

    private int numberOfKeys;
    private String style;

    public Saxophone(String material, String colour, String family, int numberOfKeys, String style) {
        super(material, colour, family);
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
        return "";
    }
}
