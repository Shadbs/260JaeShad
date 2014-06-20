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
                + "\n |           Proselyting Option             |"
                + "\n --------------------------------------------"
                + "\n  P - General Proselyting                    "
                + "\n  T - Teach Investigator                     "
                + "\n  S - Service Projects                       "
                + "\n  H - Exit to Help Menu                      "
                + "\n --------------------------------------------");

    }

    @Override
    public void doAction(String value) {

        char playerChoice = value.toUpperCase().charAt(0);

        switch (playerChoice) {
            case 'P': // connection to ProselytingControl
                System.out.println("**Look at todays appointments and contact addresses is called**");
                ; // dummy return values
                break;

            case 'T': // connection to TeachingControl
                System.out.println("**Add a appointment is called**");
                break; // dummy return values

            default:
                System.out.println("***Choose Again, Invalid Selection***");
                break;

        }
    }
}
