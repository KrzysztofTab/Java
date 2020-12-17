package Cwiczenie;

import java.util.Scanner;

public class NumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić: ");
        int numbers = sc.nextInt();

        int sum = 0;
        while (numbers > 0){
            System.out.println("Podaj kolejną liczbę: ");
            sum = sum +sc.nextInt();
            numbers --;
        }
        System.out.println("Suma podanych licz wynosi: "+sum);
    }
}