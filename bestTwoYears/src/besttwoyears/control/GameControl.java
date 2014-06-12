/*
 *  GameControl.java: 
 *  startNewGame, startSavedGame
 *  createBagItemsList, createPeopleList
 *  createCellPhone/createPlanner
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.model.*;
import besttwoyears.model.Person;
import besttwoyears.model.Scene;
import besttwoyears.view.*;
import besttwoyears.model.*;

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
        cellphone[Constants.MRJACKSONNUM] = katienum;

        Cellphones guymannum = new Cellphones(5556584);
        cellphone[Constants.GUYMENNUM] = guymannum;
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

    private static Scene[] createScenes(Person[] personList) {
        // 1. Create Initialized map, creating 2mentional array, 
        Map map = new Map();

        // 2. Create a list of Events
        // Scene[] scenes = createScenes(); 
        Scene[] scenes = new Scene[Constants.NUMBER_OF_SCENES];

        // 1st col
        Scene mtcBegin = new Scene();
        mtcBegin.setDescription("Entering MTC!");
        mtcBegin.setNoOfPeople(1);
        Person[] sceneTeacher = new Person[1];  // 0. Teacher
        sceneTeacher[0] = personList[Constants.MTCTEACHER];
        mtcBegin.setScenePeople(sceneTeacher);
        scenes[Constants.MTCBEGIN] = mtcBegin;

        Scene apTraining = new Scene();
        apTraining.setDescription("In the Field, Tranined by AP");
        apTraining.setNoOfPeople(1);
        Person[] sceneAP = new Person[1];  // 1. AP
        sceneAP[1] = personList[Constants.AP];
        apTraining.setScenePeople(sceneAP);
        scenes[Constants.AP_TRAINING] = apTraining;

        Scene samSTContacting = new Scene();
        samSTContacting.setDescription("Street Contact: SAM");
        samSTContacting.setNoOfPeople(1);
        Person[] sceneSam = new Person[1]; //2. Sam
        sceneSam[2] = personList[Constants.SAM];
        samSTContacting.setScenePeople(sceneSam);
        scenes[Constants.SAM_STCONTACTING] = samSTContacting;

        Scene jacobTracting = new Scene();
        jacobTracting.setDescription("Tracting: Jacob");
        jacobTracting.setNoOfPeople(1);
        Person[] sceneJacob = new Person[1];  // 3. Jacob
        sceneJacob[3] = personList[Constants.JACOB];
        jacobTracting.setScenePeople(sceneJacob);
        scenes[Constants.JACOB_TRACTING] = jacobTracting;

        Scene pday1 = new Scene();
        pday1.setDescription("1st P-Day"); // 4. P-day1
        pday1.setNoOfPeople(0);
        scenes[Constants.PDAY1] = pday1;

        // 2nd col
        Scene mlMeal = new Scene();
        mlMeal.setDescription("Member Meal: Mission Leader");
        mlMeal.setNoOfPeople(1);
        Person[] sceneMLMeal = new Person[1];  // 5. Mission Leader
        sceneMLMeal[5] = personList[Constants.MISSIONLEADER];
        mlMeal.setScenePeople(sceneMLMeal);
        scenes[Constants.ML_MEAL] = mlMeal;

        Scene malboronMobsAttack = new Scene();  // 6. MalboroMobAttack
        malboronMobsAttack.setDescription("Mob Attack: Malboron");
        malboronMobsAttack.setNoOfPeople(1);
        Person[] scenemalboronMobsAttack = new Person[1];
        scenemalboronMobsAttack[6] = personList[Constants.MALBORON];
        malboronMobsAttack.setScenePeople(scenemalboronMobsAttack);
        scenes[Constants.MALBORON_MOBSATTACK] = malboronMobsAttack;

        Scene samTeaching = new Scene();
        samTeaching.setDescription("Teaching: Sam with Bro.Smith");
        samTeaching.setNoOfPeople(2);
        Person[] sceneSamTeaching = new Person[2]; // 7. Sam & Brothe Smith
        sceneSamTeaching[7] = personList[Constants.SAM];//Sam
        sceneSamTeaching[7] = personList[Constants.SMITH];//B.Smith
        samTeaching.setScenePeople(sceneSamTeaching);
        scenes[Constants.SAM_TEACHING] = samTeaching;

        Scene aleTeaching = new Scene();
        aleTeaching.setDescription("Teaching: Alejandra");
        aleTeaching.setNoOfPeople(1);
        Person[] sceneAleTeaching = new Person[1]; // 8. Ale
        sceneAleTeaching[8] = personList[Constants.ALEJANDRA];
        aleTeaching.setScenePeople(sceneAleTeaching);
        scenes[Constants.ALE_TEACHING] = aleTeaching;

        Scene serice1 = new Scene();
        serice1.setDescription("1st Service");
        serice1.setNoOfPeople(0); // 9. Service (No one)
        scenes[Constants.SERVICE1] = serice1;

        // 3rd col
        Scene minSTContacting = new Scene();
        minSTContacting.setDescription("Street Contact: Min");
        minSTContacting.setNoOfPeople(1); // 10. Min
        Person[] sceneMinSTContacting = new Person[1];
        sceneMinSTContacting[10] = personList[Constants.MIN];
        minSTContacting.setScenePeople(sceneMinSTContacting);
        scenes[Constants.MIN_STCONTACTING] = minSTContacting;

        // Any investigator that reaches the highest points will be baptized. 
        // Need to be edited 
        Scene baptism1 = new Scene();
        baptism1.setDescription("1st Baptism");
        baptism1.setNoOfPeople(1); // could be multiple?
        Person[] sceneBaptism1 = new Person[1]; // 11. Baptism1
        sceneBaptism1[11] = personList[Constants.MIN]; // who else? Just say Min
        baptism1.setScenePeople(sceneBaptism1);
        scenes[Constants.BAPTISM1] = baptism1;

        Scene callingZL = new Scene();
        callingZL.setDescription("Zone Leader Calling");
        callingZL.setNoOfPeople(1); // 12. ZL calling
        Person[] sceneCallingZL = new Person[1];
        sceneCallingZL[12] = personList[Constants.MISSIONPRESIDENT];
        callingZL.setScenePeople(sceneCallingZL);
        scenes[Constants.ZL_CALLING] = callingZL;

        Scene bishopMeal = new Scene();
        bishopMeal.setDescription("Member Meal: Bishop");
        bishopMeal.setNoOfPeople(1); // 13. Bishop Meal
        Person[] sceneBishopMeal = new Person[1];
        sceneBishopMeal[13] = personList[Constants.BISHOP];
        bishopMeal.setScenePeople(sceneBishopMeal);
        scenes[Constants.BISHOP_MEAL] = bishopMeal;

        Scene pday2 = new Scene();
        pday2.setDescription("2nd P-Day"); // 14. P-day2
        pday2.setNoOfPeople(0);
        scenes[Constants.PDAY2] = pday2;

        // 4th col
        Scene transfer = new Scene();
        transfer.setDescription("Transffered by Mission President");
        transfer.setNoOfPeople(1);  // 15. Transfer: Just Print out Message
        Person[] sceneTransfer = new Person[1];
        sceneTransfer[15] = personList[Constants.MISSIONPRESIDENT];
        transfer.setScenePeople(sceneTransfer);
        scenes[Constants.TRANSFER] = transfer;

        Scene koronaMobsAttack = new Scene();
        koronaMobsAttack.setDescription("Mob Attack: Korona");
        koronaMobsAttack.setNoOfPeople(1); // 16. Korona Mobs Attack
        Person[] sceneKoronaMobsAttack = new Person[1];
        sceneKoronaMobsAttack[16] = personList[Constants.KORONA];
        koronaMobsAttack.setScenePeople(sceneKoronaMobsAttack);
        scenes[Constants.KORONA_MOBSATTACK] = koronaMobsAttack;

        Scene proselytingJacksons = new Scene();
        proselytingJacksons.setDescription("Proselyting: The Jackson's");
        proselytingJacksons.setNoOfPeople(2); // 17 Proselyting: Jackson
        Person[] sceneProselytingJacksons = new Person[1];
        sceneProselytingJacksons[17] = personList[Constants.MRJACKSON];
        sceneProselytingJacksons[17] = personList[Constants.MRSJACKSON];
        proselytingJacksons.setScenePeople(sceneProselytingJacksons);
        scenes[Constants.JACKSONS_PROSELYTING] = proselytingJacksons;

        Scene service2 = new Scene();
        service2.setDescription("2nd Service");
        service2.setNoOfPeople(0); // 19. Service2 (No one)
        scenes[Constants.SERVICE2] = service2;

        // 5th col
        Scene cocaMobsAttack = new Scene();
        cocaMobsAttack.setDescription("Mob Attack: Coca-Colly");
        cocaMobsAttack.setNoOfPeople(1); // 20. Coca-Colly Attack
        Person[] sceneCocaMobsAttack = new Person[1];
        sceneCocaMobsAttack[20] = personList[Constants.COCACOLLY];
        cocaMobsAttack.setScenePeople(sceneCocaMobsAttack);
        scenes[Constants.COCA_MOBSATTACK] = cocaMobsAttack;

        Scene kazTeaching = new Scene();
        kazTeaching.setDescription("Teaching: Kazyama");
        kazTeaching.setNoOfPeople(1); //21. Kaz
        Person[] sceneKazTeaching = new Person[1];
        sceneKazTeaching[21] = personList[Constants.KAZYAMA];
        kazTeaching.setScenePeople(sceneKazTeaching);
        scenes[Constants.KAZ_TEACHING] = kazTeaching;

        Scene katieSTContacting = new Scene();
        katieSTContacting.setDescription("Street Contact: Katie");
        katieSTContacting.setNoOfPeople(1); //22. Katie
        Person[] sceneKatieSTContacting = new Person[1];
        sceneKatieSTContacting[22] = personList[Constants.KATIE];
        katieSTContacting.setScenePeople(sceneKatieSTContacting);
        scenes[Constants.KATIE_STCONTACTING] = katieSTContacting;

        // Any investigator that reaches the highest points will be baptized. 
        // Need to be edited 
        Scene baptism2 = new Scene();
        baptism2.setDescription("2nd Baptism"); // 23. Baptism 
        baptism2.setNoOfPeople(1); // could be multiple?
        Person[] sceneBaptism2 = new Person[1]; // 11. Baptism1
        sceneBaptism2[11] = personList[Constants.SAM]; // who else? just say SAM
        baptism2.setScenePeople(sceneBaptism2);
        scenes[Constants.BAPTISM2] = baptism2;

        Scene welcomeHome = new Scene();
        welcomeHome.setDescription("Welcome Home & Return to Honor!");
        welcomeHome.setNoOfPeople(0); // 24. The END
        scenes[Constants.WELCOMHOME] = welcomeHome;
        return scenes;
    }

    private static void assginScenes(Map map, Scene[] scenes) {
//        3. Assign Events to location to map
//        assginScenes(map, scenes);   
//        Locaiton [][] location = map.getLocation();
//        location[0][0].setScene(scene[Constants.MTCBEGIN]);
    }

}
