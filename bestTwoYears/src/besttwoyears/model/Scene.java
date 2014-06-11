/*
 * Scene.model for createMap() in GameControl to assign Player & People
 */

package besttwoyears.model;

import java.io.Serializable;

/**
 * @author Jae Lee
 */
public class Scene implements Serializable{
    String description;
    String sceneType;
    Person[] scenePeople;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public void setNoOfPeople(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person[] getScenePeople() {
        return scenePeople;
    }

    public void setScenePeople(Person[] scenePeople) {
        this.scenePeople = scenePeople;
    }
    
        
    
}
