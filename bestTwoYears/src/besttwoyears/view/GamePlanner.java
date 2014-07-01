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
public class GamePlanner extends View {

    public GamePlanner() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n|             Planner Help              |"
                + "\n-----------------------------------------"
                + "\n P - Using the planner and how to use it"
                + "\n E - Exit to Help Menu"
                + "\n-----------------------------------------");
    }

    @Override
    public void doAction(String value) {
        char playerChoice = value.toUpperCase().charAt(0);
        switch (playerChoice) {
            case 'P': //display Help Menu
                System.out.println("\n"
                        + "\n ****************What Is The Planner?*******************************************************"
                        + "\n                                                                                            "
                        + "\n When selecting the Planner, it will display any future appointments                        "
                        + "\n that you will have that day. It will also have the choice between                          "
                        + "\n adding a new appointment or deleting one. It is up to the missionary                       "
                        + "\n to keep those appointments to keep from facing the consequnses of missing them.            "
                        + "\n                                                                                            "
                        + "\n ****************Using The Planner**********************************************************"
                        + "\n                                                                                            "
                        + "\n After the planner opens it will automatically display the appointements of the day.        "
                        + "\n A - Using this command you will be prompted to add the name, address, and phone number     "
                        + "\n     of the person you wish to add.                                                         "
                        + "\n L - This will bring up a list of people already added to your planner with name, address,  "
                        + "\n     and phone number.                                                                      "
                        + "\n D - Using this command you will be prompted to enter the name of the contact and it will   "
                        + "\n     be removed from your contacts.                                                         "
                        + "\n                                                                                            "
                        + "\n *******************************************************************************************");

                GamePlanner gamePlanner = new GamePlanner();
                gamePlanner.display();
                break;
            case 'E': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
            default:
                System.out.println("***Choose again, Invalid selection***");
                break;

        }
    }
}
