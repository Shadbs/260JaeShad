/* Individual Assignment, Lesson 4
 * Proselyting Control 
 */

package besttwoyears.control;

/**
 * @author Jae Lee
 */
public class ProselytingControl {
    public double[] calProselyting(char choice, double SP, double PP) {
        
        double newSP = 0, newPP = 0;
        double RN = 2;  // Random number
        
        switch (choice) {
            case 'a':  // InviteLesson
                newSP = (SP*1.5) + RN;
                newPP = PP/RN;
                
                System.out.println("New S.P: " + newSP);
                System.out.println("New S.P: " + newPP);
                break;
                
            case 'b':   // AskingNumber
                newSP = SP * 1;
                newPP = PP/RN;
                
                System.out.println("New S.P: " + newSP);
                System.out.println("New S.P: " + newPP);
                break;
                
            case 'c':   // handPassAlongCard
                newSP = SP + 1 + RN;
                newPP = PP + RN;
                
                System.out.println("New S.P: " + newSP);
                System.out.println("New S.P: " + newPP);
                break;
                
            case 'd':
                newSP = SP + 0.5 * RN;
                newPP = PP - RN;
                
                System.out.println("New S.P: " + newSP);
                System.out.println("New S.P: " + newPP);
                break;
        }
        
        double[] results = new double[2];
        results[0] = newSP;
        results[1] = newPP;
        
        return results;
    }
    
}
