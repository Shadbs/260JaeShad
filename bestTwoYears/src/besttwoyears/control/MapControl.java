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

    public static void movePlayerToLocation(int num)
            throws MenuException {

        Map map = besttwoyears.BestTwoYears.getCurrentGame().getMap();

        if (num < 0 || 25 < num) {
            throw new MenuException("Invalid Scene Number");
        }
    }
}
