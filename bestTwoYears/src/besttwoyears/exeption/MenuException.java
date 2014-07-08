/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.exeption;

/*
 * @author Jae Lee
 */
public class MenuException extends Exception {

    public MenuException() {
    }

    public MenuException(String errorMessage) {
        super(errorMessage);
    }

    public MenuException(Throwable errorCause) {
        super(errorCause);
    }

    public MenuException(String errorMessage, Throwable errorCause) {
        super(errorMessage, errorCause);
    }

}