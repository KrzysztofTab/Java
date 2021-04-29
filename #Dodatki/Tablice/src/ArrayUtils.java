import java.util.Arrays;

public class ArrayUtils {

    static int[][] getBiggerArray(int[][] array1, int[][] array2) {
        int sum2 = sumMultiArray(array1);
        int sum1 = sumMultiArray(array2);
        return sum1 > sum2 ? array1 : array2;  // zwraca tablicę w której suma elementów jest większa
    }

    private static int sumMultiArray(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {           // petla pozwala na przejscie po wszystkich elementach i zsumować je
            for (int number : ints) {
                sum += number;
            }
        }
        return sum;
    }

    static String[] moreChars(String[] array1, String[] array2){
        int chars1 = sumChars(array1);
        int chars2 = sumChars(array2);
        return chars1 > chars2 ? array1 : array2;
    }

    private static int sumChars(String[] array) {
        return Arrays.stream(array)         // zamieniamy ją na strumień Stringów
                .mapToInt(String::length)   // zamieniamy każdy napis na liczbę
                .sum();                     // zsumować wszystkie elementy
    }

    static int max(int [] array){
        int max = array[0];
        for( int number: array){
            if(number > max)
                max = number;
        }
        return max;
    }

    static int min(int[] array){
        int min = array[0];
        for (int number : array){
            if(number<min)
                min = number;
        }
        return min;
    }

    static int[] maxRow(int[][] array){
        int maxSum = Arrays.stream(array[0]).sum();
        int maxIndex = 0;
        for ( int i=0; i <array.length; i++){
            int [] row = array[i];
            int rowSum = Arrays.stream(array[i]).sum();
            if(rowSum > maxSum){
                maxSum = rowSum;
                maxIndex = i;
            }
        }
        return array[maxIndex];
    }
}
