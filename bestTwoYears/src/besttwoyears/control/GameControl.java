/*
 * To change this license header, choose License Headers in Project Properties.
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.model.*;
import besttwoyears.view.*;

/**
 * @author Shad & Jae
 */
class GameControl {

    private static Game game;

    public static void startNewGame() {
        // create a new game
        GameControl.game = new Game();

        // save as current game
        BestTwoYears.setCurrentGame(game);
        
        // Create list with array or Call function 
        GameControl.createBagItemsList();   // create bagItems list
        GameControl.createPeopleList();     // create people list
        GameControl.createCellPhone();      // create the cellphone
        GameControl.createPlanner();        // create the planner
        GameControl.createMap();            // create & initialize the map

        // move player to starting position
        MapControl.locatePeople();
    }

    public static void startSavedGame() {
        System.out.println("\n Calling startSaveGame Stub function");
    }

    public static void createBagItemsList() {
        // String[] bagItems = new String[Constants.NUMBER_OF_BAGITEMS];    Keep this?

        // create array list of inventory items
        BagItems[] bagItems = new BagItems[Constants.NUMBER_OF_BAGITEMS];

        BagItems scripture = new BagItems();
        scripture.setDescription("Scripture");
        scripture.setQuantityInStock(0);
        scripture.setRequiredAmount(0);
        bagItems[Constants.SCRIPTURE] = scripture;

        BagItems bookofMormon = new BagItems();
        bookofMormon.setDescription("Book of Mormon");
        bookofMormon.setQuantityInStock(0);
        bookofMormon.setRequiredAmount(0);
        bagItems[Constants.BOOKOFMORMON] = bookofMormon;

        BagItems passAlongCard = new BagItems();
        passAlongCard.setDescription("Pass-Along Card");
        passAlongCard.setQuantityInStock(0);
        passAlongCard.setRequiredAmount(0);
        bagItems[Constants.PASSALONGCARD] = passAlongCard;

        BagItems familyPics = new BagItems();
        familyPics.setDescription("Family Picture");
        familyPics.setQuantityInStock(0);
        familyPics.setRequiredAmount(0);
        bagItems[Constants.FAMILYPICS] = familyPics;
    }

    public static void createPeopleList() {
        String[] people = new String[Constants.NUMBER_OF_PEOPLE];

        people[Constants.MISSIONPRESIDENT] = "Mission President"; 
        people[Constants.BISHOP] = "Bishop";
        people[Constants.SMITH] = "Brother Smith";
        
        people[Constants.JACKSON] = "Mr. Jackson";
        people[Constants.MRSJACKSON] = "Mrs. Jackson";
        
        people[Constants.SAM] = "Sam";
        people[Constants.JACOB] = "Jacob";
        people[Constants.ALEJANDRA] = "Alejandra";
        people[Constants.MIN] = "Min";

        GameControl.game.setPeople(people);
    }

    public static void createCellPhone() {  

        // How to connect GameCall(view)?
        Cellphones cellphone = new Cellphones();
        System.out.println("\n Calling the createCellPhone stub function");
    }

    public static void createPlanner() {    
        
        // How to connect GamePlanner(view)?
        GamePlanner gamePlanner = new GamePlanner();
        System.out.println("\n Calling the createPlanner stub function");
    }

    public static void createMap() {
        // Two dimentional array thing, Plan: 5x5=25 scene
        // System.out.println("\n Calling the createMap stub function");
        
//        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
//        Location location = new Location();
        
        for (int row = 0; row < Constants.MAP_ROW_COUNT; row++) {
            for (int column = 0; column < Constants.MAP_COLUMN_COUNT; column++) {
            }
        }
    }

}
