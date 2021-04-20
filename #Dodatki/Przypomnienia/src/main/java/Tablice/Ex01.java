package Tablice;

public class Ex01 {
    public static void main(String[] args) {
        // Deklaracja  zmiennej tablicowej i inicjalizacja jej obiektem tablicy
        int[] array = new int[10];
        System.out.printf("%s%10s%n", "Indeks", "Wartość"); // Nagłówki kolumn

        // Wyświetl wartości poszczególnych elementów tablicy
        for( int couter = 0; couter< array.length;couter++){
            System.out.printf("%6d%10d%n",couter, array[couter]);
        }
    }
}
