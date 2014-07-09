/*
 * Map.java for createMap() in GameControl to assign Player & People
 */

package besttwoyears.model;

import java.io.Serializable;

/**
 * @author Jae Lee
 */
public class Map implements Serializable{
    int NumOfRows, NumOfCols;
    Location[][] locations;

    public int getNumOfRows() {
        return NumOfRows;
    }

    public int getNumOfCols() {
        return NumOfCols;
    }


    public Map() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] locations) {
        this.locations = locations;
    }
    
    public Map(int rowNum, int colNum) {
        this.locations = new Location[rowNum][colNum];
        for (int i = 0; i < locations.length; i++) {
            Location[] column = locations[i];
            for (int j = 0; j < column.length; j++) {
                Location location = new Location();
                locations[i][j] = location;
  
            }
            
        }
    }
    
//    public Point getLocation() throws ViewException () {
//        
//        System.out.println("\n Enter Row and Column number");
//        String value = this.getInput();
//        value = value.trim().toUpperCase();
////        
////        if (value.equals("Q"))
////            return null;
////        
//        String[] values = value.split(" ");
        
        
    
    }
    
