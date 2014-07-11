/*
 * 
 */
package besttwoyears;

import besttwoyears.frames.StartProgramFrame;
import besttwoyears.model.Game;
import besttwoyears.model.Player;

/*
 * @author Shad & Jae
 */
public class BestTwoYears {

    private static Player player = null;
    private static Game currentGame = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BestTwoYears.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BestTwoYears.currentGame = currentGame;
    }

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // We won't need this next lines since GUI comes up. 
        //        ProgramStartView ProgramStartView = new ProgramStartView();
        //        ProgramStartView.programStart();
        //
        //        HelpMenuView helpMenu = new HelpMenuView();
        //        helpMenu.display();
        //
        //        MainMenuView mainMenu = new MainMenuView();
        //        mainMenu.display();

        try {
        //  ProgramStartView programStartView = new ProgramStartView();
        //  programStartView.banner();
            
            
            
            // create StartProgramView and start the program
            java.awt.EventQueue.invokeLater(
                    new Runnable() {
                        @Override
                        public void run() {
                            StartProgramFrame startProgramFrame = new StartProgramFrame(); // 1. Place all statements in try block
                            startProgramFrame.setVisible(true);
                        }
                    }
            );
            
            return;

        } catch (Throwable ex) { // 2. Catch all unexpected Runtime Errors, Throuable = Super class for runtime errors
            System.out.println("Abnormal error occured, try running program again");
            System.out.println(ex.getMessage()); // 3. Print a meaningful message
            ex.printStackTrace(); // 4. Put them on stack Trace
        }

    }

}
