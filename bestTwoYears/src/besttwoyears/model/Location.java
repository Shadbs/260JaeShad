/*
 * Location.java for createMap() in GameControl 
 * to assign Player & People in the Location. 
 */

package besttwoyears.model;

import java.io.Serializable;

/*
 * @author Jae Lee
 */
public class Location implements Serializable {
    int row;
    int column;
    Scene scene;
    Person[] people;

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

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
    
}
