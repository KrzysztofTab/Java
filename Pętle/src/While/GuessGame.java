package While;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        final int number = 10;
        int userInput;
        System.out.println("Zgadnij liczbę do 49");

        while ((userInput = reader.nextInt()) != number) {
            if (userInput > number) {
                System.out.println("Podana liczba jest za duża, zgdauj dalej!");
            } else {
                System.out.println("Podana liczba jest za mała, zgaduj dalej!");
            }
        }
        System.out.println("Brawo, zgadłeś o jaką liczbę chodziło, wygywasz!");
        reader.close();
    }
}