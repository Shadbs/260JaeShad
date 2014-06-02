/*
 * HelpMenuView
 */
package besttwoyears.view;

import besttwoyears.BestTwoYears;
import besttwoyears.control.ProgramControl;
import java.util.Scanner;

/**
 * @author Jae Lee
 */
public class HelpMenuView {

    private static final String HelpMENU = "\n"
            + "\n-------------------------------------"
            + "\n|             Help Menu             |"
            + "\n-------------------------------------"
            + "\n G - Goal of the Game"
            + "\n M - How To Move                     "
            + "\n A - Making & Keep Appoinments       "
            + "\n P - Understanding the Planner       "
            + "\n T - Understanding P-Day Task        "
            + "\n E - Exit to Main Menu               "
            + "\n-------------------------------------";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(HelpMENU);       // Display MainMenu

            String input = this.getInput();     // get user's selection & See "getInput()"
            selection = input.charAt(0);        // get first character of string

            this.doAction(selection);           // Do action based on selection & See "doAction()"
        } while (selection != 'Q');             // an selection isn't "Exit"
    }

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
            } else {
                valid = true;
            }

        }
        return playerChoice;
    }

    public void doAction(char playerChoice) {

        switch (playerChoice) {
            case 'G':// Goal of the Game, Display for direction
                People.toString(besttwoyears.getCurrrent);
                gameGoal.displayGoal();
                break;
            case 'M': // How to Move, Display for direction
                GameMove gameMove = new GameMove();
                gameGoal.displayMove();
                break;
            case 'A':// Making & Keep Appoinments
                Call.toString();
                break;
            case 'P':// Understanding the Planner
                GamePlanner gamePlanner = new GamePlanner();
                gamePlanner.displayAppoinment();
                break;
            case 'T': // Understanding P-Day Task 
                prepDay.prepDay(BestTwoYears.getCurrentGame());
                break;
            case 'E': // Understanding P-Day Task 
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMenu();
                break;

            default:
                System.out.println("***Please Choose Option again***");
                break;
        }

    }
}
