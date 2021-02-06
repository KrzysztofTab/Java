package Lesson;

import java.util.Arrays;

public class AraysExample {
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 5, 9, 8, 6, 23, 15, 19};

//        wyświetlanie tablicy names
        System.out.println("Names: ");
        printArray(names);
        System.out.println();

        System.out.println("Numbers: ");
        printArray(numbers);
        System.out.println();

//        sorowanie
        System.out.println("Arrays.sort(numbers): ");
        Arrays.sort(numbers);
        printArray(numbers);
        System.out.println();

        System.out.println("Arrays.sort(names): ");
        Arrays.sort(names);
        printArray(names);
        System.out.println();

//        copyOf
        System.out.println("Numbers2, Arrays.copyOf()");
//        tworzymy nową tablicę i kopjujemy zawartość tablicy 'numbers', 'numbers.length' - całej
        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        printArray(numbers2);
        System.out.println();

//        equals
        System.out.println("Arrays.equals(numbers, numbers2): ");
        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println();

//        fill - wypełnia pustą tablicę String
        System.out.println("Arrays.fill()");
        String[] strings = new String[5];
        Arrays.fill(strings,"wypełnienie");
        printArray(strings);
    }

//    przekazujemy jako argument generycznej metody printArray()
    private static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + ", ");
        }
        System.out.println();
    }
}
