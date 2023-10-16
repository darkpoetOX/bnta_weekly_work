package models;

import interfaces.ICycle;

public class Cyclist implements ICycle {

    private String name;

    public Cyclist(String name){
        this.name = name;
    }

    public String cycle(int distance){
        return this.name + " cycled " + distance + "m";
    }


}
