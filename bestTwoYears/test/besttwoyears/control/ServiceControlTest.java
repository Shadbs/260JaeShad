/*
 * ServiceControl Test Class
 */

package besttwoyears.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Jae Lee
 */
public class ServiceControlTest {
    
    public ServiceControlTest() {
    }

    /**
     * Test of calServiceControl method, of class ServiceControl.
     */
    @Test
    public void testCalServiceControl() {
       
        // helpMember
        System.out.println("calServiceControl");
        char choice = 'a';
        double SP = 5.0;
        double PP = 5.0;
        ServiceControl instance = new ServiceControl();
        double expNewSPResult = 3.5;
        double expNewPPResult = 10;
        double[] result = instance.calServiceControl(choice, SP, PP);
        assertEquals(result[0], expNewSPResult, 0.00001);
        assertEquals(result[1], expNewPPResult, 0.00001);

        // randomService
        System.out.println("calServiceControl");
        choice = 'b';
        SP = 5.0;
        PP = 5.0;
        instance = new ServiceControl();
        expNewSPResult = 10.5;
        expNewPPResult = 1.5;
        result = instance.calServiceControl(choice, SP, PP);
        assertEquals(result[0], expNewSPResult, 0.00001);
        assertEquals(result[1], expNewPPResult, 0.00001);
    }
    
}
