package For;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę do sprawdzenia: ");
            int tmp = sc.nextInt();

//            %2==0 - sprawdza czy liczb jest parzysta
            if (tmp % 2 == 0) {
                System.out.println("Liczba " + tmp + " jest parzysta!"+"\n");
            } else {
                System.out.println("Liczba " + tmp + " nie jest parzysta!"+"\n");
            }
        }
        sc.close();
    }
}
