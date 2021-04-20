package Zadanie17;

public class Task01 {
    private static final String n1 = "Array_A";
    private static final String n2 = "Array_B";

    public static void main(String[] args) {
        int[][] arrayA = {{16, 3, 2, 13}, {5, 10, 11, 8},};
        int[][] arrayB = {{25, 3, 16, 7,}, {6, 13, 19, 8}};


        System.out.println("arrayA");
        arrayX(arrayA);
        System.out.println("Suma wszystkich elementów tablicy wynosi: "+ sumOfArrayElements(arrayA));

        System.out.println("\narrayB");
        arrayX(arrayB);
        System.out.println("Suma wszystkich elementów tablicy wynosi: "+ sumOfArrayElements(arrayB));

        comparisonArray(arrayA, arrayB);
    }

    private static void comparisonArray(int[][] arrayX, int[][] arrayZ) {
        if(sumOfArrayElements(arrayX) > sumOfArrayElements(arrayZ)){
            System.out.println("Suma liczb w " + n1 + "jest wieksza i wynosi = "
                    + sumOfArrayElements(arrayX));
        }else {
            System.out.println("\nSuma liczb w " + n2 + " jest wieksza i wynosi = "
                    + sumOfArrayElements(arrayZ));
        }
    }

    private static int sumOfArrayElements(int[][] arrayX) {
        int suma = 0;
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX[i].length; j++) {
                suma += arrayX[i][j];
            }
        }
        return suma;
    }

    private static void arrayX(int[][] arrayX) {
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX[i].length; j++) {
                System.out.printf("[%d][%d] = %d \n", i, j, arrayX[i][j]);
            }
        }
    }
}