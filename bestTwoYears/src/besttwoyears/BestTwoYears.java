/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears;

import besttwoyears.model.Player;
import besttwoyears.model.mission;
import besttwoyears.model.Companion;
import besttwoyears.model.BagItems;
import besttwoyears.model.Leader;
import besttwoyears.model.People;
import besttwoyears.model.Investigator;
import besttwoyears.model.Cellphones;
import besttwoyears.model.Call;
import besttwoyears.view.programStart;  

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
        Player playerOne = new Player();
        mission missionOne = new mission();
        Companion companionOne = new Companion();
        Leader leaderOne = new Leader();
        BagItems BagItemsOne = new BagItems();
        People peopleOne = new People();
        Investigator investigatorOne = new Investigator();
        Cellphones cellphonesOne = new Cellphones();
        Call callOne = new Call();

        new programStart();
        // Create HelpMenuView and Disply HelpMenu
        programStart programStart(); = new programStart();
        

    }

}
