/*
 * ConverationViewMenu.java
 */

package besttwoyears.view;

import besttwoyears.BestTwoYears;
import java.util.Scanner;

/*
 * @author Jae Lee
 */
public class ConverstaionViewMenu {
    
    private static final String MENU = "\n"
            + "\n --------------------------------------------"
            + "\n |           Conversation Menu               |"
            + "\n --------------------------------------------"
            + "\n  A - Ask What to do/Where to Go             "
            + "\n  T - Tell What to do/Where to Go            "
            + "\n  H - Show humbleness                        "
            + "\n  E - Exit to Help Menu                      "
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
            case 'A': // ActionControl - ask (whatToDo/WhereToDo control Class needed)
                System.out.println("\n -----askActionControl Needed-----");
                ActionControl askControl = new ActionControl();
                askControl.askAction();
                break;
                
            case 'T': // ActionControl - tell (whatToDo/WhereToDo control Class needed)
                System.out.println("\n -----tell ActionControl Needed-----");
                ActionControl tellControl = new ActionControl();
                tellControl.tellAction();
                break;
                
            case 'H': // Showing Humbleness = Lowering Pride Point
                System.out.println("\n -----show HumbleActionControl Needed-----");
                ActionControl humbleControl = new ActionControl();
                humbleControl.humbleAction();
                                            
            case 'E': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
               
            default:
                System.out.println("***Choose Again, Invalid Selection***");
                break;
            }
    }
}