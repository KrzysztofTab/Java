package Zadanie11;

import java.util.Scanner;

public class Diamont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println(); //new line
        }
    }
}
