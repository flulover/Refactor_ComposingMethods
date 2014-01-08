package unittest;

import example.FindPerson;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by twer on 1/8/14.
 */
public class FindPersonTest extends TestCase {
    @Test
    public void testFindPersonSuccessful(){
        String result = FindPerson.findPerson(new String[]{ "Don", "Mike", "God" });
        assertEquals(result, "Don");
    }

    @Test
    public void testFindPersonFailed(){
        String result = FindPerson.findPerson(new String[]{ "ZhangSan", "Mike", "God" });
        assertNull(result);
    }

}
