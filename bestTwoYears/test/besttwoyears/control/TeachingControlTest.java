/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package besttwoyears.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jae Lee
 */
public class TeachingControlTest {
    
    public TeachingControlTest() {
    }

    /**
     * Test of calTeaching method, of class TeachingControl.
     */
    @Test
    public void testCalTeaching() {
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
// TODO review the generated test code and remove the default call to fail.

    }
    
}
