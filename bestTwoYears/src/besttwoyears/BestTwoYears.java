/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package besttwoyears;

import besttwoyears.model.Player;
import besttwoyears.model.mission;

/**
 *
 * @author Shad
 */
public class BestTwoYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player();
      mission missionOne = new mission();
      
      playerOne.setLastName("Stanger");
      playerOne.setMissionTitle("Elder");
      missionOne.setMissionName ("Provo, Utah");

      
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      
            String missionInfo = missionOne.toString();
      System.out.println(missionInfo);
      
      
    }
    
}
