package instruments;

public class Bongo extends Instrument {

    private String typeOfSkin;

    public Bongo(int buyingPrice, int sellingPrice, String material, String colour, String family, String typeOfSkin) {
        super(buyingPrice, sellingPrice, material, colour, family);
        this.typeOfSkin = typeOfSkin;
    }

    public String getTypeOfSkin() {
        return typeOfSkin;
    }

    public String play(){
        return "bum de bum";
    }
}
