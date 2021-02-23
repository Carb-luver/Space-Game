package com.Megan;

import java.util.Arrays;
import java.util.Locale;

public abstract class BlueAstronaut extends Player implements Crewmate{

    int numTasks;
    int taskSpeed;

    public BlueAstronaut(String name, int suslevel, boolean frozen, int numTasks, int taskSpeed) {
        super(name, suslevel, frozen);
        this.numTasks = numTasks;
        this.taskSpeed = taskSpeed;
    }

    @Override
    public void emergencyMeeting() {

        if((this.frozen != true) && (!players[players.length-1].equals(players[players.length-2])) && (players[players.length-1] != this)){
            players[players.length-1].frozen = true;
        } else if (this.frozen = true) {
            System.out.println("Frozen players cannot hold an emergency meeting.");
        }
        //check if game is over using the method provided in player.java
    }

    public void completeTask(){
        if (taskSpeed>20 && frozen!=true){
            numTasks = numTasks-2;
            if (numTasks <= 0){
                numTasks = 0;
                System.out.println("\"I have completed all my tasks\"");
                suslevel = (int)(Math.floor(suslevel/2));
            }
        }
    }

    public boolean equals(Object o){
        BlueAstronaut p = (BlueAstronaut)o;
        return (this instanceof BlueAstronaut && (this.suslevel == p.suslevel) && (this.name == p.name) && (this.taskSpeed == p.taskSpeed));
    }

    public String toString(){
        String frozenstring;
        if (frozen = true) {
            frozenstring = "frozen";
        }else{
            frozenstring = "not frozen";
        }

        String s = "\"My name is " + name + ", and I have a suslevel of " + suslevel + ". I am currently " + frozenstring +   ". I have " + numTasks + " tasks left over.\"";

        if (this.suslevel > 15) return s.toUpperCase(Locale.ROOT);
        else return s;
    }

}
