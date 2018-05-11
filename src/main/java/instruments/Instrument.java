package instruments;

public abstract class Instrument implements IPlay{

    private String material;
    private String colour;
    private String family;

    public Instrument(String material, String colour, String family) {
        this.material = material;
        this.colour = colour;
        this.family = family;
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
