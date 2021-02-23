package com.Megan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public abstract class RedAstronaut extends Player implements Imposter{

    protected String skill;

    public RedAstronaut(String name, int suslevel, boolean frozen, String skill) {

        super(name, suslevel, frozen);
        this.skill = skill;

    }

    @Override
    public void emergencyMeeting() {
        Arrays.sort(players);
        if(this.frozen != true && players[players.length] != players[players.length-1] && players[players.length] != this){
            players[players.length].frozen = true;
        }else if (this.frozen = true){
            System.out.println("Frozen players cannot hold an emergency meeting.");
        }
        //check if game is over using the method provided in player.java
    }

    //@Override
    public void freeze(Player p){
        if ((p.frozen=true) || (this.frozen = true) || (p instanceof RedAstronaut)){

        } else if (this.suslevel<p.suslevel){
            p.frozen = true;
        } else if (this.suslevel>p.suslevel){
            p.suslevel = (int) Math.floor(2*this.suslevel);
        }
    }

    public void sabotage(Player p){
        if ((p.frozen==true) || (this.frozen == true) || (p instanceof RedAstronaut)){

        } else if(this.suslevel < 20){
            p.suslevel = (int)Math.floor(1.5*p.suslevel);
        } else {
            p.suslevel = (int)Math.floor(1.25*p.suslevel);
        }
    }

    public boolean equals(Object o){
        RedAstronaut p = (RedAstronaut)o;
        return (this instanceof RedAstronaut && (this.suslevel == p.suslevel) && (this.name == p.name) && (this.skill == p.skill));
    }

    @Override
    public String toString(){
        String frozenstring;
        if (frozen = true) {
            frozenstring = "frozen";
        }else{
            frozenstring = "not frozen";
        }

        String s = "\"My name is " + name + ", and I have a suslevel of " + suslevel + ". I am currently " + frozenstring +   ". I am a " + skill + " player!\"";

        if (this.suslevel> 15) return s.toUpperCase(Locale.ROOT);
        else return s;
    }

}