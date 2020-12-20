package Zadanie10;

import java.util.Scanner;

public class ScanerMember {
    public static void main(String[] args) {
        int sum = getSum();
        extracted (sum);
    }

    private static void extracted(int sum) {
        int mod = sum % 2;
        if (mod == 0) {
            System.out.println(sum +" parzysta");
        } else {
            System.out.println(sum +" nieparzysta");
        }
    }

    private static int getSum() {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int sum = 0;
        System.out.println("Podaj liczbę: ");
        while (( a = sc.nextInt()) <= 100) {
            sum += a;
        }
        return sum;
    }
}