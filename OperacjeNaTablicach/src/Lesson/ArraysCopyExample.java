package Lesson;

public class ArraysCopyExample {
    public static void main(String[] args) {
        int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] numbers2 = new int[numbers1.length];
//        wykorzystuje metodę System.arraycopy()
        System.arraycopy(numbers1, 4, numbers2, 0, numbers1.length - 4);

        for (int num : numbers2) {
            System.out.print(num + " ");
        }
    }
}
//    W ten prosty sposób do tablicy numbers2 skopiowaliśmy elementy z tablicy numbers1,
//    zaczynając od indeksu 4 włącznie i wstawiając je na miejsca od indeksu 0 w tablicy numbers2.
//    Liczba skopiowanych elementów to number1.length-4.