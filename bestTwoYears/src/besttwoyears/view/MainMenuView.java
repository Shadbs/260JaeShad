/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.view;

import besttwoyears.BestTwoYears;
import besttwoyears.control.*;
import besttwoyears.control.ProgramControl;
import java.util.Scanner;

/**
 *
 * @author Shad
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n|             Main Menu             |"
                + "\n-------------------------------------"
                + "\n G - Start Game"
                + "\n H - Get help on how to play the game"
                + "\n S - Save Game"
                + "\n Q - Exit Game"
                + "\n-------------------------------------");
    }

    @Override
    public void doAction(String value) {
        char playerChoice = value.toUpperCase().charAt(0);   // Converstion from String to Char

        switch (playerChoice) {
            case 'G'://Start game & display Menu
                // Start Game
                GameControl.startNewGame();

                // display menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;

            case 'H': //display Help Menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();

                break;
            case 'S':// save the current game to disk
                ProgramControl.saveGame(BestTwoYears.getCurrentGame());
                break;
                
            case 'Q': // Exit out of the Game
                System.exit(0);

            default:
                System.out.println("***Choose again, invalid selection***");
                break;
        }
    }
}
