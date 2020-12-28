package Cube;

import java.util.Random;

public class ThrowDice {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.printInfo();
        dice1.roll();
        dice1.printInfo();
        dice1.roll();
        dice1.printInfo();
        dice1.roll();
        dice1.printInfo();
    }
}
