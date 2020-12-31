package Zadanie12;

import java.util.Scanner;

public class PrintNegativeEndPositive {
    public static void main(String[] args) {
        int multi = getMulti();
        printInfo(multi);
    }

    private static int getMulti() {
        Scanner sc = new Scanner(System.in);
        int multi = 1;
        for (int index = 0; index < 5; index++) {
            System.out.println("Podaj liczbę: ");
            int next = sc.nextInt();
            multi *= next;
        }
        return multi;
    }

    private static void printInfo(int multi) {
        if (multi >= 0) {
            System.out.println("liczba jest nieujemna");
        } else {
            System.out.println("liczba jest ujemna");
        }
    }
}