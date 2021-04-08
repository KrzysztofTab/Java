package MetodyPosrednie;

import java.util.Arrays;
import java.util.List;

public class StreamMap_02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mariah", "Bob", "Pamela");
        // zamiana imion na wersje dużymi literami i wypisanie
        System.out.println("--- imiona dużymi literami ---");
        names.stream()
//                .map(name -> name.toUpperCase())
                .map(String::toUpperCase)
//                .forEach(nameUpper -> System.out.println(nameUpper));
                .forEach(System.out::println);

        // zamiana imion na ich długości i wypisanie
        System.out.println("--- imiona zamienione na długość ---");
        names.stream()
//                .map(name -> name.length())
                .map(String::length)
//                .forEach(length -> System.out.println(length));
                .forEach(System.out::println);

        // zamiana liczby na jej kwadrat, zostawienie tylko kwadratów
        // większych od 10 i wypisanie
        System.out.println("--- kwadraty większe od 10 ---");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream()
                .map(number -> number*number)
                .filter(square -> square > 10)
                .forEach(System.out::println);
    }
}
