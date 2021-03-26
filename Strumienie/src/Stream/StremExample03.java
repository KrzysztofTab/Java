package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StremExample03 {
    public static void main(String[] args) {
        int[] numers = IntStream
                .iterate(0, x -> x + 2)  // ustawiamy ciąg licz jaki chcemy
                .limit(25)                   //  ustawiamy ile liczb chcemy uzyskać
                .map(x -> x * x)
                .toArray();
        System.out.println();
        System.out.println(Arrays.toString(numers));

        int[] num = IntStream
                .rangeClosed(0, 99)          // odrazu ustawiamy wielkosć strumienia liczb
                .filter(x -> x % 2 == 0)
                .toArray();
        System.out.println();
        System.out.println(Arrays.toString(num));
    }
}
