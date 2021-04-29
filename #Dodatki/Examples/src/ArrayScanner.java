
import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Petla 'for'");
        System.out.println(Arrays.toString(loopFor()));
        System.out.println();
        System.out.println("Petla 'while'");
        System.out.println(Arrays.toString(loopWhile()));
    }

    private static int[] loopFor() {
        System.out.println("Podaj długość tablicy: ");
        int arrayLen = sc.nextInt();
        int[] numbers = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            numbers[i] += i + 1;
        }
        return numbers;
    }

    private static int[] loopWhile() {
        System.out.println("Podaj długość tablicy: ");
        int arrayLen = sc.nextInt();
        int[] numbers = new int[arrayLen];
        int counter = 0;
        while (counter < arrayLen) {
            numbers[counter] = counter + 1;
            counter++;
        }
        return numbers;
    }

}