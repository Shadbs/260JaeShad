/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package besttwoyears.control;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shad
 */
public class prepDayTest {
    
    public prepDayTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of prepDay method, of class prepDay.
     */
    @Test
    public void testPrepDay() {
        System.out.println("prepDay");
        char choice = 'a';
        double cFund = 10.0;
        double HP = 10.0;
        prepDay instance = new prepDay();
        double newFund = 4.7;
        double newHP = 30;
        double[] results =instance.prepDay(choice, cFund, HP);
        assertEquals(results[0], newFund, 0.1);
        assertEquals(results[1], newHP, 0.1);
        
        System.out.println("prepDay");
        choice = 'b';
        instance = new prepDay();
        newFund = 7;
        newHP = 20;
        results =instance.prepDay(choice, cFund, HP);
        assertEquals(results[0], newFund, 0.1);
        assertEquals(results[1], newHP, 0.1);
        
        System.out.println("prepDay");
        choice = 'c';
        instance = new prepDay();
        newFund = 2.58;
        newHP = 40;
        results =instance.prepDay(choice, cFund, HP);
        assertEquals(results[0], newFund, 0.1);
        assertEquals(results[1], newHP, 0.1);

        
    }
    
}
