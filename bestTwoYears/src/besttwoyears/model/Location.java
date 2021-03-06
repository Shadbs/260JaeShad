/*
 * Location.java for createMap() in GameControl 
 * to assign Player & Person in the Location. 
 */

package besttwoyears.model;

import java.io.Serializable;

/*
 * @author Jae Lee
 */
public class Location implements Serializable {
    int row;
    int column;
    SceneItem scene;
    Person[] people;
    boolean visited;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public SceneItem getScene() {
        return scene;
    }

    public void setScene(SceneItem scene) {
        this.scene = scene;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    
}
