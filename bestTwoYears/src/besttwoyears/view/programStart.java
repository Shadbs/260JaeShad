/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.view;

import besttwoyears.control.ProgramControl;
import besttwoyears.model.Player;
import java.util.Scanner;

/**
 *
 * @author Shad
 */
public class programStart {

    public void banner() {
        //this is displays when run
        System.out.println("Hello future missionary welcome to the Best Two years, here you will have the experience of a lifetime! \n you have been chosen to represent our Lord Jesus Christ and preach His gospel for 2 years of your life");

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



public programStart() {
        this.banner();

        String playerName = this.getPlayerName();
        if (playerName == null) {
            return;
        }

        Player player = ProgramControl.createPlayer(playerName);

        this.displayWelcome(player);

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();

        
    }
}
