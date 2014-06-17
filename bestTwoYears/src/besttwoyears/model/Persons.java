/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package besttwoyears.model;

import besttwoyears.BestTwoYears;
import java.io.Serializable;

/**
 *
 * @author Shad
 */
public class Persons implements Serializable{
     Person[] people = new Person[18];

    public Persons() {
        Person[] individual = BestTwoYears.getCurrentGame().getPeople();
        people = individual;

    }

    public static void sortPeople(Person[] peopleList) {

        // Get Inventory List for the current Game
        Person[] individual = BestTwoYears.getCurrentGame().getPeople();

        // Using Exchange Sort for BagItems List by Alphabetic list
        Person tempList;
        for (int i = 0; i < peopleList.length - 1; i++) {
            for (int j = i + 1; j < peopleList.length; j++) {
                if (peopleList[i].getTitle().compareToIgnoreCase(peopleList[j].getTitle()) > 0) {
                    tempList = peopleList[i];   //swap
                    peopleList[i] = peopleList[j];
                    peopleList[j] = tempList;
                }
            }
        }
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }


    
}
