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
//import besttwoyears.model.Investigator;
import besttwoyears.model.Cellphones;

/**
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
      BagItems BagItemsOne = new BagItems();
      People peopleOne = new People();
//      Investigator investigatorOne = new Investigator();
      Cellphones cellphonesOne = new Cellphones();
    
      playerOne.setLastName("Stanger");
      playerOne.setMissionTitle("Elder");
      
      missionOne.setMissionName ("Provo, Utah");
      
      companionOne.setPrideGage(5.50);
      companionOne.setSpiritGage(6.25);

      leaderOne.setDisappointmentGage(5.50);

      BagItemsOne.setDescription("Scripture");
      BagItemsOne.setName("Book of Mormon");
      
      peopleOne.setName("Brother Karl");
      peopleOne.setTitle("Inverstigator");

//      investigatorOne.setUnderstandingGage(4.40);
      
      cellphonesOne.setCall("208-496-9999");
      cellphonesOne.setText("Hi Elders!");
      cellphonesOne.setContacts("Henry Karl");
     
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
      

      String peopleInfo = peopleOne.toString();
      System.out.println(peopleInfo);

//      String investigatorInfo = investigatorOne.toString();
//      System.out.println(investigatorInfo);
      
      String cellphonesInfo = cellphonesOne.toString();
      System.out.println(cellphonesInfo);
    }

    
}

