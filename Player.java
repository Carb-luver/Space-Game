package com.Megan;

import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public abstract class Player implements Comparable {

    protected String name;
    protected int suslevel;
    protected boolean frozen;
    public static ArrayList<Player> playerslist = new ArrayList<Player>();
    public static Player[] players;

    public Player(String name, int suslevel, boolean frozen) {

        this.name = name;
        this.suslevel = suslevel;
        this.frozen = frozen;

        playerslist.add(this);

        players = (Player[]) playerslist.toArray(new Player[0]);

        Arrays.sort(players);

    }

    public void emergencyMeeting() {

    }

    @Override
    public int compareTo(Object o) {
        Player p = (Player) o;
        return this.suslevel - p.suslevel;
    }

}