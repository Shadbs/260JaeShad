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
public class Mission implements Serializable {
    private String missionName;

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Mission() {
    }

    @Override
    public String toString() {
        return "mission{" + "missionName=" + missionName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.missionName);
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
        final Mission other = (Mission) obj;
        if (!Objects.equals(this.missionName, other.missionName)) {
            return false;
        }
        return true;
    }
    
    
}
