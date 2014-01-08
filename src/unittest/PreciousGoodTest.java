package unittest;

import example.PreciousGoods;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by twer on 1/8/14.
 */
public class PreciousGoodTest extends TestCase {
    @Test
    public void testPrice(){
        PreciousGoods preciousGoods = new PreciousGoods();
        preciousGoods.setQuantity(600);
        preciousGoods.setItemPrice(100);
        assertEquals(59600.0, preciousGoods.price());
    }

    @Test
    public void testDiscount(){
        PreciousGoods preciousGoods = new PreciousGoods();
        assertEquals(94, preciousGoods.discount(100, 5, 10001));

    }
}
