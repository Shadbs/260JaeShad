/*
 * SceneItem.model for createMap() in GameControl to assign Player & People
 */

package besttwoyears.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author Jae Lee
 */
public class SceneItem implements Serializable{
    private String description;
    private String sceneType;
    private int noPeople;
    private Person[] scenePeople;

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
        this.noPeople = i;
    }

    public Person[] getScenePeople() {
        return scenePeople;
    }

    public void setScenePeople(Person[] scenePeople) {
        this.scenePeople = scenePeople;
    }

    @Override
    public String toString() {
        return "SceneItem{" + "description=" + description + ", sceneType=" + sceneType + ", scenePeople=" + scenePeople + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.sceneType);
        hash = 37 * hash + Arrays.deepHashCode(this.scenePeople);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SceneItem other = (SceneItem) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        if (!Arrays.deepEquals(this.scenePeople, other.scenePeople)) {
            return false;
        }
        return true;
    }
    
        
    
}
