package MetodyPosrednie;

import java.util.Arrays;
import java.util.List;

public class StreamPeek_01 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .peek(n -> System.out.println("Przed mapowaniem: " + n)) //  metoda peek(...) nie kończy strumienia
                            // może być użyta do wykonania operacji na elemencie "wewnątrz" strumienia
                            // możemy zaobserwować jak po kolei przebiegają operacje strumienia,
                            // np. wypisując element przed i po przefiltrowaniu.
                .map(n -> n * n)
                .forEach(n -> System.out.println("Po mapowaniu: " + n));
        }
}
