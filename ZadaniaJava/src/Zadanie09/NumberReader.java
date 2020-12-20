/* Wczytaj od użytkownika dowolną liczbę całkowitą różną od 0.
   Jeżeli liczba jest większa od 0 wyświetl na ekranie wszystkie liczby z przedziału [0, N],
   gdzie N jest liczbą podaną przez użytkownika z odstępem co 0.1.
   Jeśli liczba jest mniejsza od 0 wyświetl liczby od 0 do N (w porządku malejącym).
*/
package Zadanie09;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbę calkowitą rózną od 0 w granicach (-5;5): ");
        double n = sc.nextInt();
        sc.close();
        if (n > 0)
            for (double i = 0; i < (n + 0.1); i += 0.1)
//                Używając metody printf() możemy określić wzorzec zgodnie z którym mają być wyświetlane liczby.
//                Zapis %.1f oznacza liczbę zmiennoprzecinkową zaokrągloną do 1 miejsca po przecinku.
                System.out.printf("%.1f  ", i);
        else if (n < 0)
            for (double i = 0; i > (n - 0.1); i -= 0.1)
                System.out.printf("%.1f  ", i);
    }
}