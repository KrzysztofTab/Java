package MetodyPosrednie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamMap_01 {
    public static void main(String[] args) {
        // funkcja zamieniająca dowolnego Stringa s na Stringa wielkimi literami
//        Function<String, String> changeToUpperCase = s -> s.toUpperCase();
        Function<String, String> changeToUpperCase = String::toUpperCase;

        // funkcja zamieniająca dowolnego Stringa s na Integera - jego długość
//        Function<String, Integer> changeToLength = s -> s.length();
        Function<String, Integer> changeToLength = String::length;

        System.out.println("--- map to upper case ---");
        String mappedToUpperCase = changeToUpperCase.apply("Java");
        System.out.println(mappedToUpperCase);

        System.out.println("--- map to length ---");
        Integer mappedToLength = changeToLength.apply("Java");
        System.out.println(mappedToLength);
    }
}

