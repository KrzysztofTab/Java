package Example02.Ex02;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private final int obverse = 1;
    private final int reverse = 0;
    private final int noChoice = -1;
    private int userChoice = noChoice;
    private int flipResult = -1;

    private void showOptions() {
        System.out.println("Wybierz jedną z dwóch opcji");
        System.out.println(obverse + " - orzeł");
        System.out.println(reverse + " - reszka");
    }

    void betResult() {
        showOptions();
        userChoice = input.nextInt();
    }

    void flipCoin() {
        flipResult = random.nextInt(2);
    }

    void showResult() {
        if (userChoice == noChoice) {
            System.out.println("Nie obstawiono wyniku");
        } else if (flipResult == noChoice) {
            System.out.println("Nie rzucono monetą");
        } else if(userChoice == flipResult) {
            if (flipResult == obverse) {
                System.out.println("Brawo, wypadł orzeł i wygrywasz!");
            } else {
                System.out.println("Brawo, wypadła reszka i wygrywasz!");
            }
        } else {
            System.out.println("Niestety Twój wybór był błędny, przegrywasz.");
        }
    }
}
