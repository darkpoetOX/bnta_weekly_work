package com.bnta.word_guesser2.controllers;

import com.bnta.word_guesser2.models.Game;
import com.bnta.word_guesser2.models.Guess;
import com.bnta.word_guesser2.models.LetterList;
import com.bnta.word_guesser2.models.Reply;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private Game game;
    private String currentWord; //this could be called wordState as well (input from Reply class)
    private ArrayList<String> guessedLetters;

    @PostMapping  //this is the function that will fire when a get request is made, localhost:8080/games (GET)
    public ResponseEntity<Reply> newGame(){
        this.game = new Game("hello");
        this.currentWord = "*****";
        this.guessedLetters = new ArrayList<>();
        Reply reply =  new Reply(false, currentWord, "New game started");
        return new ResponseEntity<>(reply, HttpStatus.CREATED); //OK is an enum which means 200 (response successful)
    }

    @GetMapping
    public ResponseEntity<Reply> getGameStatus(){
        Reply reply;
        // Check if game has started
        if (game == null) {
            reply = new Reply(
                    false,
                    this.currentWord,
                    String.format("Game has not been started"));
        } else {
            reply = new Reply(false, this.currentWord, "Game in progress.");
        }
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Reply> handleGuess(@RequestBody Guess guess) {
        // create new Reply object
        Reply reply;

        // Check if game has started
        if (game == null) {
            reply = new Reply(
                    false,
                    this.currentWord,
                    String.format("Game has not been started"));
            return new ResponseEntity<>(reply, HttpStatus.OK);
        }

        // check if letter has already been guessed
        if (this.guessedLetters.contains(guess.getLetter())) {
            reply = new Reply(
                    false,
                    this.currentWord,
                    String.format("Already guessed %s", guess.getLetter()));
            return new ResponseEntity<>(reply, HttpStatus.OK);
        }

        // add letter to previous guesses
        this.guessedLetters.add(guess.getLetter());

        // check for incorrect guess
        if (!game.getWord().contains(guess.getLetter())) {
            reply = new Reply(
                    false,
                    this.currentWord,
                    String.format("%s is not in the word", guess.getLetter()));
            return new ResponseEntity<>(reply, HttpStatus.OK);
        }

        // process correct guess
        String runningResult = game.getWord();

        for (Character letter : game.getWord().toCharArray()) {
            if (!this.guessedLetters.contains(letter.toString())) {
                runningResult = runningResult.replace(letter, '*');
            }
        }

        this.currentWord = runningResult;

        reply = new Reply(
                true,
                this.currentWord,
                String.format("%s is in the word", guess.getLetter()));

        // return result
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @GetMapping(value = "/guessed")
    public ResponseEntity<LetterList> checkGuesses() {
        LetterList letters = new LetterList(this.guessedLetters);
        return new ResponseEntity<>(letters, HttpStatus.OK);
    }
}