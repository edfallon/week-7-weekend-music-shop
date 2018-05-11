package shop;

import instruments.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockArray;

    public Shop() {
        this.stockArray = new ArrayList<>();
    }

    public int stockCount(){
        return this.stockArray.size();
    }
}
