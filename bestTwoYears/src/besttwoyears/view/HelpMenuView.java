/*
 * HelpMenuView
 */
package besttwoyears.view;

import besttwoyears.BestTwoYears;
import besttwoyears.control.*;
import java.util.Scanner;

/**
 * @author Jae Lee
 */
public class HelpMenuView {

    private static final String HelpMENU = "\n"
            + "\n-------------------------------------"
            + "\n|             Help Menu             |"
            + "\n-------------------------------------"
            + "\n G - Goal of the Game                "
            + "\n M - How To Move                     "
            + "\n C - Making & Keep Appoinments(Phone)"
            + "\n P - Understanding the Planner       "
            + "\n T - Understanding P-Day Task        "
            + "\n E - Exit to Main Menu               "
            + "\n-------------------------------------";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(HelpMENU);       // Display HelpMenu

            String input = this.getInput();     // get user's selection & See "getInput()"
            selection = input.charAt(0);        // get first character of string

            this.doAction(selection);           // Do action based on selection & See "doAction()"
        } while (selection != 'E');             // an selection isn't "Exit"
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
                System.out.println(
                        "\n"
                        +"\n*************************Goal of Your Mission****************************"
                        +"\n There will be choices you have to make in order to fulfill your mission." 
                        +"\n Some of the challenges you will face will be deciding what to do        " 
                        +"\n with your day, who you’re going to go visit, keeping appointments,      "  
                        +"\n dealing with unruly companions, managing your funds, serving others,    "
                        +"\n and strengthening your own spiritual strength. It is important to keep  "
                        +"\n your spiritual strength up and your pride down. Doing the work of the   " 
                        +"\n Lord will increase your spirit while not doing what you are supposed    "
                        +"\n to do your pride will go up and your spirit will go down. If your pride "
                        +"\n gets to high you may be sent to the mission president to be humbled.    "
                        +"\n or sent home. Can you survive 2 years?                                  "
                        +"\n*************************************************************************");
                break;
                
            case 'M': // How to Move, Display for direction
                    System.out.println("\n"
                        +"\n*****************How to Move***********************"
                        +"\n Do Your Work and Find the God's chilren, we will  "
                        +"\n transfer your mission area once investigators     "
                        +"\n are converted. Go, Find and get them!             "
                        +"\n***************************************************");
                break;
                
            case 'C':// Making & Receive Phonecall - GamaCall.java
                GameCall gameCall = new GameCall();
                gameCall.displayMenu();
                break;
                
            case 'P':// Understanding the Planner - connected to GamePlanner.java
                GamePlanner gamePlanner = new GamePlanner();
                gamePlanner.displayMenu();
                break;
                
            case 'T': // Understanding P-Day Task - connected to GamePrepDay.java
//                prepDay.prepDay(BestTwoYears.getCurrentGame());
                GamePrepDay gamePrepDay = new GamePrepDay();
                gamePrepDay.displayMenu();
                break;
                
            case 'E': // Back to the MainMenuView.java
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMenu();
                break;

            default:
                System.out.println("***Please Choose Option Again***");
                break;
        }

    }
}
