/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.model;

import besttwoyears.BestTwoYears;
import besttwoyears.control.Constants;
import java.io.Serializable;

/**
 *
 * @author Jae Lee
 */
public class SceneList implements Serializable {

    SceneItem[] scene = new SceneItem[25];

    public SceneList() {
        SceneItem[] sceneItems = BestTwoYears.getCurrentGame().getScenes();
        scene = sceneItems;
    }

    public static void sortScene(SceneItem[] sceneItemList) {

        // Get Item list from current game
        SceneItem[] sceneItems = BestTwoYears.getCurrentGame().getScenes();

        // Using Exchange Sort for SceneItems List by Alphabetic list
        SceneItem tempScene;
        for (int i = 0; i < sceneItemList.length - 1; i++) {
            for (int j = i + 1; j < sceneItemList.length; j++) {
                if (sceneItemList[i].getDescription().compareToIgnoreCase(sceneItemList[j].getDescription()) > 0) {
                    tempScene = sceneItemList[i];   //swap
                    sceneItemList[i] = sceneItemList[j];
                    sceneItemList[j] = tempScene;
                }
            }
        }
    }

    public SceneItem[] getScene() {
        return scene;
    }

    public void setScene(SceneItem[] scene) {
        this.scene = scene;
    }

}
