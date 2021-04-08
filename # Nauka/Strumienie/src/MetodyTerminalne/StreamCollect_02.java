package MetodyTerminalne;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect_02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,1,2,9,8,3);

        List<Integer> numbersAsList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());  // zbierz wszystkie elementy strumienia do listy (List)
        System.out.println("Lista parzystych: " + numbersAsList);

        Set<Integer> numbersAsSet = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet()); // zbierz wszystkie elementy strumienia do zbioru (Set)
        System.out.println("Zbiór parzystych: " + numbersAsSet);

    }
}
