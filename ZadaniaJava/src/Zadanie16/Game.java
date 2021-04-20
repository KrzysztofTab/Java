package Zadanie16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private static final int GAME = 1;
    private static final int EXIT = 2;
    private static final Scanner sc = new Scanner(System.in);
    private final WordsDatabase wd = new WordsDatabase();

    public void mainLoop() {
        int userOption = 0;
        do {
            try {
                printOptions();
                System.out.println("Wybierz opcję:");
                userOption = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz! ");
            } finally {
                sc.nextLine();
            }
            switch (userOption) {
                case GAME -> play();
                case EXIT -> exit();
            }
        } while (userOption != EXIT);
        sc.nextLine();
    }

    private static void printOptions() {
        System.out.println();
        System.out.println(GAME + " - Graj");
        System.out.println(EXIT + " - Wyjście z programu");
        System.out.println();
    }

    private static void exit() {
        System.out.println("Konie Gry");
    }

    private void play() {
        Hangman hangman = new Hangman(wd.getRandomWord());
        do {
            System.out.println("\nHasło do zgadnięcia:");
            String guessWordDisplay = hangman.getGuessWordDisplay();
            System.out.println(guessWordDisplay);
            System.out.println("Podaj literę:");
            String line = sc.nextLine();
            char userGuess = line.charAt(0);
            hangman.checkLetter(userGuess);
        } while(!hangman.userLost() && !hangman.userWon());
        System.out.println();
        if(hangman.userLost())
            System.out.println("Przegrałeś!");
        else if(hangman.userWon())
            System.out.println("Wygrałeś!");
        System.out.printf("Hasło: %s\n\n", hangman.getGuessWord());
    }
}


// Game - klasa z logiką aplikacji - wczytywanie danych, wyświetlanie komunikatów, wywoływanie metod z wcześniejszych dwóch klas