/*
 * GameControl.java: 
 *  startNewGame, startSavedGame
 *  createBagItemsList, createPeopleList
 *  createCellPhone/createPlanner
 * 
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
        BagItem[] bagItems = new BagItem[Constants.NUMBER_OF_BAGITEMS];

        BagItem scripture = new BagItem();
        scripture.setDescription("Scripture");
        scripture.setQuantityInStock(0);
        scripture.setRequiredAmount(0);
        bagItems[Constants.SCRIPTURE] = scripture;

        BagItem bookofMormon = new BagItem();
        bookofMormon.setDescription("Book of Mormon");
        bookofMormon.setQuantityInStock(0);
        bookofMormon.setRequiredAmount(0);
        bagItems[Constants.BOOKOFMORMON] = bookofMormon;

        BagItem passAlongCard = new BagItem();
        passAlongCard.setDescription("Pass-Along Card");
        passAlongCard.setQuantityInStock(0);
        passAlongCard.setRequiredAmount(0);
        bagItems[Constants.PASSALONGCARD] = passAlongCard;

        BagItem familyPics = new BagItem();
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
        // Two dimentional array thing, Plan: 5x5=25 scene, Scene/Map/Location Class in Model.
        
        // 1. Create Initialized map
        Map map = new Map();
        
        // 2. Create a list of Events
        Scene[] scenes = createScenes(); // just like createScenes items
        
        // 3. Assign Events to location to map
        assginScenes(map, scenes);   

//        Here is Old Direction for the Class
//        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
//        Location location = new Location();        
//        for (int row = 0; row < Constants.MAP_ROW_COUNT; row++) {
//            for (int column = 0; column < Constants.MAP_COLUMN_COUNT; column++) {}
        }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assginScenes(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
