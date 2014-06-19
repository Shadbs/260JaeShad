/*
 * ConverationViewMenu.java
 */
package besttwoyears.view;

import besttwoyears.BestTwoYears;
import java.util.Scanner;

/*
 * @author Jae Lee
 */
public class ConverstaionViewMenu extends View {

    public ConverstaionViewMenu() {
        super("\n"
                + "\n --------------------------------------------"
                + "\n |           Conversation Menu               |"
                + "\n --------------------------------------------"
                + "\n  A - Ask What to do/Where to Go             "
                + "\n  T - Tell What to do/Where to Go            "
                + "\n  H - Show humbleness                        "
                + "\n  E - Exit to Help Menu                      "
                + "\n --------------------------------------------");

    }

    @Override
    public void doAction(String value) {

        char playerChoice = value.toUpperCase().charAt(0);

        switch (playerChoice) {
            case 'A': // ActionControl - ask (whatToDo/WhereToDo control Class needed)
                System.out.println("\n -----askActionControl Needed-----");
                ActionControl askControl = new ActionControl();
                askControl.askAction();
                break;

            case 'T': // ActionControl - tell (whatToDo/WhereToDo control Class needed)
                System.out.println("\n -----tell ActionControl Needed-----");
                ActionControl tellControl = new ActionControl();
                tellControl.tellAction();
                break;

            case 'H': // Showing Humbleness = Lowering Pride Point
                System.out.println("\n -----show HumbleActionControl Needed-----");
                ActionControl humbleControl = new ActionControl();
                humbleControl.humbleAction();

            case 'E': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();

            default:
                System.out.println("***Choose Again, Invalid Selection***");
                break;
        }
    }
}
