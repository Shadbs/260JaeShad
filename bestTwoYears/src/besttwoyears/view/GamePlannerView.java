/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.view;

import java.util.Scanner;

/**
 *
 * @author Shad
 */
public class GamePlannerView extends View {

    public GamePlannerView() {
        super("\n"
                + "\n --------------------------------------------"
                + "\n |           Planner Option                 |"
                + "\n --------------------------------------------"
                + "\n  A - Look up appointments                   "
                + "\n  D - Add an appointment                     "
                + "\n  E - Exit to Game Menu                      "
                + "\n --------------------------------------------");

    }

    @Override
    public void doAction(String value) {

        char playerChoice = value.toUpperCase().charAt(0);

        switch (playerChoice) {
            case 'A': // connection to ProselytingControl
                System.out.println("**Look at todays appointments and contact addresses is called**");
                ; // dummy return values
                break;

            case 'D': // connection to TeachingControl
                System.out.println("**Add a appointment is called**");
                break; // dummy return values
            case 'E'://exit to main game menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
            default:
                System.out.println("***Choose Again, Invalid Selection***");
                break;

        }
    }
}
