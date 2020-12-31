package Example02.Ex01;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        final int obverse = 1;
        final int reverse = 0;

        System.out.println("Wybierz jedną z dwóch opcji");
        System.out.println(obverse + " - orzeł");
        System.out.println(reverse + " - reszka");

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        Random random = new Random();
        int flipResult = random.nextInt(2);

        if(userChoice == flipResult) {
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
