package unittest;

import example.Widget;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by twer on 1/8/14.
 */
public class WidgetTest extends TestCase {
    @Test
    public void testValidateSuccess(){
        Widget widget = new Widget();
        widget.setText("Do not see me!");
        widget.Validate();
        assertTrue(widget.isValid());
    }

    @Test
    public void testValidateMinLength(){
        Widget widget = new Widget();
        widget.setText("IamShort");
        widget.Validate();
        assertFalse(widget.isValid());
    }

    @Test
    public void testValidateMaxLength(){
        Widget widget = new Widget();
        String exceededText = null;
        for (int i = 0; i < widget.getMaxLength() + 1; ++i){
            exceededText += "1";
        }

        widget.setText(exceededText);
        widget.Validate();
        assertFalse(widget.isValid());
    }
}
