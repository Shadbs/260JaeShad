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
public class Companion implements Serializable {
    private double spiritGage;
    private double prideGage;

    public double getSpiritGage() {
        return spiritGage;
    }

    public void setSpiritGage(double spiritGage) {
        this.spiritGage = spiritGage;
    }

    public double getPrideGage() {
        return prideGage;
    }

    public void setPrideGage(double prideGage) {
        this.prideGage = prideGage;
    }

    public Companion() {
    }

    @Override
    public String toString() {
        return "Companion{" + "spiritGage=" + spiritGage + ", prideGage=" + prideGage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.spiritGage) ^ (Double.doubleToLongBits(this.spiritGage) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.prideGage) ^ (Double.doubleToLongBits(this.prideGage) >>> 32));
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
        final Companion other = (Companion) obj;
        if (Double.doubleToLongBits(this.spiritGage) != Double.doubleToLongBits(other.spiritGage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.prideGage) != Double.doubleToLongBits(other.prideGage)) {
            return false;
        }
        return true;
    }
    
    
    
}
