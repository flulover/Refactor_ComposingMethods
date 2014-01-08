package example;

/**
 * Created by twer on 1/7/14.
 */
public class Goods {
    private int _basePrice;
    private int _addedPrice;

    public boolean isPreciousGood(){
        int price = getPrice();
        return price > 10000;
    }

    public int getPrice(){
        return _basePrice + _addedPrice;
    }

    public void setBasePrice(int basePrice) {
        this._basePrice = basePrice;
    }

    public void setAddedPrice(int addedPrice) {
        this._addedPrice = addedPrice;
    }
}
