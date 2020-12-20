package Zadanie10;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

//        ustalanie wartosci wg scanera
        for (int next = sc.nextInt(); next <= 100; next = sc.nextInt()) {
            sum += next;
        }
        int mod = sum % 2;
        if (mod == 0) {
            System.out.println(sum + " parzysta");
        } else {
            System.out.println(sum + " nieparzysta");
        }
    }
}