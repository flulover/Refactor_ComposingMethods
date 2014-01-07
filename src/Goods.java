/**
 * Created by twer on 1/7/14.
 */
public class Goods {
    private int BasePrice;
    private int AddedPrice;

    public boolean isPreciousGood(){
        int price = getPrice();
        return price > 10000;
    }

    public int getPrice(){
        return BasePrice + AddedPrice;
    }
}
