package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StremExample02 {
    public static void main(String[] args) {
     Stream<String> letters = Stream.of("a","b","c","d","e");
        String[] upperCaseLetters = letters
                .map(String::toUpperCase)           // operacja - T -> R - funkcja mapowania
                .toArray(String[]::new);
        System.out.println(Arrays.toString(upperCaseLetters));
    }
}
