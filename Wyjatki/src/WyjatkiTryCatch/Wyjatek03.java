package WyjatkiTryCatch;//Jeżeli w bloku try{} umieścimy bardziej skomplikowany kod, to może się zdarzyć,
// że będzie on mógł wygenerować więcej niż 1 rodzaj wyjątku.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatek03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj 1 liczbę: ");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj 2 liczbę: ");
                numbers[1] = sc.nextInt();

                System.out.println("Którą wartość wyświetlić (1 lub 2)? ");
                System.out.println("Liczba:" + numbers[sc.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException ex) {
                System.err.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz:");
                sc.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Miało być 1 lub 2, zacznijmy od nowa: ");
                sc.nextLine();
            }
        } while (error);
        sc.close();
    }
}
