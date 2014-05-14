/*
 * Cell Class
 */

package besttwoyears.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jae Lee
 */
public class Call implements Serializable{
    
    // class instance variable
    private String receiveCall;
    private String sendCall;

    public Call() {
    }

    
    public String getReceiveCall() {
        return receiveCall;
    }

    public void setReceiveCall(String receiveCall) {
        this.receiveCall = receiveCall;
    }

    public String getSendCall() {
        return sendCall;
    }

    public void setSendCall(String sendCall) {
        this.sendCall = sendCall;
    }

    @Override
    public String toString() {
        return "Call{" + "receiveCall=" + receiveCall + ", sendCall=" + sendCall + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.receiveCall);
        hash = 11 * hash + Objects.hashCode(this.sendCall);
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
        final Call other = (Call) obj;
        if (!Objects.equals(this.receiveCall, other.receiveCall)) {
            return false;
        }
        if (!Objects.equals(this.sendCall, other.sendCall)) {
            return false;
        }
        return true;
    }
    
}
