/*
 * TeachingControl class
 */
package besttwoyears.control;

/**
 * @author Jae Lee
 */
public class TeachingControl {

    public double[] calTeaching(char choice, double SP, double PP) {

        double newSP = 0, newPP = 0;

        switch (choice) {
            case 'a': // sharingScripture
                newSP = (SP * 2) + 0.5;
                newPP = (PP / 2) - 1;

                System.out.println("New S.P:" + newSP);
                System.out.println("New P.P:" + newPP);
                break;

            case 'b': // AskingQuestion
                newSP = SP * 1;
                newPP = PP * 1;

                System.out.println("New S.P:" + newSP);
                System.out.println("New P.P:" + newPP);
                break;

            case 'c': // sharingExperience
                newSP = SP + 0;
                newPP = PP - 1;

                System.out.println("New S.P:" + newSP);
                System.out.println("New P.P:" + newPP);
                break;

            case 'd': // usingSacarsm
                newSP = SP / 2;
                newPP = PP + 3;

                System.out.println("New S.P:" + newSP);
                System.out.println("New P.P:" + newPP);
                break;

            case 'e': // BearingTestimony
                newSP = SP * 1.5;
                newPP = PP / 2;

                System.out.println("New S.P:" + newSP);
                System.out.println("New P.P:" + newPP);
                break;

            case 'f': // turningToCompanion
                newSP = SP / 2;
                newPP = PP + 2;

                System.out.println("New S.P:" + newSP);
                System.out.println("New P.P:" + newPP);
                break;
        }
        double[] results = new double[2];
        results[0] = newSP;
        results[1] = newPP;
        
        return results;
    }
}
