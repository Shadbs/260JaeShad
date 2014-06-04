/*
 * prepDayControl class
 */
package besttwoyears.control;

/**
 * @author Shad Stanger
 */
public class prepDay {

    public double[] prepDay(char choice, double cFund, double HP) {

        double newFund = 0;
        double newHP = 0;
        double price = 5;
        double taxRate = .06;
        double fastFood = 7;

        switch (choice) {
            case 'G': // buy grocries
                newFund = cFund - ((price * taxRate) + price);
                newHP = HP + 20;

                System.out.println("Money: $" + newFund);
                System.out.println("New HP:" + newHP + "%");
                break;

            case 'L': // do laundry
                newFund = cFund - 3;
                newHP = HP + 10;

                System.out.println("Money: $" + newFund);
                System.out.println("New HP:" + newHP + "%");
                break;

            case 'F': // buying fast food
                newFund = cFund - ((fastFood * taxRate) + fastFood);
                newHP = HP + 30;

                System.out.println("Money: $" + newFund);
                System.out.println("New HP:" + newHP + "%");
                break;

        }
        double[] results = new double[2];
        results[0] = newFund;
        results[1] = newHP;

        return results;
    }
}
