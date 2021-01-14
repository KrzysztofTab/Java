package WyjatkiTryCatch;//Pierwszym sposobem obsługi wyjątków jest zastosowanie bloku try catch.
// Opisowo konstrukcję tę można opisać jako "spróbuj przechwycić wyjątek w bloku try
// i jeśli on faktycznie wystąpi to wykonaj kod w bloku catch".

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatek01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number=0;
        try {
            number = sc.nextInt();
            System.out.println("Wczytano poprawną liczbę");
        }catch (InputMismatchException ex){
//            konsoli będzie wyróżniony kolorem czerwonym
            System.err.println("Podana wartość nie jest liczbą całkowitą");

//            wyswietlanie całej tablicy błedów
//            ex.printStackTrace();
        }
        System.out.println("Podałeś: " + number);
        sc.close();
    }
}
