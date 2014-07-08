/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.view;

import besttwoyears.model.Player;
import java.util.Scanner;
import besttwoyears.control.ProgramControl;

/*
 * @author Jae Lee
 */
public class MoveLocationMenu extends View {
    

    public MoveLocationMenu() {
        super("\n"
                + "\n--------------------------------------"
                + "\n|           Transfer Menu            |"
                + "\n--------------------------------------"
                + "\n  P - View Transfer Scene List        "
                + "\n  R - Return to Game                  "
                + "\n  E - Exit to Main Menu               "
                + "\n--------------------------------------"
                + "\n  Please Enter Transfer Place Number  "
                + "\n    [Between Number 2 - 14]           "
                + "\n--------------------------------------");
    }

    @Override
    public void doAction(String value) {
        char playerChoice = value.toUpperCase().charAt(0);

        switch (playerChoice) {
            case 'P': // View SceneList[]
                GameMenuView.viewSceneItems();
                break;

            case 'E': // Back to the MainMenuView.java
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                break;

            case 'R': // Back to the MainMenuView.java
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;

            default:
                System.out.println("-----Please Choose Option Again-----");
                break;
        }
    }
    
    // Get Desired Transfer Scene from User
    public int getSceneNumber() {
        boolean valid = false;       
        Scanner keyboard = new Scanner(System.in);
        int sceneNumber = keyboard.nextInt();
        
        // get the player, game or Constant
        
        // game object
        System.out.println("\n"
//                + .missionTitle + " " + Player.lastName
                + " will be transffered to " + "Scene " + sceneNumber);

        return sceneNumber;
    }

}
