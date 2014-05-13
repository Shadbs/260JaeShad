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
public class Leader implements Serializable {
    
    private double disappointmentGage;

    public Leader() {
    }

    public double getDisappointmentGage() {
        return disappointmentGage;
    }

    public void setDisappointmentGage(double disappointmentGage) {
        this.disappointmentGage = disappointmentGage;
    }

    @Override
    public String toString() {
        return "Leader{" + "disappointmentGage=" + disappointmentGage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.disappointmentGage) ^ (Double.doubleToLongBits(this.disappointmentGage) >>> 32));
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
        final Leader other = (Leader) obj;
        if (Double.doubleToLongBits(this.disappointmentGage) != Double.doubleToLongBits(other.disappointmentGage)) {
            return false;
        }
        return true;
    }


    
}
