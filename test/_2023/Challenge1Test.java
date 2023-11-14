package _2023;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruben Blanco
 */
public class Challenge1Test {
    
    public Challenge1Test() {
    }

    /**
     * Tests of ch1 method, of class Challenge1.
     */
    @Test
    public void testCh1_1() {
        System.out.println("Test 1");
        String s = "gato perro perro coche Gato peRRo sol";
        String expResult = "gato2perro3coche1sol1";
        String result = Challenge1.ch1(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCh1_2() {
        System.out.println("Test 2");
        String s = "llaveS casa CASA casa llaves";
        String expResult = "llaves2casa3";
        String result = Challenge1.ch1(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCh1_3() {
        System.out.println("Test 3");
        String s = "taza ta za taza";
        String expResult = "taza2ta1za1";
        String result = Challenge1.ch1(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCh1_4() {
        System.out.println("Test 4");
        String s = "casas casa casasas";
        String expResult = "casas1casa1casasas1";
        String result = Challenge1.ch1(s);
        assertEquals(expResult, result);
    }
    
}
