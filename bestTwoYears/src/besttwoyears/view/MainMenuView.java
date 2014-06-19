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
                + "\n E - Exit Game"
                + "\n-------------------------------------");
    }
}

public void doAction(String choice) {

        switch (choice) {
            case "G"://Start game & display Menu
                // Start Game
                GameControl.startNewGame();
               
                // display menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayMenu();
                break;
                
            case "H": //display Help Menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();

                break;
            case "S":// save the current game to disk
                ProgramControl.saveGame(BestTwoYears.getCurrentGame());
                break;

            default:
                System.out.println("***Choose again, invalid selection***");
                break;            
        }
    }
}
