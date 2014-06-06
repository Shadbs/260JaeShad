/*
 * Map.java for createMap() in GameControl to assign Player & People
 */

package besttwoyears.model;

import java.io.Serializable;

/**
 * @author Jae Lee
 */
public class Map implements Serializable{
    Location[][] locations;

    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] locations) {
        this.locations = locations;
    }
    
    public Map() {
        this.locations = new Location[5][5];
        for (int i = 0; i < locations.length; i++) {
            Location[] column = locations[i];
            for (int j = 0; j < column.length; j++) {
                Location location = new Location();
                locations[i][j] = location;
  
            }
            
        }
    }
    
}
