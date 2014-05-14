/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package besttwoyears.model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Shad
 */
public class Investigator {
    
    private double understandingGage;

    public Investigator() {
    }

    public double getUnderstandingGage() {
        return understandingGage;
    }

    public void setUnderstandingGage(double understandingGage) {
        this.understandingGage = understandingGage;
    }

    @Override
    public String toString() {
        return "Investigator{" + "understandingGage=" + understandingGage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.understandingGage) ^ (Double.doubleToLongBits(this.understandingGage) >>> 32));
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
        final Investigator other = (Investigator) obj;
        if (Double.doubleToLongBits(this.understandingGage) != Double.doubleToLongBits(other.understandingGage)) {
            return false;
        }
        return true;
    }
    
    
    
}
