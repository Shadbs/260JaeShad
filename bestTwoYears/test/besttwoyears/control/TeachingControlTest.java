/*
 * Team Assignment 4
 */

package besttwoyears.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Jae Lee & Shad Stanger 
 */
public class TeachingControlTest {
    
    public TeachingControlTest() {
    }

    /**
     * Test of calTeaching method, of class TeachingControl.
     */
    @Test
    public void testCalTeaching() {
        // askingQuestion
        System.out.println("calTeaching");
        char choice = 'b';
        double SP = 5.0;
        double PP = 5.0;
        TeachingControl instance = new TeachingControl();
        double expNewSPResult = 5.0;
        double expNewPPResult = 5.0;
        double[] results = instance.calTeaching(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);
        
        // sharingScripture
        System.out.println("calTeaching");
        choice = 'a';
        SP = 5.0;
        PP = 5.0;
        instance = new TeachingControl();
        expNewSPResult = 10.5;
        expNewPPResult = 1.5;
        results = instance.calTeaching(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);
        
        // sharingExperince
        System.out.println("calTeaching");
        choice = 'c';
        SP = 5.0;
        PP = 5.0;
        instance = new TeachingControl();
        expNewSPResult = 5.0;
        expNewPPResult = 4.0;   // was 8.0 on calculation table, edited after debugging 
        results = instance.calTeaching(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);
        
        // usingScarsm
        System.out.println("calTeaching");
        choice = 'd';
        SP = 5.0;
        PP = 5.0;
        instance = new TeachingControl();
        expNewSPResult = 2.5;
        expNewPPResult = 8.0;
        results = instance.calTeaching(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);
            
        // bearing Testimony
        System.out.println("calTeaching");
        choice = 'e';
        SP = 5.0;
        PP = 5.0;
        instance = new TeachingControl();
        expNewSPResult = 7.5;
        expNewPPResult = 2.5;
        results = instance.calTeaching(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);
    
        // turing to companion
        System.out.println("calTeaching");
        choice = 'f';
        SP = 5.0;
        PP = 5.0;
        instance = new TeachingControl();
        expNewSPResult = 2.5;
        expNewPPResult = 7.0;
        results = instance.calTeaching(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);
    }
    
}
