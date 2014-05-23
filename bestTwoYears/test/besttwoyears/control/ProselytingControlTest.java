/*
 * Lesson 4, Individual Assignements
 */

package besttwoyears.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ProselytingControl
 * @author Jae Lee
 */
public class ProselytingControlTest {
    
    public ProselytingControlTest() {
    }

    /**
     * Test of calProselyting method, of class ProselytingControl.
     */
    @Test
    public void testCalProselyting() {
        
        // inviteLesson        
        System.out.println("calInviteLesson");
        char choice = 'a';
        double SP = 5.0;
        double PP = 5.0;
        ProselytingControl instance = new ProselytingControl();
        double expNewSPResult = 9.5;
        double expNewPPResult = 2.5;
        double[] results = instance.calProselyting(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);       

        // askNumber        
        System.out.println("calAskNumber");
        choice = 'b';
        SP = 5.0;
        PP = 5.0;
        instance = new ProselytingControl();
        expNewSPResult = 5.0;
        expNewPPResult = 2.5;
        results = instance.calProselyting(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);     

        // handPassAlongCard        
        System.out.println("calHandPassAlongCard");
        choice = 'c';
        SP = 5.0;
        PP = 5.0;
        instance = new ProselytingControl();
        expNewSPResult = 8;
        expNewPPResult = 7;
        results = instance.calProselyting(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);
        
        // SteertContacting      
        System.out.println("calSteertContacting");
        choice = 'd';
        SP = 5.0;
        PP = 5.0;
        instance = new ProselytingControl();
        expNewSPResult = 6;
        expNewPPResult = 3;
        results = instance.calProselyting(choice, SP, PP);
        assertEquals(results[0], expNewSPResult, 0.0001);
        assertEquals(results[1], expNewPPResult, 0.0001);  
    }
}
