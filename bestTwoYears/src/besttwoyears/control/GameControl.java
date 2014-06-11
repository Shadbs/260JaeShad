/*
 *  GameControl.java: 
 *  startNewGame, startSavedGame
 *  createBagItemsList, createPeopleList
 *  createCellPhone/createPlanner
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.model.Person;
import besttwoyears.model.Scene;
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

        // Create list with array(?) or Call function 
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
        Person[] people = new Person[Constants.NUMBER_OF_PEOPLE];

        Person missionPres = new Person("President", "Hanson");
        people[Constants.MISSIONPRESIDENT] = missionPres;

        Person bishop = new Person("Bishop", "England");
        people[Constants.BISHOP] = bishop;

        Person maleMember = new Person("Brother", "Pyle");
        people[Constants.SMITH] = maleMember;

        Person femaleMember = new Person("Sister", "Guymen");
        people[Constants.GUYMEN] = femaleMember;

        Person mrJackson = new Person("Mr. ", "Jackson");
        people[Constants.MRJACKSON] = mrJackson;

        Person mrsJackson = new Person("Mrs. ", "Jackson");
        people[Constants.MRSJACKSON] = mrsJackson;

        Person sam = new Person("Sam", "Howler");
        people[Constants.SAM] = sam;

        Person jacob = new Person("Jacob", "Harman");
        people[Constants.JACOB] = jacob;

        Person ally = new Person("Ally", "Jacobs");
        people[Constants.ALEJANDRA] = ally;
        
        Person min = new Person("Min", "Lee");
        people[Constants.MIN] = min;

        GameControl.game.setPeople(people);
    }

    public static void createCellPhone() { // Just Like Ship (on B.Jackson's Code)?

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

//        Bottom is the Old Direction for the Class
        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        Location location = new Location();
        for (int row = 0; row < Constants.MAP_ROW_COUNT; row++) {
            for (int column = 0; column < Constants.MAP_COLUMN_COUNT; column++) {
            }
        }
    }

    private static Scene[] createScenes() {
        // 1. Create Initialized map, creating 2mentional array, 
        Map map = new Map();

        // 2. Create a list of Events
        // Scene[] scenes = createScenes(); 
        // B.Jackson help & just like createBagitemslist
        // BagItem[] bagItems = new BagItem[Constants.NUMBER_OF_BAGITEMS];
        Scene[] scenes = new Scene[Constants.NUMBER_OF_SCENES];

        Scene mtcBegin = new Scene();
        mtcBegin.setDescription("Entering MTC!");
        mtcBegin.setNoOfPeople(1);
        Person[] teacher = new Person[Constants.MTCTEACHER];  // Teacher
        scenes[Constants.MTCBEGIN] = mtcBegin;

        Scene apTraining = new Scene();
        apTraining.setDescription("In the Field, Tranined by AP");
        apTraining.setNoOfPeople(1);
        Person[] people = // AP
                scenes[Constants.AP_TRAINING] = apTraining;

        Scene samSTContacting = new Scene();
        samSTContacting.setDescription("Street Contact: SAM");
        samSTContacting.setNoOfPeople(1);
        Person[] people = // Sam
                scenes[Constants.SAMSTCONTACTING] = samSTContacting;

        Scene JacobTracting = new Scene();
        JacobTracting.setDescription("Tracting: Jacob");
        JacobTracting.setNoOfPeople(1);
        Person[] people = // Jacob
                scenes[Constants.JACOBTRACTING] = JacobTracting;

        Scene pday1 = new Scene();
        pday1.setDescription("1st P-Day");
        pday1.setNoOfPeople(0);
        scenes[Constants.PDAY1] = pday1;

        Scene mlMeal = new Scene();
        mlMeal.setDescription("Member Meal: Mission Leader");
        mlMeal.setNoOfPeople(1);
        Person[] people = // Mission Leader
                scenes[Constants.MLMEAL] = mlMeal;

        Scene malboronMobsAttack = new Scene();
        malboroMobsAttack.setDescription("Mob Attack: Malboron");
        malboroMobsAttack.setNoOfPeople(1);
        Person[] people = // Malboron
                scenes[Constants.MALBORONMOBSATTACK] = malboroMobsAttack;

        Scene samTeaching = new Scene();
        samTeaching.setDescription("Teaching: Sam with Bro.Smith");
        samTeaching.setNoOfPeople(2);
        Person[] people = // Sam
                Person[] people = // Brother Smith
                scenes[Constants.SAMTEACHING] = samTeaching;

        Scene aleTeaching = new Scene();
        aleTeaching.setDescription("Teaching: Alejandra");
        aleTeaching.setNoOfPeople(1);
        Person[] people = // Sam
                scenes[Constants.ALETEACHING] = aleTeaching;

        Scene service1 = new Scene();
        service1.setDescription("1st Service Project");
        service1.setNoOfPeople(0);
        scenes[Constants.SERVICE1] = service1;

        Scene minSTContacting = new Scene();
        minSTContacting.setDescription("Street Contact: Min");
        minSTContacting.setNoOfPeople(1);
        Person[] people = // Min
                scenes[Constants.MINSTCONTACTING] = minSTContacting;

        Scene baptism1 = new Scene();
        baptism1.setDescription("1st Baptism");
        baptism1.setNoOfPeople(1);
        Person[] people = // point fulfilled investigator
                scenes[Constants.BAPTISM1] = baptism1;

        Scene callingZL = new Scene();
        callingZL.setDescription("Zone Leader Called by Mission President");
        callingZL.setNoOfPeople(1);
        Person[] people = // Mission President
                scenes[Constants.CALLINGZL] = callingZL;

        Scene bishopMeal = new Scene();
        bishopMeal.setDescription("Member Meal: Bishop");
        bishopMeal.setNoOfPeople(1);
        Person[] people = // bishop
                scenes[Constants.BISHOPMEAL] = bishopMeal;

        Scene pday2 = new Scene();
        pday2.setDescription("2nd P-Day");
        pday2.setNoOfPeople(0);
        scenes[Constants.PDAY2] = pday2;

        Scene transfer = new Scene();
        transfer.setDescription("Transffered by Mission President");
        transfer.setNoOfPeople(1);
        Person[] people = // Mission President
                scenes[Constants.TRANSFER] = transfer;

        Scene koronaMobsAttack = new Scene();
        koronaMobsAttack.setDescription("Mob Attack: Korona");
        koronaMobsAttack.setNoOfPeople(1);
        Person[] people = // korona
                scenes[Constants.KORONAMOBSATTACK] = koronaMobsAttack;

        Scene proselytingJacksons = new Scene();
        proselytingJacksons.setDescription("Proselyting: The Jackson's");
        proselytingJacksons.setNoOfPeople(2);
        Person[] people = // Mr. Jackson
                Person[] people = // Mrs. Jackson
                scenes[Constants.PROSELYTINGJACKSONS] = proselytingJacksons;

        Scene service2 = new Scene();
        service2.setDescription("2nd Service Project");
        service2.setNoOfPeople(0);
        scenes[Constants.SERVICE2] = service2;

        Scene cocaMobsAttack = new Scene();
        cocaMobsAttack.setDescription("Mob Attack: Coca-Colly");
        cocaMobsAttack.setNoOfPeople(1);
        Person[] people = // Coca Cola
                scenes[Constants.COCAMOBSATTACK] = cocaMobsAttack;

        Scene kazTeaching = new Scene();
        kazTeaching.setDescription("Teaching: Kazyama");
        kazTeaching.setNoOfPeople(1);
        Person[] people = // Kaz
                scenes[Constants.KAZTEACHING] = kazTeaching;

        Scene katieSTContacting = new Scene();
        katieSTContacting.setDescription("Street Contact: Katie");
        katieSTContacting.setNoOfPeople(1);
        Person[] people = // Katie
                scenes[Constants.KATIESTCONTACTING] = katieSTContacting;

        Scene baptism2 = new Scene();
        baptism2.setDescription("2nd Baptism");
        baptism2.setNoOfPeople(1);
        Person[] people = // Point fulfilled investigator
                scenes[Constants.BAPTISM2] = baptism2;

        Scene welcomeHome = new Scene();
        welcomeHome.setDescription("Welcome Home & Return to Honor!");
        welcomeHome.setNoOfPeople(0);
        scenes[Constants.WELCOMHOME] = welcomeHome;

        return scenes;
    }

    private static void assginScenes(Map map, Scene[] scenes) {
//        3. Assign Events to location to map
//        assginScenes(map, scenes);   
    }

}
