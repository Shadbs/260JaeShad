/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.view;

import besttwoyears.BestTwoYears;
import besttwoyears.control.ProgramControl;
import java.util.Scanner;

/**
 *
 * @author Shad
 */
public class GamePlanner {

    private static final String MENU = "\n"
            + "\n-------------------------------------"
            + "\n|             Planner Help           |"
            + "\n-------------------------------------"
            + "\n P - Using the planner and how to use it"
            + "\n E - Exit to Help Menu"
            + "\n-------------------------------------";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);       // Display MainMenu

            String input = this.getInput(); // get user's selection
            selection = input.charAt(0);    // get first character of string

            this.doAction(selection);       // Do action based on selection
        } while (selection != 'E');         // an selection isn't "Exit"
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
            case 'P': //display Help Menu
                System.out.println("\n"
                        + "\n**********What Is The Planner?***********"
                        + "\n"
                        + "\n When selecting the Planner, it will display any future appointments"
                        + "\n that you will have that day. It will also have the choice between"
                        + "\n adding a new appointment or deleting one. It is up to the missionary"
                        + "\n to keep those appointments to keep from facing the consequnses of missing them."
                        + "\n ****************Using The Planner*********************"
                        + "\n"
                        + "\n After the planner opens it will automatically display the appointements of the day."
                        + "\n A - Using this command you will be prompted to add the name, address, and phone number of the"
                        + "\n person you wish to add."
                        + "\n L - This will bring up a list of people already added to your planner with name, address, and phone number."
                        + "\n D - Using this command you will be prompted to enter the name of the contact and it will be removed from your contacts.");

                GamePlanner gamePlanner = new GamePlanner();
                gamePlanner.displayMenu();
                break;
            case 'E': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
            default:
                System.out.println("***Choose again, invalid selection***");
                break;

        }
    }
}
