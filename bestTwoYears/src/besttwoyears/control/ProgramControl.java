/*
 * Program Control
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.model.Game;
import besttwoyears.model.Player;

/**
 * @author Shad
 */
public class ProgramControl {

    public static Player createPlayer(String playerName, String missionTitle) {
        Player player = new Player();
        player.setLastName(playerName);
        player.setMissionTitle(missionTitle);
        
        return player;
    }

    public static void saveGame(Game currentGame) {
        System.out.println("***'Save Menu' displayMenu stub function called ***");
    }
    
}
