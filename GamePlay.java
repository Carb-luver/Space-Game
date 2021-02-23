package com.Megan;

import java.awt.*;

public class GamePlay {

    public static void main(String[] args) {

    BlueAstronaut bob = new BlueAstronaut("Bob",20, false,6,30){
        @Override
        public int compareTo(Object o) {
            Player p = (Player) o;
            return suslevel - p.suslevel;
        }
    };
    BlueAstronaut heath = new BlueAstronaut("Heath",30,false,3,21){
        @Override
        public int compareTo(Object o) {
            Player p = (Player) o;
            return suslevel - p.suslevel;
        }
    };
    BlueAstronaut albert = new BlueAstronaut("Albert",44,false,2,0){
        @Override
        public int compareTo(Object o) {
            Player p = (Player) o;
            return suslevel - p.suslevel;
        }
    };
    BlueAstronaut angel = new BlueAstronaut("Angel",0,false,1,0){
        @Override
        public int compareTo(Object o) {
            Player p = (Player) o;
            return suslevel - p.suslevel;
        }
    };

    RedAstronaut liam = new RedAstronaut("Liam",19,false,"experienced") {
        @Override
        public int compareTo(Object o) {
            Player p = (Player) o;
            return suslevel - p.suslevel;
        }
    };
    RedAstronaut suspiciousPerson = new RedAstronaut("Suspicious Person",100,false,"expert"){
        @Override
        public int compareTo(Object o) {
            Player p = (Player) o;
            return suslevel - p.suslevel;
        }
    };


    liam.sabotage(bob);
    System.out.println(bob.toString());

    liam.freeze(suspiciousPerson);
    System.out.println(liam.toString());
    System.out.println(suspiciousPerson.toString());

    liam.freeze(albert);
    System.out.println(albert.toString());
    System.out.println(liam.toString());



    albert.emergencyMeeting();
    suspiciousPerson.emergencyMeeting();
        System.out.println(heath.toString());
        System.out.println(bob.toString());
    bob.emergencyMeeting();
        System.out.println(suspiciousPerson.toString());

    }
}