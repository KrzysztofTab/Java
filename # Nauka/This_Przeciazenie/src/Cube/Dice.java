package Cube;

import java.util.Random;

public class Dice {
    Random random = new Random();
    int result;

    public Dice() {
        roll();
    }

    public Dice(int result) {
        this.result = result;
    }

    void roll() {
        result = random.nextInt(6) + 1;
    }

    void printInfo() {
        System.out.println("Liczba na kostce: " + result);
    }
}