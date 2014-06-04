/*
 * To change this license header, choose License Headers in Project Properties.
 */
package besttwoyears.control;

import besttwoyears.BestTwoYears;
import besttwoyears.model.Game;

/**
 * @author Shad
 */
class GameControl {

    private static Game game;
    public static void startNewGame() {

        GameControl.game = new Game();

        BestTwoYears.setCurrentGame(game);

        GameControl.createBagItemsList();
        GameControl.createPeopleList();
        GameControl.createCellPhone();
        GameControl.createPlanner();
        GameControl.createMap();

        MapControl.locatePeople();
    }

    public static void createBagItemsList() {
        System.out.println("Calls the BagItemsList");
    }

    public static void createPeopleList() {
        System.out.println("calls the createPeopleList");
    }
    public static void createCellPhone(){
        System.out.println("calls the createCellPhone");
    }
    public static void createPlanner(){
        System.out.println("calls the createPlanner");
    }
    public static void createMap(){
        System.out.println("calls the createMap");
    }
    
}
