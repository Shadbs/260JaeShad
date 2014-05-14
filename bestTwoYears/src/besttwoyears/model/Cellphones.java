/*
 * Cellphones Class
 *
 */

package besttwoyears.model;

import java.io.Serializable;
import java.util.Objects;

/*
 * @author Jae Lee
 */
public class Cellphones implements Serializable{
    
    // class instance variable
    private String call;
    private String text;
    private String contacts;

    public Cellphones() {
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Cellphones{" + "call=" + call + ", text=" + text + ", contacts=" + contacts + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.call);
        hash = 71 * hash + Objects.hashCode(this.text);
        hash = 71 * hash + Objects.hashCode(this.contacts);
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
        final Cellphones other = (Cellphones) obj;
        if (!Objects.equals(this.call, other.call)) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        if (!Objects.equals(this.contacts, other.contacts)) {
            return false;
        }
        return true;
    }
    
    
    
}
