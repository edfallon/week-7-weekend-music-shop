package shop;

import instruments.Guitar;
import instruments.ISell;
import otherItems.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockArray;

    public Shop() {
        this.stockArray = new ArrayList<>();
    }

    public int stockCount(){
        return this.stockArray.size();
    }


    public void addISellItem(ISell iSell) {
        this.stockArray.add(iSell);
    }

    public void removeISellItem(ISell iSell) {
        this.stockArray.remove(iSell);
    }

    public int getTotalPossibleProfit() {
        int total = 0;
        for (ISell isell : stockArray){
             total += isell.calculateMarkup();
        }

        return total;
    }
}
