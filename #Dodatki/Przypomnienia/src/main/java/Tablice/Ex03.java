package Tablice;

public class Ex03 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // Deklaracja stałej
        int[] array = new int[ARRAY_LENGTH]; // Utworzenie tablicy

        // Obliczenie wartości dla każdego elementu tablicy
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter; // ( 2 * nr_indeksu) + 2
        }
        System.out.printf("%s%10s%n", "Indeks", "Wartość"); // Nagłówki kolumn

        // Wyświetl wartości poszczególnych elementów tablicy
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%6d%10d%n", counter, array[counter]);
        }
    }
}
