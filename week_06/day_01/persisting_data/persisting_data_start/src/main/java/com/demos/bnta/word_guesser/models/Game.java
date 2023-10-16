package com.demos.bnta.word_guesser.models;

import jakarta.persistence.*;

@Entity(name = "games") //table
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "word")
    private String word;
    @Column(name = "guesses")
    private int guesses;
    @Column(name = "complete")
    private boolean complete;

    public Game(String word) {
        this.guesses = 0;
        this.complete = false;
        this.word = word;
    }

    public Game() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
