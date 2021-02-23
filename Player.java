package com.Megan;

import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public abstract class Player implements Comparable {

    protected String name;
    protected int suslevel;
    protected boolean frozen;
    public static Player[] players = new Player[100];
    static int count = 0;

    public Player(String name, int suslevel, boolean frozen) {

        this.name = name;
        this.suslevel = suslevel;
        this.frozen = frozen;

        players[count] = this;
        count++;

    }

    public void emergencyMeeting() {

    }

    @Override
    public int compareTo(Object o) {
        Player p = (Player) o;
        return suslevel - p.suslevel;
    }

}