/*
 * MapControl
 * 
 * public static void locatePlayerToStartingPosition(int row, int col)
 * public void movePlayerToLocation(int row, int col)
 * public static void createMap()
 * public static SceneItem[] createSceneList(Person[] individual)
 * public static SceneItem[] getSortedSceneItems()
 * private static Location[][] assginScenesToLocation(Map map, SceneItem[] scenes)
 * 
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.exeption.BestTwoYearsException;
import besttwoyears.model.Location;
import besttwoyears.model.Map;
import besttwoyears.model.Person;
import besttwoyears.model.SceneItem;
import besttwoyears.model.SceneList;

/*
 * @author Shad
 */
public class MapControl {

    public static void locatePlayerToStartingPosition(int row, int col) {
        System.out.println("Let's Start, Go to the MTC!"); 
        // how to bring player to move other position? We haven't go through yet
    }

    public void movePlayerToLocation(int row, int col)
            throws BestTwoYearsException {

        Map map = besttwoyears.BestTwoYears.getCurrentGame().getMap();

        if (row < 1 || col < 1 || row > map.getNumOfRows() || row > map.getNumOfCols()) {
            throw new BestTwoYearsException("Invalid Scene Number, Please Type Again");
        }
    }

        //    public movePlayer throws CWException {
        //        for (Player player : player) {
        //          movePlayerToLocation(int row, int col);
        //        }   
        //    }
    
    public static void createMap() {

        // create map object
        Map map = new Map();

        // save (set) the map in the current game
        BestTwoYears.getCurrentGame().setMap(map);

        // create 2-d array of locations
        Location[][] mapLocations = new Location[Constants.MAP_ROW_COUNT][Constants.MAP_COLUMN_COUNT];
        Location location = new Location();
        for (int row = 0; row < Constants.MAP_ROW_COUNT; row++) {
            for (int column = 0; column < Constants.MAP_COLUMN_COUNT; column++) {
                Location eventLocation = new Location();
                eventLocation.setColumn(column);
                eventLocation.setRow(row);
                eventLocation.setVisited(false);

                mapLocations[row][column] = eventLocation;
            }
        }

        // save (set) 2-d array of locations in the map
        map.setLocations(mapLocations);

        // create the list of scene items
        SceneItem[] sceneList = MapControl.createSceneList(BestTwoYears.getCurrentGame().getPeople());

        // assign the scene items to the locations in the map
        MapControl.assginScenesToLocation(map, sceneList);
    }

    public static SceneItem[] getSortedSceneItems() {
        
        // get the scene list
        SceneItem[] sceneItems = GameControl.game.getScenes();
        
        // sort the list of scenes
        SceneList.sortScene(sceneItems);
        
        return sceneItems;
    }

