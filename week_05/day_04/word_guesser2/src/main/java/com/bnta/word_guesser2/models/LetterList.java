package com.bnta.word_guesser2.models;

import java.util.ArrayList;

public class LetterList {

    private ArrayList<String> letters;

    public LetterList(ArrayList<String> letters) {
        this.letters = letters;
    }

    public LetterList() {
    }

    public ArrayList<String> getLetters() {
        return letters;
    }

    public void setLetters(ArrayList<String> letters) {
        this.letters = letters;
    }
}
