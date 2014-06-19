/*
 * GameMenuView - subclass under View
 */
package besttwoyears.view;

import besttwoyears.control.GameControl;
import besttwoyears.BestTwoYears;
import besttwoyears.control.ProgramControl;
import besttwoyears.model.*;
import java.util.Scanner;
import besttwoyears.model.BagItem;

/**
 * @author Jae
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n ******************************************"
                + "\n *             Game Menu                  *"
                + "\n ******************************************"
                + "\n  B - View Missionary Bag Items            "
                + "\n  P - View Contact People List             "
                + "\n  C - View Contact Number List             "
                + "\n  T - Transfer Missionary to New Location  "
                + "\n  H - Help Menu                            "
                + "\n  M - Main Game                            "
                + "\n  S - Save Game                            "
                + "\n  Q - Exit Game                            "
                + "\n ******************************************");
    }

    @Override
    public void doAction(String value) {
        char playerChoice = value.toUpperCase().charAt(0);        
        
        switch (playerChoice) {

            case 'B': // View bag Items[]
                this.viewBagItems();
                break;

            case 'P': // View Person[]
                System.out.println("View Person List is in Construction");
                break;

            case 'C':
                this.viewPersonList();
                break;

            case 'H': // HelpMenuView
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;

            case 'M': // MainMenuView
                ProgramControl.saveGame(BestTwoYears.getCurrentGame());
                break;

            case 'S': // Saving Game
                ProgramControl.saveGame(BestTwoYears.getCurrentGame());
                break;

            default:
                System.out.println("***Choose again, invalid selection***");
                break;
        }
    }

    private void viewBagItems() {
        // get sorted list of bagitem

        BagItem[] bagitems = GameControl.getSortedBagItems();

        System.out.println("\n List of Bag Items");
        System.out.println("Description:" + "\t"
                + "Required:" + "  "
                + "In Stock");

        // for each bagitems
        for (BagItem bag : bagitems) {
            // Display the description, required amount
            BagList.sortBag(bagitems);
            System.out.println(bag.getDescription() + "\t    "
                    + bag.getRequiredAmount() + "\t      "
                    + bag.getQuantityInStock());
        }
    }

    private void viewPersonList() {
        Person[] individual = GameControl.createPeopleList();
        Persons.sortPeople(individual);
        for (Person people : individual) {

            System.out.println(people.getTitle() + " " + people.getName());
        }

    }
}
