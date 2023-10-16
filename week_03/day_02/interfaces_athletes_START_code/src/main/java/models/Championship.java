package models;

import interfaces.ICycle;
import interfaces.IRun;
import interfaces.ISwim;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private String name;
    private List<ICycle> cyclists;
    private List<IRun> runners;
    private List<ISwim> swimmers;

    public Championship(String name){
        this.name = name;
        this.swimmers = new ArrayList<>();
        this.cyclists = new ArrayList<>();
        this.runners = new ArrayList<>();
    }

    public void addSwimmer(ISwim swimmer){
        this.swimmers.add(swimmer);
    }

    public List<ISwim> getSwimmers(){
        return this.swimmers;
    }
}
