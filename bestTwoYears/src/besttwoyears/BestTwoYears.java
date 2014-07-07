/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears;

import besttwoyears.model.Call;
import besttwoyears.model.Cellphones;
import besttwoyears.model.Companion;
import besttwoyears.model.Game;
import besttwoyears.model.Investigator;
import besttwoyears.model.Leader;
import besttwoyears.model.Person;
import besttwoyears.model.Player;
//import besttwoyears.model.Mission;  
import besttwoyears.view.HelpMenuView;
import besttwoyears.view.ProgramStartView;
import besttwoyears.view.MainMenuView;
  

/**
 * @author Shad & Jae
 */
public class BestTwoYears {
    
    //private static Game currentGame = null;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgramStartView ProgramStartView = new ProgramStartView();
        ProgramStartView.programStart();  
         
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
        try {
        ProgramStartView programStartView = new ProgramStartView();
        programStartView.banner();
        }
        catch (Throwable e){
            System.out.println("Abnormal error occured, try running program again");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
                
    }

}
