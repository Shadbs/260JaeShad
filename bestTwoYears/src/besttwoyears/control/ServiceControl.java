/*
 * ServiceControl
 */

package besttwoyears.control;

/**
 * @author Jae Lee
 */
public class ServiceControl {
    public double[] calServiceControl(char choice, double SP, double PP) {
        // "double[]" == using a array. 
        
        double newSP = 0, newPP = 0;
        double RN = 2;  // Random Generated Number
        
        switch (choice) {
            case 'a':   // helpMember
                newSP = (SP + 2) / RN;
                newPP = PP / 0.5;
                System.out.println("New S.P: " + newSP);
                System.out.println("New P.P: " + newPP);
                break;
            
            case 'b':   // randomService
                newSP = (SP * RN) + 0.5;
                newPP = (PP - RN)  / 2;
                System.out.println("New S.P: " + newSP);
                System.out.println("New P.P: " + newPP);
                break;
        }
        
        //Arrary_command
        double[] results = new double[2];
        results[0] = newSP;
        results[1] = newPP;
        
        return results;
    }
}
