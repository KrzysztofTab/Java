package Ex01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Members {
    public static void main(String[] args) {
        int[] numbers = IntStream
                .iterate(0, x -> x + 1)
                .filter(x -> x > 100 && x < 1000 && x % 5 == 0)             // (x->x +1) predykat, (&&) koniunkcja
                .limit(10)
                .map(x -> x * 3)                         // przekształcamy element strumienia w inny strumień (T -> R)
                .toArray();
        System.out.println(Arrays.toString(numbers));
    }
}
