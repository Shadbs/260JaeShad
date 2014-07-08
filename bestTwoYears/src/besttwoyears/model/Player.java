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
public class Player implements Serializable{ 
        public String lastName;
        public String missionTitle;

    public Player() {
    }
 
        
    // Getter lastname
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMissionTitle() {
        return missionTitle;
    }

    public void setMissionTitle(String missionTitle) {
        this.missionTitle = missionTitle;
    }

    @Override
    public String toString() {
        return "Player{" + "lastName=" + lastName + ", missionTitle=" + missionTitle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.lastName);
        hash = 41 * hash + Objects.hashCode(this.missionTitle);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.missionTitle, other.missionTitle)) {
            return false;
        }
        return true;
    }



    
}
