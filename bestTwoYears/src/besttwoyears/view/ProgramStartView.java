/*
 * ProgramStart class
 */
package besttwoyears.view;

import besttwoyears.control.ProgramControl;
import besttwoyears.model.Player;
import java.util.Scanner;

/**
 * @author Shad
 */
public class ProgramStartView {

    public void banner() {
        //banner: this is displays when run
        System.out.println("\n Hello future missionary welcome to the Best Two years,  "
                         + "\n here you will have the experience of a lifetime!        "
                         + "\n you have been chosen to represent our Lord Jesus Christ "
                         + "\n and preach His gospel for 2 years of your life          ");

    }

    public String getPlayerName() {
        boolean valid = false;
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter Your Last Name:");

            playerName = keyboard.nextLine();
            playerName = playerName.trim();

            if (playerName.toUpperCase().equals("Q")) {
                return null;
            }

            if (playerName.length() < 2) {
                System.out.println("Invalid Name please enter again, must be more than 2 characters");
            } else {
                valid = true;
            }
        }
        return playerName;
    }

    public void displayWelcome(Player player) {
        System.out.println("Welcome Elder " + player.getLastName());
    }

public ProgramStartView() {
        this.banner();                              //display the banner screen

        String playerName = this.getPlayerName();   // prompt the player to input thier name, retrieve the player name. 
        if (playerName == null) {                   // User wants to Quit
                return;                             // Exit the game
            }
            
        Player player = ProgramControl.createPlayer(playerName); // Create player objects & Save it in the programContorl Class

        this.displayWelcome(player);                // Print DisplayWelcome (message)

        MainMenuView mainMenuView = new MainMenuView(); // Dislay the MainMenu
        mainMenuView.displayMenu();
    }

    public void programStart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
