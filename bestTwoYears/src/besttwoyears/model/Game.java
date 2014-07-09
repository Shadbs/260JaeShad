/*
 * 
 */

package besttwoyears.model;

import besttwoyears.view.*;
import java.io.Serializable;

/**
 * @author Jae Lee
 */
public class Game implements Serializable{
    private double spritualPoint; 
    private Person[] people;
    // Refer Team Assignment 6 PDF
    private Player player;
    private Map map;
    private BagItem[] bagItems;
    private GamePlanner gamePlanner;
    private Cellphones[] Cellphones;
    private Call call;
    private Companion companion;
    private Investigator investigator;
    private Leader leader;
    private Location location;
    private SceneItem[] scenes;
//    private Mission mission;
    
    @Override
    public String toString() {
        return "Game{" + "spritualPoint=" + spritualPoint + '}';
    }

    public double getSpritualPoint() {
        return spritualPoint;
    }

    public void setSpritualPoint(double spritualPoint) {
        this.spritualPoint = spritualPoint;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public BagItem[] getBagItems() {
        return bagItems;
    }

    public void setBagItems(BagItem[] bagItems) {
        this.bagItems = bagItems;
    }

    public GamePlanner getGamePlanner() {
        return gamePlanner;
    }

    public void setGamePlanner(GamePlanner gamePlanner) {
        this.gamePlanner = gamePlanner;
    }

    public Cellphones[] getCellphones() {
        return Cellphones;
    }

    public void setCellphones(Cellphones[] Cellphones) {
        this.Cellphones = Cellphones;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public Companion getCompanion() {
        return companion;
    }

    public void setCompanion(Companion companion) {
        this.companion = companion;
    }

    public Investigator getInvestigator() {
        return investigator;
    }

    public void setInvestigator(Investigator investigator) {
        this.investigator = investigator;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public SceneItem[] getScenes() {
        return scenes;
    }

    public void setScenes(SceneItem[] scenes) {
        this.scenes = scenes;
    }

//    public Mission getMission() {
//        return mission;
//    }
//
//    public void setMission(Mission mission) {
//        this.mission = mission;
//    }
//    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.spritualPoint) ^ (Double.doubleToLongBits(this.spritualPoint) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.spritualPoint) != Double.doubleToLongBits(other.spritualPoint)) {
            return false;
        }
        return true;
    }

    
}
