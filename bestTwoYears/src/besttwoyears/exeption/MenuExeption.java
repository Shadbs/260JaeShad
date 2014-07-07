/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.exeption;

/**
 *
 * @author Jae Lee
 */
public class MenuExeption extends Exception {

    public MenuExeption() {
    }

    public MenuExeption(String errorMessage) {
        super(errorMessage);
    }

    public MenuExeption(Throwable errorCause) {
        super(errorCause);
    }

    public MenuExeption(String errorMessage, Throwable errorCause) {
        super(errorMessage, errorCause);
    }

}