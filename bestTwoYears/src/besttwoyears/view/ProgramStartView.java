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
        System.out.println("\n "                                                
                + "\n ***************************************************************"
                + "\n * Hello, Future Missionary! Welcome to the Best Two years!    *"
                + "\n * Here, you will have the experience of a lifetime!           *"
                + "\n * You have been chosen to represent our Lord Jesus Christ     *"
                + "\n * and preach His gospel for 2 years(or 1.5 year) of your life *"
                + "\n ***************************************************************");

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

    public String getMissionTitle() {
        boolean valid = false;
        String missionTitle = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("\nAre you a Sister or Elder? E-Elder or S-Sister:    ");

            missionTitle = keyboard.nextLine();
            missionTitle = missionTitle.trim();

            if ('E' == missionTitle.toUpperCase().charAt(0)) {
                missionTitle = "Elder";
                valid = true;
            } else if ('S' == missionTitle.toUpperCase().charAt(0)) {
                missionTitle = "Sister";
                valid = true;
            }
            if (missionTitle.toUpperCase().equals("Q")) {
                return null;
            }

            if (missionTitle.length() < 2) {
                System.out.println("Invalid Name please enter again, must be more than 2 characters");
            }
        }
        return missionTitle;

    }

    public void displayWelcome(Player player) {
        System.out.println("\n Welcome, " + player.getMissionTitle() + " " + player.getLastName());
    }

    public ProgramStartView() {
        this.banner();                              //display the banner screen

        String missionTitle = this.getMissionTitle(); //Asks for the missonary title
        if (missionTitle == null) {
            return;
        }
        String playerName = this.getPlayerName();   // prompt the player to input thier name, retrieve the player name. 
        if (playerName == null) {                   // User wants to Quit
            return;                             // Exit the game
        }

        Player player = ProgramControl.createPlayer(playerName, missionTitle); // Create player objects & Save it in the programContorl Class

        this.displayWelcome(player);                // Print DisplayWelcome (message)

        MainMenuView mainMenuView = new MainMenuView(); // Dislay the MainMenu
        mainMenuView.display();
    }

    public void programStart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
