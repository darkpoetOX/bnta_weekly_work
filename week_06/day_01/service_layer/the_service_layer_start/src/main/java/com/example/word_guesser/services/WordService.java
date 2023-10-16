package com.example.word_guesser.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class WordService {
    private List<String> words;

    public WordService(){
        this.words = Arrays.asList(
                "hello",
                "goodbye",
                "testing",
                "mystery",
                "spring",
                "controller",
                "hola"
        );
    }

    public String getRandomWord(){
        Random random = new Random();
        int randomIndex = random.nextInt(this.words.size()); //generates random integer from 0 up to and including length of words.
        return this.words.get(randomIndex);
    }
}
