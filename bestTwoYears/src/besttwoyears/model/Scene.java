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
    
        
    
}
