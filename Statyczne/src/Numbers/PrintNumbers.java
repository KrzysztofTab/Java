package Numbers;

import Human.Human;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star, end;

        do {
            System.out.println("Pierwsza liczba: ");
            star = sc.nextInt();
            System.out.println("Druga liczba: ");
            end = sc.nextInt();
            Numbers.printNumbers(star, end);
            System.out.println("Koniec programu, wprowadź " + Numbers.EXIT);
            System.out.println("Kontynuuj, wprowadź wartość inną od " + Numbers.EXIT);
        } while (sc.nextInt() != Numbers.EXIT);

        sc.close();
    }
}