package Zadanie17.Ex01;

public class Ex01 {
    public static void main(String[] args) {
        int[][] tab = new int[2][3];
        int licznik = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = licznik++;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("tab [%d][%d] = %d \n", i, j, tab[i][j]);
            }
            System.out.println();
        }

        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                suma += tab[i][j];
            }
        }
        System.out.println("Suma wszystkich elementów tablicy: " + suma);
    }
}
