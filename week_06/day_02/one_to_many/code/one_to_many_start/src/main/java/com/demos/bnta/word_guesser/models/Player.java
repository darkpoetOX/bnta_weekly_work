package com.demos.bnta.word_guesser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "players")
public class Player {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "player") //one player has many games
    @JsonIgnoreProperties({"player"})
    private List<Game> games;

    public Player(String name){
        this.name = name;
        this.games = new ArrayList<>();
    }

    public Player(){} // object needs to be empty for serialisation/deserialisation translation

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }


}
