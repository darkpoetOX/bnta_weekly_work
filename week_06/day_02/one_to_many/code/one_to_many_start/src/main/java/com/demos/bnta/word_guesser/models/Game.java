package com.demos.bnta.word_guesser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity(name = "games")
public class Game {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "word") //do not need to name it as it automatically just calls it the variable name
    private String word;
    @Column(name = "guesses")
    private int guesses;
    @Column(name = "complete")
    private boolean complete;
    @ManyToOne
    @JoinColumn(name = "player_id") //this property is what it has in common with Player
    @JsonIgnoreProperties({"games"}) // we want to ignore otherwise will have infinite recursion
    private Player player;

    public Game(String word, Player player) {
        this.guesses = 0;
        this.complete = false;
        this.word = word;
        this.player = player;
    }

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
