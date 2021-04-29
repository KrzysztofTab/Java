import java.util.Arrays;
import java.util.Random;

public class ArraysZa {
    public static void main(String[] arg) {
        int liczby[] = new int[10];
        Random los = new Random();
        /// Losowanie 10 liczb z przedziału [-10,10]

        for (int i = 0; i < 10; i++) {
            int liczba1 = los.nextInt(21) - 10;
            liczby[i] = liczba1;
        }
        /// Drukowanie tablicy nieposegregowanej na ekran

        System.out.println(Arrays.toString(liczby));

        /// Wyznaczanie najmniejszego i największego elementu tablicy

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] <= min) min = liczby[i];
            if (liczby[i] >= max) max = liczby[i];
        }
        System.out.println("Wartość maksymalna w tablicy to: " + max);
        System.out.println("Wartość minimalna w tablicy to: " + min);

        /// Wyznaczanie średniej arytmetycznej tablicy

        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma = suma + liczby[i];
        }
        int a = suma / liczby.length;
        System.out.println("Suma elementów tablicy: " + suma);
        System.out.println("Średnia arytmetyczna elementów tablicy to: " + a);

        /// Sprawdzanie ile elementów jest większych a ile mniejszych od średniej artymetycznej

        int mniejszych = 0;
        int wiekszych = 0;
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] < a) mniejszych++;
            else if (liczby[i] > a) wiekszych++;
        }
        System.out.println("Elementów mniejszych od średniej arytmetycznej jest: " + mniejszych);
        System.out.println("Elementów większych od średniej arytmetycznej jest: " + wiekszych);

        /// Wyświetlanie zawartości tablicy w kolejności odwrotnej - sposób I - nie do końca dobry
        String ybzcil = Arrays.toString(liczby);
        StringBuilder sb = new StringBuilder(ybzcil).reverse();
        System.out.println(sb);

        /// Wyświetlanie zawartości tablicy w kolejności odwrotnej
        int odwrotne[] = new int[liczby.length];
        int n = liczby.length - 1;
        int j = n;
        for (int i = 0; i <= n; i++) {
            odwrotne[i] = liczby[j];
            j--;
        }
        System.out.println(Arrays.toString(odwrotne));
    }
}
