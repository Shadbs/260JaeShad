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
import besttwoyears.model.Investigator;

/**
 *
 * @author Shad & Jae
 */
public class BestTwoYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player();
      mission missionOne = new mission();
      Companion companionOne = new Companion();
      Leader leaderOne = new Leader();
      Investigator investigatorOne = new Investigator();
      BagItems BagItemsOne = new BagItems(); 

      
      playerOne.setLastName("Stanger");
      playerOne.setMissionTitle("Elder");
      
      missionOne.setMissionName ("Provo, Utah");
      
      companionOne.setPrideGage(5.50);
      companionOne.setSpiritGage(6.25);
      

      leaderOne.setDisappointmentGage(5.50);

      BagItemsOne.setDescription("Scripture");
      BagItemsOne.setName("Book of Mormon");

      investigatorOne.setUnderstandingGage(4.40);
      
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      
      String missionInfo = missionOne.toString();
      System.out.println(missionInfo);
      
      String companionInfo = companionOne.toString();
      System.out.println(companionInfo);
      

      String leaderInfo = leaderOne.toString();
      System.out.println(leaderInfo);


      String BagItemsInfo = BagItemsOne.toString();
      System.out.println(BagItemsInfo);
      
      String investigatorInfo = investigatorOne.toString();
      System.out.println(investigatorInfo);
    }

    
}

