/*
 * People Class
 *
 */

package besttwoyears.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{
     
    private String name;
    private String title;

    public Person(String title, String name) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", title=" + title + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.title);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }
    
 }