package Example02;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    private static final int REWERS = 0;
    private static final int AWERS = 1;
    private static final int EXIT = 8;

    Scanner sc = new Scanner(System.in);

    public int getInt() {
        return sc.nextInt();
    }

    public void controlLoop() {
        int option;
        do {
            printOptions();
            option = getInt();
            switch (option) {
                case REWERS -> {
                    System.out.println("wybrałeś - RESZKĘ");
                    DrawInfo();
                }
                case AWERS -> {
                    System.out.println("wybrałeś - ORZEL");
                    DrawInfo();
                }
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji, wprowadź ponownie:");
            }
        } while (option != EXIT);
    }

    private void printOptions() {
        System.out.println("Zgaduj: ");
        System.out.println(REWERS + " - RESZKA");
        System.out.println(AWERS + " - ORZEŁ");
        System.out.println(EXIT + " - wyjście z programu");
    }

    void DrawInfo() {

        int coin = new Random().nextInt(2);
        if (coin != 0) {
            System.out.println("\nwypadło 'orzeł' \n");
        } else {
            System.out.println("\nwypadło 'reszka'\n");
        }
    }

    private void exit() {
        System.out.println("Koniec!");
        sc.close();
    }
}
