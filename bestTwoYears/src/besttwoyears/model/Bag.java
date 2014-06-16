/*
 * BagItems for Array, Week 7
 * Using Exchanging Array: http://mathbits.com/MathBits/Java/arrays/Exchange.htm
 */
package besttwoyears.model;

import besttwoyears.BestTwoYears;
import besttwoyears.control.Constants;
import java.io.Serializable;

/**
 * @author Jae Lee
 */
public class Bag implements Serializable {

    BagItem[] bag = new BagItem[4];

    public Bag() {
        BagItem[] bagItems = BestTwoYears.getCurrentGame().getBagItems();
        bag = bagItems;

    }

    public static void sortBag(BagItem[] bagItemList) {

        // Get Inventory List for the current Game
        BagItem[] bagItems = BestTwoYears.getCurrentGame().getBagItems();

        // Using Exchange Sort for BagItems List by Alphabetic list
        BagItem tempBag;
        for (int i = 0; i < bagItemList.length - 1; i++) {
            for (int j = i + 1; j < bagItemList.length; j++) {
                if (bagItemList[i].getDescription().compareToIgnoreCase(bagItemList[j].getDescription()) > 0) {
                    tempBag = bagItemList[i];   //swap
                    bagItemList[i] = bagItemList[j];
                    bagItemList[j] = tempBag;
                }
            }
        }
    }

    public BagItem[] getBag() {
        return bag;
    }

    public void setBag(BagItem[] bag) {
        this.bag = bag;
    }

}
