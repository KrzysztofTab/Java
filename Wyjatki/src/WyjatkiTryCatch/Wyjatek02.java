package WyjatkiTryCatch;//Program można jeszcze usprawnić i prosić użytkownika o podanie wartości,
// dopóki nie będzie ona poprawna. W tym celu dodajemy pętlę z prostą flagą typu boolean,
// która pozwoli określić, czy już poprawnie wczytano liczbę (flagą w programowaniu nazywa się zmienną,
// która oznacza pewien stan aplikacji, np. poprawny/niepoprawny).

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatek02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = 0;
        boolean error = true;
//        Ponieważ korzystamy z pętli 'do while' to pętla wykona się przynajmniej raz.
        do {
            try {
                number = sc.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę");
            }catch (InputMismatchException ex){
                System.err.println("Nie podałeś liczby całkowitej,spóbuj jeszcze raz:");
                sc.nextLine();
            }
        }while (error);
        System.out.println("Podałeś:" + number);
        sc.close();
    }
}
