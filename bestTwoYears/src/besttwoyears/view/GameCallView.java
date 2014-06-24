/*
 * GameCallView
 */
package besttwoyears.view;

/*
 * @author Jae Lee
 */
public class GameCallView extends View {

    public GameCallView() {
        super("\n"
                + "\n ***********************************************"
                + "\n *                 Call Menu                   *"
                + "\n ***********************************************"
                + "\n C - Make a Phone Call                          "
                + "\n T - Answering a Text                           "
                + "\n N – Look up a contacts Number                  " // This function is already built-in feature in Game-Menu
                + "\n Q – Back to Previous Menu                      "
                + "\n ***********************************************");
    }

    @Override
    public void doAction(String value) {
        char playerChoice = value.toUpperCase().charAt(0);   // Converstion from String to Char

        switch (playerChoice) {
            case 'C': // C - Make a Phone Call 
                System.out.println("*** Think, How to call their Name & Number ***");
                break;
            case 'T': // T - Answering a Text
                System.out.println("*** Think, How to use this feature for the User ***"
                        + "\n*** to help finish successful Mission.          ***");
                break;
            case 'N': // N – Look up a contacts Number 
                GameMenuView viewPersonList = new GameMenuView();
                viewPersonList.viewPersonList();
                break;
                
            // Q – Go Back to Main Menu
            default: // Defalut options 
                System.out.println("--- Invalid Option, Please Try Again ---");
                break;
        }
    }
}
