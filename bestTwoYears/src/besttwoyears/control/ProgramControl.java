/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besttwoyears.control;

import besttwoyears.model.Player;

/**
 *
 * @author Shad
 */
public class ProgramControl {

    public static Player createPlayer(String playerName) {
        System.out.println("Create player called");
        Player player = new Player();
        player.setLastName(playerName);
        
        return player;
    }
}
