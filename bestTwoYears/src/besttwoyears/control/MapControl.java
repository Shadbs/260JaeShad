/*
 * MapControl
 */
package besttwoyears.control;

import besttwoyears.exeption.MenuException;
import besttwoyears.model.Map;

/**
 *
 * @author Shad
 */

class MapControl {

    public static void locatePlayerToStartingPosition(int rowNum, int colNum) {
        System.out.println("Go to MTC!");
        // how to code to bring player back to starting position?
    }

    public static void movePlayerToLocation(int row, int col)
            throws MenuException {

        Map map = besttwoyears.BestTwoYears.getCurrentGame().getMap();

        if (row < 1 || col < 1 || row > map.getNumOfRows() || row > map.getNumOfCols()) {
            throw new MenuException("Invalid Scene Number, Please Type Again");
        }
    }
}
