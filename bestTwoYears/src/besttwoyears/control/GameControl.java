/*
 *  GameControl.java: 
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.model.*;
import besttwoyears.view.*;

/**
 * @author Shad & Jae
 */
public class GameControl {

    public static Game game;

    public static void startNewGame() {
        // create a new game
        GameControl.game = new Game();

        // save as current game
        BestTwoYears.setCurrentGame(game);

        // Create list with arrays in the Call functions
        BagItem[] bagItemList = GameControl.createBagItemsList();   // created bagItems list
        Person[] peopleList = GameControl.createPeopleList();       // created people list
        Cellphones[] cellphoneList = GameControl.createCellPhone(); // created the cellphone
        GameControl.createPlanner();   // created the planner
        MapControl.createMap();       // created & initialized the map
        

        // connect to Game.java
        game.setBagItems(bagItemList);
        game.setPeople(peopleList);
        game.setCellphones(cellphoneList);
        game.setGamePlanner(null);
        game.setMap(null);

        // move player to starting position
        MapControl.locatePlayerToStartingPosition(0, 0); // from (0,0) - MTC
    }

    public static void createNewGame(Player player) { // Creating new game and all associate objects. 

        // Create a new game
        GameControl.game = new Game();

        // set currentGame = new games
        BestTwoYears.setCurrentGame(game);

        // set & save player created earlier in game
        GameControl.game.setPlayer(BestTwoYears.getPlayer());

        // create list of people and save in game
        Person[] people = GameControl.createPeopleList();
        GameControl.game.setPeople(people);

        // create list of bagItems and save in game
        BagItem[] bagItems = GameControl.createBagItemsList();
        GameControl.game.setBagItems(bagItems);

        // create list of cellphone & save in game    
        //   Cellphones[] cellphones = GameControl.createCellPhone();
        //   GameControl.game.setCellphones(cellphones);
        
        // create gamePlanner & save in game
        //   GamePlanner gamePlanner = GameControl.createPlanner();
        //   GameControl.game.setGamePlanner(gamePlanner);
        
        // create map & save in game
        MapControl.createMap();
        
        // Move player to starting location in the map
        MapControl.locatePlayerToStartingPosition(0,0);
    }

    public static void startSavedGame() {
        System.out.println("\n Calling startSaveGame Stub function");
    }

    public static BagItem[] createBagItemsList() {

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

        return bagItems;
    }

    public static BagItem[] getSortedBagItems() {
        // get the players bag
        BagItem[] bagItems = GameControl.game.getBagItems();
        BagList.sortBag(bagItems); // sort the list of bagitems
        return bagItems;
    }

    public static Person[] createPeopleList() {
        Person[] people = new Person[Constants.NUMBER_OF_PEOPLE]; // Create List of Person

        Person missionPres = new Person("President", "Hanson", "54 Rhonda Lane"); // Create new person
        people[Constants.MISSIONPRESIDENT] = missionPres; // Save person in arrary

        Person bishop = new Person("Bishop", "England", "77 Stanely Road");
        people[Constants.BISHOP] = bishop;

        Person maleMember = new Person("Brother", "Pyle", "32 Hawthorn Drive");
        people[Constants.SMITH] = maleMember;

        Person femaleMember = new Person("Sister", "Guymen", "66 Rose Way");
        people[Constants.GUYMEN] = femaleMember;

        Person mrJackson = new Person("Mr. ", "Jackson", "73 Polar Baear Drive");
        people[Constants.MRJACKSON] = mrJackson;

        Person mrsJackson = new Person("Mrs. ", "Jackson", "Dialga Street");
        people[Constants.MRSJACKSON] = mrsJackson;

        Person sam = new Person("Sam", "Howler", "76 Lilly Circle");
        people[Constants.SAM] = sam;

        Person jacob = new Person("Jacob", "Harman", "43 Rocky Road");
        people[Constants.JACOB] = jacob;

        Person ally = new Person("Ally", "Jacobs", "88 Stone Creek Way");
        people[Constants.ALEJANDRA] = ally;

        Person min = new Person("Min", "Lee", "Harverd Street");
        people[Constants.MIN] = min;

        Person ap = new Person("President", "Perkins", "65 Colfax way");
        people[Constants.AP] = ap;

        Person mtcTeach = new Person("Elder", "Thomas", "Room 69");
        people[Constants.MTCTEACHER] = mtcTeach;

        Person malborn = new Person("Jose", "Malboron", "55 Straw street #7");
        people[Constants.MALBORON] = malborn;

        Person korana = new Person("Korana", "Madisma", "West 12th Street");
        people[Constants.KORONA] = korana;

        Person mishLead = new Person("Elder", "Greenwood", "45 South Cranberry");
        people[Constants.MISSIONLEADER] = mishLead;

        Person kate = new Person("Katie", "Haupt", "64 Garden Street");
        people[Constants.KATIE] = kate;

        Person kaz = new Person("Kazyama", "Miyaka", "88 Kim street");
        people[Constants.KAZYAMA] = kaz;

        Person coco = new Person("Cocacolly", "Pepsina", "South 8th Street");
        people[Constants.COCACOLLY] = coco;

        GameControl.game.setPeople(people);
        return people;
    }

    public static Cellphones[] createCellPhone() { // Just Like Ship (on B.Jackson's Code)?

        // How to connect GameCall(view)?
        Cellphones[] cellphone = new Cellphones[Constants.PHONE_NUMBERS];

        Cellphones mrjacksonnum = new Cellphones(5555665);
        cellphone[Constants.MRJACKSONNUM] = mrjacksonnum;

        Cellphones mrsjacksonnum = new Cellphones(5555664);
        cellphone[Constants.MRSJACKSONNUM] = mrsjacksonnum;

        Cellphones samnum = new Cellphones(5555785);
        cellphone[Constants.SAMNUM] = samnum;

        Cellphones jacobnum = new Cellphones(5559925);
        cellphone[Constants.JACOBNUM] = jacobnum;

        Cellphones allynum = new Cellphones(5553654);
        cellphone[Constants.ALEJANDRANUM] = allynum;

        Cellphones minnum = new Cellphones(5559647);
        cellphone[Constants.MINNUM] = minnum;

        Cellphones kazyamanum = new Cellphones(5554966);
        cellphone[Constants.KAZYAMANUM] = kazyamanum;

        Cellphones katienum = new Cellphones(5556824);
        cellphone[Constants.KATIENUM] = katienum;

        Cellphones guymannum = new Cellphones(5556584);
        cellphone[Constants.GUYMENNUM] = guymannum;

        return cellphone;
    }

    public static void createPlanner() {

        // How to connect GamePlanner(view)?
        GamePlanner gamePlanner = new GamePlanner();

    }

   

}
