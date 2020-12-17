package Cwiczenie;

import java.util.Scanner;

public class SumNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić: ");
        int numbers = sc.nextInt();

        int sum = 0;
//        zmieniamy atrybuty petli For na "-" to jest atutem tej pętli
        for (;numbers > 0 ;numbers--){
            System.out.println("Podaj koejną liczbe: ");
            sum = sum + sc.nextInt();
        }
        System.out.println("Suma podanych licz to: " + sum);
    }
}