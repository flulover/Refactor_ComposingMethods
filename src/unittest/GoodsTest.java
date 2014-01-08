package unittest;

import example.Goods;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by twer on 1/8/14.
 */
public class GoodsTest extends TestCase {
    @Test
    public void testIsPreciousGood(){
        Goods goods = new Goods();
        goods.setBasePrice(9000);
        goods.setAddedPrice(1001);
        assertTrue(goods.isPreciousGood());
    }
}
