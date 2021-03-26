package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StremExample01 {
    public static void main(String[] args) {
        //a -> b -> c  - stumienie
//        Stream<String> strem = Stream.of("a", "b", "c");
//        Stream<Integer> numberStrem = Stream.of(1, 2, 3, 4);
//        IntStream.of(1,2,3,4);
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);  // stumień
        int[] evenNumbers = intStream
                .filter(x -> x % 2 == 0)    // operacja na strumieniu
                .toArray();                 // operacja na strumieniu
        System.out.println(Arrays.toString(evenNumbers));
    }
}

//filter() - filtruje elementy strumienia zgodnie z zadanym kryterium w postaci predykatu, zwraca przefiltrowany strumień,
//map() - przekształca każdy element strumienia zgodnie z przekazaną funkcją, zwraca strumień z przetworzonymi elementami,
//toArray() - zbiera elementy strumienia do tablicy.