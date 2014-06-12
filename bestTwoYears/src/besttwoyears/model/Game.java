/*
 * 
 */

package besttwoyears.model;

/**
 * @author Jae Lee
 */
public class Game {
    double spritualPoint; 

    @Override
    public String toString() {
        return "Game{" + "spritualPoint=" + spritualPoint + '}';
    }

    public double getSpritualPoint() {
        return spritualPoint;
    }

    public void setSpritualPoint(double spritualPoint) {
        this.spritualPoint = spritualPoint;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.spritualPoint) ^ (Double.doubleToLongBits(this.spritualPoint) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.spritualPoint) != Double.doubleToLongBits(other.spritualPoint)) {
            return false;
        }
        return true;
    }

    public void setPeople(String[] people) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPeople(Person[] people) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
