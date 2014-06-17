/*
 * GameMenuView
 */
package besttwoyears.view;

import besttwoyears.control.GameControl;
import besttwoyears.BestTwoYears;
import besttwoyears.control.ProgramControl;
import besttwoyears.model.*;
import java.util.Scanner;
import besttwoyears.model.Bag;

/**
 * @author Jae
 */
public class GameMenuView {
//    public void displayMenu() {
//        
//        // Create a New game
//        GameControl.createNewGame(BestTwoYears.getPlayer());
//        
//        // Display the game menu
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.displayMenu();
//    }
//    

    private static final String MENU = "\n"
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
            + "\n ******************************************";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);       // Display MainMenu

            String input = this.getInput(); // get user's selection
            selection = input.charAt(0);    // get first character of string

            this.doAction(selection);       // Do action based on selection
        } while (selection != 'E');         // an selection isn't "Exit"
    }

    public String getInput() {
        boolean valid = false;
        String playerChoice = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter Choice");

            playerChoice = keyboard.nextLine();
            playerChoice = playerChoice.trim();

            if (playerChoice.toUpperCase().equals("Q")) {
                return null;
            }

            if (playerChoice.length() > 1) {
                System.out.println("Invalid Choice, Choose again");
            } else {
                valid = true;
            }

        }
        return playerChoice;
    }

    public void doAction(char playerChoice) {

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
                helpMenu.displayMenu();
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
            Bag.sortBag(bagitems);
            System.out.println(bag.getDescription() + "\t    "
                    + bag.getRequiredAmount() + "\t      "
                    + bag.getQuantityInStock());
        }
    }

    private void viewPersonList() {
        Person[] individual = GameControl.createPeopleList();
        
        for (Person people : individual ){
        
            Persons.sortPeople(individual);
            System.out.println(people.getTitle() + " " + people.getName());
        }
        
   
    }
}
