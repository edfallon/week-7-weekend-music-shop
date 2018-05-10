public class Guitar extends Instrument{

    private int numberOfStrings;
    private String style;

    public Guitar(String material, String colour, String family, int numberOfStrings, String style) {
        super(material, colour, family);
        this.numberOfStrings = numberOfStrings;
        this.style = style;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getStyle() {
        return style;
    }
}
