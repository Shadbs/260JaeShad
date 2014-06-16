/* BagItems for Array, Week 7
 * Bag Testing
 */

package besttwoyears.model;

import besttwoyears.control.Constants;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jae Lee
 */
public class BagTest {
    
    public BagTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of sortBag method, of class Bag.
     */
    @Test
    public void testSortBag() {
        System.out.println("SortBag");
        
        String[] expectedList = {"Book Of Mormon",
                                 "Family Picture",
                                 "Pass Along Card",
                                 "Scripture"};
                                
        BagItem[] bagItemList = new BagItem[4];
        
        BagItem bookOfMormon = new BagItem();
        bookOfMormon.setDescription("Book Of Mormon");
        bookOfMormon.setQuantityInStock(1);
        bagItemList[Constants.BOOKOFMORMON] = bookOfMormon;

        BagItem scripture = new BagItem();
        scripture.setDescription("Scripture");
        scripture.setQuantityInStock(1);
        bagItemList[Constants.SCRIPTURE] = scripture;

        BagItem passAlongCard = new BagItem();
        passAlongCard.setDescription("Pass Along Card");
        passAlongCard.setQuantityInStock(1);
        bagItemList[Constants.PASSALONGCARD] = passAlongCard;

        BagItem familyPics = new BagItem();
        familyPics.setDescription("Family Picture");
        familyPics.setQuantityInStock(1);
        bagItemList[Constants.FAMILYPICS] = familyPics;
        
        Bag.sortBag(bagItemList);
        
        for (int i = 0; i < bagItemList.length; i++) {
            BagItem bagItem = bagItemList[i];
            assertEquals(expectedList[i], bagItem.getDescription());     
        }
    }

 
}