    public static SceneItem[] createSceneList(Person[] individual) {

        // Create a list of Events
        SceneItem[] scenes = new SceneItem[Constants.NUMBER_OF_SCENES];

        // 1st col
        SceneItem mtcBegin = new SceneItem();
        mtcBegin.setDescription("A. [0] Entering MTC!");
        mtcBegin.setNoOfPeople(1);
        Person[] sceneTeacher = new Person[1];  // 0. Teacher
        sceneTeacher[0] = individual[Constants.MTCTEACHER];
        mtcBegin.setScenePeople(sceneTeacher);
        scenes[Constants.MTCBEGIN] = mtcBegin;

        SceneItem apTraining = new SceneItem();
        apTraining.setDescription("B. [1] In the Field, Tranined by AP");
        apTraining.setNoOfPeople(1);
        Person[] sceneAP = new Person[1];  // 1. AP
        sceneAP[0] = individual[Constants.AP];
        apTraining.setScenePeople(sceneAP);
        scenes[Constants.AP_TRAINING] = apTraining;

        SceneItem samSTContacting = new SceneItem();
        samSTContacting.setDescription("C. [2] Street Contact: SAM");
        samSTContacting.setNoOfPeople(1);
        Person[] sceneSam = new Person[1]; //2. Sam
        sceneSam[0] = individual[Constants.SAM];
        samSTContacting.setScenePeople(sceneSam);
        scenes[Constants.SAM_STCONTACTING] = samSTContacting;

        SceneItem jacobTracting = new SceneItem();
        jacobTracting.setDescription("D. [3] Tracting: Jacob");
        jacobTracting.setNoOfPeople(1);
        Person[] sceneJacob = new Person[1];  // 3. Jacob
        sceneJacob[0] = individual[Constants.JACOB];
        jacobTracting.setScenePeople(sceneJacob);
        scenes[Constants.JACOB_TRACTING] = jacobTracting;

        SceneItem pday1 = new SceneItem();
        pday1.setDescription("E. [4] 1st P-Day"); // 4. P-day1
        pday1.setNoOfPeople(0);
        scenes[Constants.PDAY1] = pday1;

        // 2nd col
        SceneItem mlMeal = new SceneItem();
        mlMeal.setDescription("F. [5] Member Meal: Mission Leader");
        mlMeal.setNoOfPeople(1);
        Person[] sceneMLMeal = new Person[1];  // 5. Mission Leader
        sceneMLMeal[0] = individual[Constants.MISSIONLEADER];
        mlMeal.setScenePeople(sceneMLMeal);
        scenes[Constants.ML_MEAL] = mlMeal;

        SceneItem malboronMobsAttack = new SceneItem();
        malboronMobsAttack.setDescription("G. [6] Mob Attack: Malboron");
        malboronMobsAttack.setNoOfPeople(1);
        Person[] scenemalboronMobsAttack = new Person[1];
        scenemalboronMobsAttack[0] = individual[Constants.MALBORON];
        malboronMobsAttack.setScenePeople(scenemalboronMobsAttack);
        scenes[Constants.MALBORON_MOBSATTACK] = malboronMobsAttack;

        SceneItem samTeaching = new SceneItem();
        samTeaching.setDescription("H. [7] Teaching: Sam with Bro.Smith");
        samTeaching.setNoOfPeople(2);
        Person[] sceneSamTeaching = new Person[2]; // 7. Sam & Brothe Smith
        sceneSamTeaching[0] = individual[Constants.SAM];//Sam
        sceneSamTeaching[1] = individual[Constants.SMITH];//B.Smith
        samTeaching.setScenePeople(sceneSamTeaching);
        scenes[Constants.SAM_TEACHING] = samTeaching;

        SceneItem aleTeaching = new SceneItem();
        aleTeaching.setDescription("I. [8] Teaching: Alejandra");
        aleTeaching.setNoOfPeople(1);
        Person[] sceneAleTeaching = new Person[1]; // 8. Ale
        sceneAleTeaching[0] = individual[Constants.ALEJANDRA];
        aleTeaching.setScenePeople(sceneAleTeaching);
        scenes[Constants.ALE_TEACHING] = aleTeaching;

        SceneItem serice1 = new SceneItem();
        serice1.setDescription("J. [9] 1st Service");
        serice1.setNoOfPeople(0); // 9. Service (No one)
        scenes[Constants.SERVICE1] = serice1;

        // 3rd col
        SceneItem minSTContacting = new SceneItem();
        minSTContacting.setDescription("K. [10] Street Contact: Min");
        minSTContacting.setNoOfPeople(1); // 10. Min
        Person[] sceneMinSTContacting = new Person[1];
        sceneMinSTContacting[0] = individual[Constants.MIN];
        minSTContacting.setScenePeople(sceneMinSTContacting);
        scenes[Constants.MIN_STCONTACTING] = minSTContacting;

        // Any investigator that reaches the highest points will be baptized. 
        // Need to be edited 
        SceneItem baptism1 = new SceneItem();
        baptism1.setDescription("L. [11] 1st Baptism");
        baptism1.setNoOfPeople(1); // could be multiple?
        Person[] sceneBaptism1 = new Person[1]; // 11. Baptism1
        sceneBaptism1[0] = individual[Constants.MIN]; // who else? Just say Min
        baptism1.setScenePeople(sceneBaptism1);
        scenes[Constants.BAPTISM1] = baptism1;

        SceneItem callingZL = new SceneItem();
        callingZL.setDescription("M. [12] Zone Leader Calling");
        callingZL.setNoOfPeople(1); // 12. ZL calling
        Person[] sceneCallingZL = new Person[1];
        sceneCallingZL[0] = individual[Constants.MISSIONPRESIDENT];
        callingZL.setScenePeople(sceneCallingZL);
        scenes[Constants.ZL_CALLING] = callingZL;

        SceneItem bishopMeal = new SceneItem();
        bishopMeal.setDescription("N. [13] Member Meal: Bishop");
        bishopMeal.setNoOfPeople(1); // 13. Bishop Meal
        Person[] sceneBishopMeal = new Person[1];
        sceneBishopMeal[0] = individual[Constants.BISHOP];
        bishopMeal.setScenePeople(sceneBishopMeal);
        scenes[Constants.BISHOP_MEAL] = bishopMeal;

        SceneItem pday2 = new SceneItem();
        pday2.setDescription("O. [14] 2nd P-Day"); // 14. P-day2
        pday2.setNoOfPeople(0);
        scenes[Constants.PDAY2] = pday2;

        // 4th col
        SceneItem transfer = new SceneItem();
        transfer.setDescription("P. [15] Transffered by Mission President");
        transfer.setNoOfPeople(1);  // 15. Transfer: Just Print out Message
        Person[] sceneTransfer = new Person[1];
        sceneTransfer[0] = individual[Constants.MISSIONPRESIDENT];
        transfer.setScenePeople(sceneTransfer);
        scenes[Constants.TRANSFER] = transfer;

        SceneItem koronaMobsAttack = new SceneItem();
        koronaMobsAttack.setDescription("Q. [16] Mob Attack: Korona");
        koronaMobsAttack.setNoOfPeople(1); // 16. Korona Mobs Attack
        Person[] sceneKoronaMobsAttack = new Person[1];
        sceneKoronaMobsAttack[0] = individual[Constants.KORONA];
        koronaMobsAttack.setScenePeople(sceneKoronaMobsAttack);
        scenes[Constants.KORONA_MOBSATTACK] = koronaMobsAttack;

        SceneItem proselytingJacksons = new SceneItem();
        proselytingJacksons.setDescription("R. [17] Proselyting: The Jackson's");
        proselytingJacksons.setNoOfPeople(2); // 17 Proselyting: Jackson
        Person[] sceneProselytingJacksons = new Person[2];
        sceneProselytingJacksons[0] = individual[Constants.MRJACKSON];
        sceneProselytingJacksons[1] = individual[Constants.MRSJACKSON];
        proselytingJacksons.setScenePeople(sceneProselytingJacksons);
        scenes[Constants.JACKSONS_PROSELYTING] = proselytingJacksons;

        SceneItem teachingJacksons = new SceneItem();
        teachingJacksons.setDescription("S. [18] Teaching: The Jackson's");
        teachingJacksons.setNoOfPeople(2); // 18. Teacihng: Jackson
        Person[] sceneTeachingJacksons = new Person[2];
        sceneTeachingJacksons[0] = individual[Constants.MRJACKSON];
        sceneTeachingJacksons[1] = individual[Constants.MRSJACKSON];
        teachingJacksons.setScenePeople(sceneTeachingJacksons);
        scenes[Constants.JACKSONS_TEACHING] = teachingJacksons;

        SceneItem service2 = new SceneItem();
        service2.setDescription("T. [19] 2nd Service");
        service2.setNoOfPeople(0); // 19. Service2 (No one)
        scenes[Constants.SERVICE2] = service2;

        // 5th col
        SceneItem cocaMobsAttack = new SceneItem();
        cocaMobsAttack.setDescription("U. [20] Mob Attack: Coca-Colly");
        cocaMobsAttack.setNoOfPeople(1); // 20. Coca-Colly Attack
        Person[] sceneCocaMobsAttack = new Person[1];
        sceneCocaMobsAttack[0] = individual[Constants.COCACOLLY];
        cocaMobsAttack.setScenePeople(sceneCocaMobsAttack);
        scenes[Constants.COCA_MOBSATTACK] = cocaMobsAttack;

        SceneItem kazTeaching = new SceneItem();
        kazTeaching.setDescription("V. [21] Teaching: Kazyama");
        kazTeaching.setNoOfPeople(1); //21. Kaz
        Person[] sceneKazTeaching = new Person[1];
        sceneKazTeaching[0] = individual[Constants.KAZYAMA];
        kazTeaching.setScenePeople(sceneKazTeaching);
        scenes[Constants.KAZ_TEACHING] = kazTeaching;

        SceneItem katieSTContacting = new SceneItem();
        katieSTContacting.setDescription("W. [22] Street Contact: Katie");
        katieSTContacting.setNoOfPeople(1); //22. Katie
        Person[] sceneKatieSTContacting = new Person[1];
        sceneKatieSTContacting[0] = individual[Constants.KATIE];
        katieSTContacting.setScenePeople(sceneKatieSTContacting);
        scenes[Constants.KATIE_STCONTACTING] = katieSTContacting;

        // Any investigator that reaches the highest points will be baptized. 
        // Need to be edited 
        SceneItem baptism2 = new SceneItem();
        baptism2.setDescription("X. [23] 2nd Baptism"); // 23. Baptism 
        baptism2.setNoOfPeople(1); // could be multiple?
        Person[] sceneBaptism2 = new Person[1]; // 11. Baptism1
        sceneBaptism2[0] = individual[Constants.SAM]; // who else? just say SAM
        baptism2.setScenePeople(sceneBaptism2);
        scenes[Constants.BAPTISM2] = baptism2;

        SceneItem welcomeHome = new SceneItem();
        welcomeHome.setDescription("Y. [24] Welcome Home & Return to Honor!");
        welcomeHome.setNoOfPeople(0); // 24. The END
        scenes[Constants.WELCOMHOME] = welcomeHome;

        return scenes;
    }

    private static Location[][] assginScenesToLocation(Map map, SceneItem[] scenes) {
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

        return location;
    }
}
