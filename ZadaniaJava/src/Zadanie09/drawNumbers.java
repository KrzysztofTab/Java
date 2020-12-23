package Zadanie09;

import java.util.Random;
import java.util.Scanner;

public class drawNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;
        Scanner sc = new Scanner(System.in);
        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Podaj liczbę: ");
            int number = sc.nextInt();
            if (number > numberToGuess) {
                System.out.println("Liczba jest za duża!");
            } else if (number < numberToGuess) {
                System.out.println("Liczba jest za mała!");
            } else {
                System.out.println("!Brawo. Liczba własciwa!");
                wasNumberGuessed = true;
            }
        }
    }
}
