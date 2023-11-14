
package _2023;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruben Blanco
 */
public class Challenge2Test {
    
    public Challenge2Test() {
    }

    /**
     * Test of ch2 method, of class Challenge2.
     */
    @Test
    public void testCh2() {
        System.out.println("Test 1");
        String s = "&##&*&@&";
        String expResult = "0243";
        String result = Challenge2.ch2(s);
        assertEquals(expResult, result);
    }
    
}
