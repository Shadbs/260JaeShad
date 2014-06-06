/*
 * View: ProselytingView
 */

package besttwoyears.view;

import besttwoyears.control.*;
import java.util.Scanner;

/**
 * @author Jae Lee
 */
public class ProselytingMenuView {
    
    private static final String MENU = "\n"
            + "\n --------------------------------------------"
            + "\n |           Proselyting Option             |"
            + "\n --------------------------------------------"
            + "\n  P - General Proselyting                    "
            + "\n  T - Teach Investigator                     "
            + "\n  S - Service Projects                       "
            + "\n  H - Exit to Help Menu                      "
            + "\n --------------------------------------------";
    
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);       // Display MainMenu

            String input = this.getInput(); // get user's selection
            selection = input.charAt(0);    // get first character of string

            this.doAction(selection);       // Do action based on selection
        } while (selection != 'E');         // an selection isn't "Exit"
    }
    
    public String getInput() {              // Use this as templete
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
                ProselytingControl proselytingChoice = new ProselytingControl();
                proselytingChoice.calProselyting('a', 5, 2); // dummy return values
                break;
                
            case 'T': // connection to TeachingControl
                TeachingControl teachingChoice = new TeachingControl();
                teachingChoice.calTeaching('c', 5, 2); // dummy return values
            
            case 'S': // connection to ServiceControl
                ServiceControl serviceControl = new ServiceControl();
                serviceControl.calServiceControl('b', 5, 2); // dummy return values
                                            
            case 'H': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                
            default:
                System.out.println("***Choose Again, Invalid Selection***");
                break;

        }
    }
    
    
    
    
}
