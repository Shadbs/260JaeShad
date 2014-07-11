/*
 * Custom Exception Class
 */
package besttwoyears.exeption;

/*
 * @author Jae Lee
 */
public class BestTwoYearsException extends Exception {

    public BestTwoYearsException() {
    }

    public BestTwoYearsException(String errorMessage) {
        super(errorMessage);
    }

    public BestTwoYearsException(Throwable errorCause) {
        super(errorCause);
    }

    public BestTwoYearsException(String errorMessage, Throwable errorCause) {
        super(errorMessage, errorCause);
    }

}