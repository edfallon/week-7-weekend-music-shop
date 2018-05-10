package instruments;

public class Bongo extends Instrument {

    private String typeOfSkin;

    public Bongo(String material, String colour, String family, String typeOfSkin) {
        super(material, colour, family);
        this.typeOfSkin = typeOfSkin;
    }

    public String getTypeOfSkin() {
        return typeOfSkin;
    }
}
