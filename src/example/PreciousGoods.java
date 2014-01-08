package example;

/**
 * Created by twer on 1/7/14.
 */
public class PreciousGoods {
    private int _quantity;
    private int _itemPrice;

    public double price() {
        // price is base price - quantity discount + storage fee
        return _quantity * _itemPrice -
                Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
                Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }

    public int discount (int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }

    public void setQuantity(int _quantity) {
        this._quantity = _quantity;
    }

    public void setItemPrice(int _itemPrice) {
        this._itemPrice = _itemPrice;
    }
}
