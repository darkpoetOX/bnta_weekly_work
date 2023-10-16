package models;


import interfaces.ICycle;
import interfaces.IRun;
import interfaces.ISwim;

public class Triathlete implements ICycle, IRun, ISwim {

    private String name;

    public Triathlete(String name){
        this.name = name;
    }

    public String cycle(int distance){
        return this.name + " cycled " + distance + "m after swimming";
    }

    public String run(int distance){
        return this.name + " ran " + distance + "m after cycling";
    }

    public String swim(int distance){
        return this.name + " swam " + distance + "m from the start";
    }

}
