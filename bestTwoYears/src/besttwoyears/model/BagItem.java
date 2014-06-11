/* Somewhat related with Bagtest.java / Bag.java
 * editted: BagItems for Array, Week 7
 * BagIetms Class
 */

package besttwoyears.model;

import java.io.Serializable; //.*
import java.util.Objects;

/**
 * @author Jae Lee
 */
public class BagItem implements Serializable{
    
    // class instance variable
    private String description;
    private String name;
    private int quantityInStock;
    private int RequiredAmount;

    public BagItem() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
    
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "BagItem{" + "description=" + description + ", name=" + name + ", quantityInStock=" + quantityInStock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + this.quantityInStock;
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
        final BagItem other = (BagItem) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        return true;
    }

    public void setRequiredAmount(int RequiredAmount) {
        this.RequiredAmount = RequiredAmount;
    }
    

    
  
    
    
    
}
