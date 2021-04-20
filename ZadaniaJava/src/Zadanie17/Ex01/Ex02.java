package Zadanie17.Ex01;

public class Ex02 {
    public static void main(String[] args) {
        int[][] arrayAA = {{16, 3, 2, 13}, {5, 10, 11, 8}, {59, 6, 7, 82}}; // tablica wielowymiarowa

        for (int i = 0; i < arrayAA.length; i++) {
            int[] arrayA = arrayAA[i];         // tablica jednowymiarowa
            for (int j = 0; j < arrayA.length; j++) {
                System.out.print(arrayAA[i][j] + " ");
            }
            System.out.println();
        }

        int suma = 0;
        for (int[] ints : arrayAA) {
            for (int anInt : ints) {
                suma += anInt;
            }
        }
        System.out.println("\nSuma wszystkich elementów tablicy: " + suma);
    }
}

