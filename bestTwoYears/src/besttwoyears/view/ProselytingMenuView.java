/*
 * View: ProselytingView
 */
package besttwoyears.view;

import besttwoyears.control.*;
import java.util.Scanner;

/**
 * @author Jae Lee
 */
public class ProselytingMenuView extends View {

    public ProselytingMenuView() {
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
                ProselytingControl proselytingChoice = new ProselytingControl();
                proselytingChoice.calProselyting('a', 5, 2); // dummy return values
                break;

            case 'T': // connection to TeachingControl
                TeachingControl teachingChoice = new TeachingControl();
                teachingChoice.calTeaching('c', 5, 2); // dummy return values

            case 'S': // connection to ServiceControl
                ServiceControl serviceControl = new ServiceControl();
                serviceControl.calServiceControl('b', 5, 2); // dummy return values

            case 'H': // returning back to help menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();

            default:
                System.out.println("***Choose Again, Invalid Selection***");
                break;

        }
    }
}
