/*
 *  GameControl.java: 
 *  startNewGame, startSavedGame
 *  createBagItemsList, createPeopleList
 *  createCellPhone/createPlanner
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.model.*;
import besttwoyears.view.*;
import java.io.Serializable;

/**
 * @author Shad & Jae
 */
public class GameControl {

    private static Game game;

    public static void startNewGame() {
        // create a new game
        GameControl.game = new Game();

        // save as current game
        BestTwoYears.setCurrentGame(game);

        // Create list with arrays in the Call functions
        BagItem[] bagItemList = GameControl.createBagItemsList(); // created bagItems list
        Person[] peopleList = GameControl.createPeopleList(); // created people list
        Cellphones[] cellphoneList = GameControl.createCellPhone(); // created the cellphone
        GameControl.createPlanner();   // created the planner
        GameControl.createMap();       // created & initialized the map

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
//        Cellphones[] cellphones = GameControl.createCellPhone();
//        GameControl.game.setCellphones(cellphones);
        // create gamePlanner & save in game
//        GamePlanner gamePlanner = GameControl.createPlanner();
//        GameControl.game.setGamePlanner(gamePlanner);
        // create map & save in game
//        Map map = GameControl.createMap();
//        GameControl.game.setMap(map); // create and initialize map
        // Move player to starting location in the map
//        MapControl.movePlayerToStartingLocation(0,0);
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

        Person sam = new Person("Sam", "Howler", "Lilly Circle");
        people[Constants.SAM] = sam;

        Person jacob = new Person("Jacob", "Harman", "Rocky Road");
        people[Constants.JACOB] = jacob;

        Person ally = new Person("Ally", "Jacobs", "Stone Creek Way");
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

    public static void createMap() {

        // Bottom is the Old Direction for the Class
        Location[][] map = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        Location location = new Location();
        for (int row = 0; row < Constants.MAP_ROW_COUNT; row++) {
            for (int column = 0; column < Constants.MAP_COLUMN_COUNT; column++) {
                Location eventLocation = new Location();
                eventLocation.setColumn(column);
                eventLocation.setRow(row);
                eventLocation.setVisited(false);

                map[row][column] = location;
            }
        }
    }

    public static SceneItem[] createSceneList(Person[] individual) {

        // Create a list of Events
        SceneItem[] scenes = new SceneItem[Constants.NUMBER_OF_SCENES];

        // 1st col
        SceneItem mtcBegin = new SceneItem();
        mtcBegin.setDescription("Entering MTC!");
        mtcBegin.setNoOfPeople(1);
        Person[] sceneTeacher = new Person[1];  // 0. Teacher
        sceneTeacher[0] = individual[Constants.MTCTEACHER];
        mtcBegin.setScenePeople(sceneTeacher);
        scenes[Constants.MTCBEGIN] = mtcBegin;

        SceneItem apTraining = new SceneItem();
        apTraining.setDescription("In the Field, Tranined by AP");
        apTraining.setNoOfPeople(1);
        Person[] sceneAP = new Person[1];  // 1. AP
        sceneAP[0] = individual[Constants.AP];
        apTraining.setScenePeople(sceneAP);
        scenes[Constants.AP_TRAINING] = apTraining;

        SceneItem samSTContacting = new SceneItem();
        samSTContacting.setDescription("Street Contact: SAM");
        samSTContacting.setNoOfPeople(1);
        Person[] sceneSam = new Person[1]; //2. Sam
        sceneSam[0] = individual[Constants.SAM];
        samSTContacting.setScenePeople(sceneSam);
        scenes[Constants.SAM_STCONTACTING] = samSTContacting;

        SceneItem jacobTracting = new SceneItem();
        jacobTracting.setDescription("Tracting: Jacob");
        jacobTracting.setNoOfPeople(1);
        Person[] sceneJacob = new Person[1];  // 3. Jacob
        sceneJacob[0] = individual[Constants.JACOB];
        jacobTracting.setScenePeople(sceneJacob);
        scenes[Constants.JACOB_TRACTING] = jacobTracting;

        SceneItem pday1 = new SceneItem();
        pday1.setDescription("1st P-Day"); // 4. P-day1
        pday1.setNoOfPeople(0);
        scenes[Constants.PDAY1] = pday1;

        // 2nd col
        SceneItem mlMeal = new SceneItem();
        mlMeal.setDescription("Member Meal: Mission Leader");
        mlMeal.setNoOfPeople(1);
        Person[] sceneMLMeal = new Person[1];  // 5. Mission Leader
        sceneMLMeal[0] = individual[Constants.MISSIONLEADER];
        mlMeal.setScenePeople(sceneMLMeal);
        scenes[Constants.ML_MEAL] = mlMeal;

        SceneItem malboronMobsAttack = new SceneItem();
        malboronMobsAttack.setDescription("Mob Attack: Malboron");
        malboronMobsAttack.setNoOfPeople(1);
        Person[] scenemalboronMobsAttack = new Person[1];
        scenemalboronMobsAttack[0] = individual[Constants.MALBORON];
        malboronMobsAttack.setScenePeople(scenemalboronMobsAttack);
        scenes[Constants.MALBORON_MOBSATTACK] = malboronMobsAttack;

        SceneItem samTeaching = new SceneItem();
        samTeaching.setDescription("Teaching: Sam with Bro.Smith");
        samTeaching.setNoOfPeople(2);
        Person[] sceneSamTeaching = new Person[2]; // 7. Sam & Brothe Smith
        sceneSamTeaching[0] = individual[Constants.SAM];//Sam
        sceneSamTeaching[1] = individual[Constants.SMITH];//B.Smith
        samTeaching.setScenePeople(sceneSamTeaching);
        scenes[Constants.SAM_TEACHING] = samTeaching;

        SceneItem aleTeaching = new SceneItem();
        aleTeaching.setDescription("Teaching: Alejandra");
        aleTeaching.setNoOfPeople(1);
        Person[] sceneAleTeaching = new Person[1]; // 8. Ale
        sceneAleTeaching[0] = individual[Constants.ALEJANDRA];
        aleTeaching.setScenePeople(sceneAleTeaching);
        scenes[Constants.ALE_TEACHING] = aleTeaching;

        SceneItem serice1 = new SceneItem();
        serice1.setDescription("1st Service");
        serice1.setNoOfPeople(0); // 9. Service (No one)
        scenes[Constants.SERVICE1] = serice1;

        // 3rd col
        SceneItem minSTContacting = new SceneItem();
        minSTContacting.setDescription("Street Contact: Min");
        minSTContacting.setNoOfPeople(1); // 10. Min
        Person[] sceneMinSTContacting = new Person[1];
        sceneMinSTContacting[0] = individual[Constants.MIN];
        minSTContacting.setScenePeople(sceneMinSTContacting);
        scenes[Constants.MIN_STCONTACTING] = minSTContacting;

        // Any investigator that reaches the highest points will be baptized. 
        // Need to be edited 
        SceneItem baptism1 = new SceneItem();
        baptism1.setDescription("1st Baptism");
        baptism1.setNoOfPeople(1); // could be multiple?
        Person[] sceneBaptism1 = new Person[1]; // 11. Baptism1
        sceneBaptism1[0] = individual[Constants.MIN]; // who else? Just say Min
        baptism1.setScenePeople(sceneBaptism1);
        scenes[Constants.BAPTISM1] = baptism1;

        SceneItem callingZL = new SceneItem();
        callingZL.setDescription("Zone Leader Calling");
        callingZL.setNoOfPeople(1); // 12. ZL calling
        Person[] sceneCallingZL = new Person[1];
        sceneCallingZL[0] = individual[Constants.MISSIONPRESIDENT];
        callingZL.setScenePeople(sceneCallingZL);
        scenes[Constants.ZL_CALLING] = callingZL;

        SceneItem bishopMeal = new SceneItem();
        bishopMeal.setDescription("Member Meal: Bishop");
        bishopMeal.setNoOfPeople(1); // 13. Bishop Meal
        Person[] sceneBishopMeal = new Person[1];
        sceneBishopMeal[0] = individual[Constants.BISHOP];
        bishopMeal.setScenePeople(sceneBishopMeal);
        scenes[Constants.BISHOP_MEAL] = bishopMeal;

        SceneItem pday2 = new SceneItem();
        pday2.setDescription("2nd P-Day"); // 14. P-day2
        pday2.setNoOfPeople(0);
        scenes[Constants.PDAY2] = pday2;

        // 4th col
        SceneItem transfer = new SceneItem();
        transfer.setDescription("Transffered by Mission President");
        transfer.setNoOfPeople(1);  // 15. Transfer: Just Print out Message
        Person[] sceneTransfer = new Person[1];
        sceneTransfer[0] = individual[Constants.MISSIONPRESIDENT];
        transfer.setScenePeople(sceneTransfer);
        scenes[Constants.TRANSFER] = transfer;

        SceneItem koronaMobsAttack = new SceneItem();
        koronaMobsAttack.setDescription("Mob Attack: Korona");
        koronaMobsAttack.setNoOfPeople(1); // 16. Korona Mobs Attack
        Person[] sceneKoronaMobsAttack = new Person[1];
        sceneKoronaMobsAttack[0] = individual[Constants.KORONA];
        koronaMobsAttack.setScenePeople(sceneKoronaMobsAttack);
        scenes[Constants.KORONA_MOBSATTACK] = koronaMobsAttack;

        SceneItem proselytingJacksons = new SceneItem();
        proselytingJacksons.setDescription("Proselyting: The Jackson's");
        proselytingJacksons.setNoOfPeople(2); // 17 Proselyting: Jackson
        Person[] sceneProselytingJacksons = new Person[2];
        sceneProselytingJacksons[0] = individual[Constants.MRJACKSON];
        sceneProselytingJacksons[1] = individual[Constants.MRSJACKSON];
        proselytingJacksons.setScenePeople(sceneProselytingJacksons);
        scenes[Constants.JACKSONS_PROSELYTING] = proselytingJacksons;

        SceneItem teachingJacksons = new SceneItem();
        teachingJacksons.setDescription("Teaching: The Jackson's");
        teachingJacksons.setNoOfPeople(2); // 18. Teacihng: Jackson
        Person[] sceneTeachingJacksons = new Person[2];
        sceneTeachingJacksons[0] = individual[Constants.MRJACKSON];
        sceneTeachingJacksons[1] = individual[Constants.MRSJACKSON];
        teachingJacksons.setScenePeople(sceneTeachingJacksons);
        scenes[Constants.JACKSONS_TEACHING] = teachingJacksons;
        
        SceneItem service2 = new SceneItem();
        service2.setDescription("2nd Service");
        service2.setNoOfPeople(0); // 19. Service2 (No one)
        scenes[Constants.SERVICE2] = service2;

        // 5th col
        SceneItem cocaMobsAttack = new SceneItem();
        cocaMobsAttack.setDescription("Mob Attack: Coca-Colly");
        cocaMobsAttack.setNoOfPeople(1); // 20. Coca-Colly Attack
        Person[] sceneCocaMobsAttack = new Person[1];
        sceneCocaMobsAttack[0] = individual[Constants.COCACOLLY];
        cocaMobsAttack.setScenePeople(sceneCocaMobsAttack);
        scenes[Constants.COCA_MOBSATTACK] = cocaMobsAttack;

        SceneItem kazTeaching = new SceneItem();
        kazTeaching.setDescription("Teaching: Kazyama");
        kazTeaching.setNoOfPeople(1); //21. Kaz
        Person[] sceneKazTeaching = new Person[1];
        sceneKazTeaching[0] = individual[Constants.KAZYAMA];
        kazTeaching.setScenePeople(sceneKazTeaching);
        scenes[Constants.KAZ_TEACHING] = kazTeaching;

        SceneItem katieSTContacting = new SceneItem();
        katieSTContacting.setDescription("Street Contact: Katie");
        katieSTContacting.setNoOfPeople(1); //22. Katie
        Person[] sceneKatieSTContacting = new Person[1];
        sceneKatieSTContacting[0] = individual[Constants.KATIE];
        katieSTContacting.setScenePeople(sceneKatieSTContacting);
        scenes[Constants.KATIE_STCONTACTING] = katieSTContacting;

        // Any investigator that reaches the highest points will be baptized. 
        // Need to be edited 
        SceneItem baptism2 = new SceneItem();
        baptism2.setDescription("2nd Baptism"); // 23. Baptism 
        baptism2.setNoOfPeople(1); // could be multiple?
        Person[] sceneBaptism2 = new Person[1]; // 11. Baptism1
        sceneBaptism2[0] = individual[Constants.SAM]; // who else? just say SAM
        baptism2.setScenePeople(sceneBaptism2);
        scenes[Constants.BAPTISM2] = baptism2;

        SceneItem welcomeHome = new SceneItem();
        welcomeHome.setDescription("Welcome Home & Return to Honor!");
        welcomeHome.setNoOfPeople(0); // 24. The END
        scenes[Constants.WELCOMHOME] = welcomeHome;

        return scenes;
    }

    public static SceneItem[] getSortedSceneItems() {
        // get the scene list
        SceneItem[] sceneItems = GameControl.game.getScenes();
        SceneList.sortScene(sceneItems); // sort the list of scenes
        return sceneItems;
    }

    private static void assginScenesToLocation(Map map, SceneItem[] scenes) {
//        3. Assign Events to location to map
//        assginScenes(map, scenes);   
        Location[][] location = map.getLocation();

        location[0][0].setScene(scenes[Constants.MTCBEGIN]);
        location[0][1].setScene(scenes[Constants.AP_TRAINING]);
        location[0][2].setScene(scenes[Constants.SAM_STCONTACTING]);
        location[0][3].setScene(scenes[Constants.JACOB_TRACTING]);
        location[0][4].setScene(scenes[Constants.PDAY1]);

        location[1][0].setScene(scenes[Constants.ML_MEAL]);
        location[1][1].setScene(scenes[Constants.MALBORON_MOBSATTACK]);
        location[1][2].setScene(scenes[Constants.SAM_TEACHING]);
        location[1][3].setScene(scenes[Constants.ALE_TEACHING]);
        location[1][4].setScene(scenes[Constants.SERVICE1]);

        location[2][0].setScene(scenes[Constants.MIN_STCONTACTING]);
        location[2][1].setScene(scenes[Constants.BAPTISM1]);
        location[2][2].setScene(scenes[Constants.ZL_CALLING]);
        location[2][3].setScene(scenes[Constants.BISHOP_MEAL]);
        location[2][4].setScene(scenes[Constants.PDAY2]);

        location[3][0].setScene(scenes[Constants.TRANSFER]);
        location[3][1].setScene(scenes[Constants.KORONA_MOBSATTACK]);
        location[3][2].setScene(scenes[Constants.JACKSONS_PROSELYTING]);
        location[3][3].setScene(scenes[Constants.JACKSONS_TEACHING]);
        location[3][4].setScene(scenes[Constants.SERVICE2]);

        location[4][0].setScene(scenes[Constants.COCA_MOBSATTACK]);
        location[4][1].setScene(scenes[Constants.KAZ_TEACHING]);
        location[4][2].setScene(scenes[Constants.KATIE_STCONTACTING]);
        location[4][3].setScene(scenes[Constants.BAPTISM2]);
        location[4][4].setScene(scenes[Constants.WELCOMHOME]);

    }

}
