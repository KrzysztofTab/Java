package Tablice;

public class Ex02 {
    public static void main(String[] args) {
        // Lista inicjalizacyjna określa wartości do umieszczenia w tablicy
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%10s%n", "Indeks", "Wartość"); // Nagłówki kolumn

        // Wyświetl wartości poszczególnych elementów tablicy
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%6d%10d%n", counter, array[counter]);
        }
    }
}
