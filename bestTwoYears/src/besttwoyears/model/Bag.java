/*
 * BagItems for Array, Week 7
 * Using Exchanging Array: http://mathbits.com/MathBits/Java/arrays/Exchange.htm
 */

package besttwoyears.model;

import besttwoyears.control.Constants;
import java.io.Serializable;

/**
 * @author Jae Lee
 */
public class Bag implements Serializable{
    BagItem[] bag = new BagItem[4];
    
    public Bag() {
            BagItem bookOfMormon = new BagItem();
            bookOfMormon.setDescription("Book Of Mormon");
            bookOfMormon.setQuantityInStock(1);
            bag[Constants.BOOKOFMORMON] = bookOfMormon;
            
            BagItem scripture = new BagItem();
            scripture.setDescription("scripture");
            scripture.setQuantityInStock(1);
            bag[Constants.SCRIPTURE] = scripture;
            
            BagItem passAlongCard = new BagItem();
            passAlongCard.setDescription("Pass Along Card");
            passAlongCard.setQuantityInStock(1);
            bag[Constants.PASSALONGCARD] = passAlongCard;
            
            BagItem familyPics = new BagItem();
            familyPics.setDescription("Family Picture");
            familyPics.setQuantityInStock(1);
            bag[Constants.FAMILYPICS] = familyPics;
        }
    
    public static void SortBag (BagItem[] bagItemList) {
        BagItem tempBag;
        for (int i = 0; i < bagItemList.length-1; i++) {
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
