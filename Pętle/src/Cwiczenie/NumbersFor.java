package Cwiczenie;

import java.util.Scanner;

public class NumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ile liczb chcesz wprowadzić: ");
        int iloscLiczb = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Podana " + (i + 1) + " liczbe: ");
            sum = sum + sc.nextInt();
        }
        System.out.println(sum);
    }
}