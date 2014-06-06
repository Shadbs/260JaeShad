/*
 * View: Proselyting
 */

package besttwoyears.view;

import besttwoyears.control.*;
import java.util.Scanner;

/**
 * @author Jae Lee
 */
public class Proselyting {
    
    private static final String MENU = "\n"
            + "\n --------------------------------------------"
            + "\n |           Proselyting Option             |"
            + "\n --------------------------------------------"
            + "\n  P - General Proselyting                    "
            + "\n  T - Teach Investigator                     "
            + "\n  S - Service Projects                       "
            + "\n  H - Exit to Help Menu                      "
            + "\n --------------------------------------------";
    
    public String getInput() {
        boolean valid = false;
        String playerChoice = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter Choice");

            playerChoice = keyboard.nextLine();
            playerChoice = playerChoice.trim();

            if (playerChoice.toUpperCase().equals("Q")) {
                return null;
            }

            if (playerChoice.length() > 1) {
                System.out.println("Invalid Choice, Choose again");
            } else {
                valid = true;
            }

        }
        return playerChoice;
    }
    
    public void doAction(char playerChoice) {

        switch (playerChoice) {
            case 'P': // connection to ProselytingControl
                // Should Create
                ProselytingControl proselytingChoice = new ProselytingControl();
                proselytingChoice.calProselyting('a', 5, 2); // dummy return values
                break;
                
            case 'T': // connection to TeachingControl
                TeachingControl teachingChoice = new TeachingControl();
                teachingChoice.calTeaching('c', 5, 2); // dummy return values
            
            case 'S': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                                            
            case 'H': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                
            default:
                System.out.println("***Choose Again, Invalid Selection***");
                break;

        }
    }
    
    
    
    
}
