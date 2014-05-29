/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.view;

/**
 *
 * @author Shad
 */
public class programStart {

    public void banner() {
        //this is displays when run
        System.out.println("Hello future missionary welcome to the Best Two years, here you will have the experience of a lifetime! \n you have been chosen to represent our Lord Jesus Christ and preach His gospel for 2 years of your life");

         
    }

    public programStart() {
        this.banner();
        
        String playerName = this.getPlayerName();
        if (playerName == null)
            return;
        
        
    }
}
