package com.bnta.word_guesser2.models;

public class Reply { //This is a DTO
    private boolean correct;
    private String wordState; // "*****" / "*e***"
    private String message;

    public Reply(boolean correct, String wordState, String message){
        this.correct = correct;
        this.wordState = wordState;
        this.message = message;
    }
    // default constructor
    public Reply(){

    }

    //Getters & Setters
    public boolean isCorrect() {
        return correct;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
    public String getWordState() {
        return wordState;
    }

    public void setWordState(String wordState) {
        this.wordState = wordState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
