package Zadanie16;

import java.util.Arrays;
import java.util.Random;

public class WordsDatabase {
    private final Random random = new Random();
    private final String[] words = {"Apple", "Mango", "Peach", "Banana", "Orange", "Grapes", "Tomato"};

    public String getRandomWord() {
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}

// WordsDatabase - klasa przechowująca słowa i pozwalająca wylosować jedno z nich