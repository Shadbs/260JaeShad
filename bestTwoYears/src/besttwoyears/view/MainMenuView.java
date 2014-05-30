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
public class MainMenuView {

    private static final String MENU = "/n"
            + "/n---------------------------------"
            + "/n Main Menu"
            + "/n---------------------------------"
            + "/n G - Start Game"
            + "/n H - Get help on how to play the game"
            + "/n S - Save Game"
            + "/n E - Exit Game";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);
        } while (selection != 'E');
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
            case 'G'://Display game menu
                GameMenu gameMenu = new GameMenu();
                gameMenu.displayMenu();
                break;
            case 'H': //display Help Menu
                HelpMenu helpMenu = new HelpMenu();
                helpMenu.displayMenu();
                break;
            case 'S':// save the vurrent game to disk
                ProgramControl.saveGame(BestTwoYears.currentGame());
                break;
            default:
                System.out.println("***Choose again, invalid selection***");
                break;
                            
        }
    }
}