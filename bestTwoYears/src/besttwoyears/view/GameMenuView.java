/*
 * GameMenuView - subclass under View
 */
package besttwoyears.view;

import besttwoyears.control.GameControl;
import besttwoyears.BestTwoYears;
import besttwoyears.control.ProgramControl;
import besttwoyears.model.*;
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
                + "\n  P - View Contact Scene List              "
                + "\n  N - View Contact Number List             " // add this to other functions planner and phone
                + "\n  T - Transfer Missionary to New Location  "
                + "\n  L - Look at the planner                  "
                + "\n  C - Call Menu                            "
                + "\n  H - Help Menu                            "
                + "\n  M - Main Game                            "
                + "\n  S - Save Game                            "
                + "\n  Q - Previous Menu                        "
                + "\n ******************************************");
    }

    @Override
    public void doAction(String value) {
        char playerChoice = value.toUpperCase().charAt(0);

        switch (playerChoice) {

            case 'B': // View bag Items[]
                this.viewBagItems();
                break;

            case 'P': // View SceneList[]
                this.viewSceneItems();
                break;

            case 'N': // View Contact Number List
                this.viewPersonList();
                break;

            case 'C': // GameCallView
                GameCallView callMenu = new GameCallView();
                callMenu.display();
                break;

            case 'L': //plannerView
                GamePlannerView plannerMenu = new GamePlannerView();
                plannerMenu.display();

            case 'H': // HelpMenuView
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;

            case 'M': // MainMenuView
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
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

    public void viewPersonList() {
        Person[] individual = GameControl.createPeopleList();
        Persons.sortPeople(individual);
        for (Person people : individual) {

            System.out.println(people.getTitle() + " " + people.getName());
        }

    }

    private void viewSceneItems() {
        SceneItem[] sList = GameControl.createSceneList(BestTwoYears.getCurrentGame().getPeople());
        SceneList.sortScene(sList);
        for (SceneItem scene : sList) {
            System.out.println(scene.getDescription());
        }
    }
}
