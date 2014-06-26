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
public class GameCall extends View {
        public GameCall() {
        super("\n"
                + "\n-------------------------------------"
                + "\n|             Planner Help           |"
                + "\n-------------------------------------"
                + "\n P - Using the Cell Phone and how to use it"
                + "\n E - Exit to Help Menu"
                + "\n-------------------------------------");
    }
        
        @Override
    public void doAction(String value) {
        char playerChoice = value.toUpperCase().charAt(0);
        switch (playerChoice) {
            case 'P': //display Help Menu
                System.out.println("\n"
                        + "\n**********What Is The Cell Phone?***********"
                        + "\n"
                        + "\n When selecting the Cell phone you will be given the option to call someone."
                        + "\n It is important that you remember the phone numbers of those you want to call."
                        + "\n You will have to manually type in the numbers. Entering the wrong number will not be recieved."
                        + "\n ****************Using The Cell Phone*********************"
                        + "\n"
                        + "\n After opening the Cell Phone you will be prometed to either enter the number you want to call or look up a contact."
                        + "\n C - Using this command you will be prompted to enter the desired number."
                        + "\n T - Will display the recieved text."
                        + "\n N - This will bring up a list of number of people you want to call.");

                GameCall gameCall = new GameCall();
                gameCall.display();
                break;
            case 'E': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
            default:
                System.out.println("***Choose again, invalid selection***");
                break;

        }
    }
}
