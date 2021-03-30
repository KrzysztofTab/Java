package Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum {
    public static void main(String[] args) throws IOException {
        final String fileName = "Loremipsum.txt";
        var reader = new BufferedReader(new FileReader(fileName));
        List<String> words = new ArrayList<>();
        String tmp = null;
        while ((tmp = reader.readLine()) != null) {
            words.addAll(Arrays.asList(tmp.split(" ")));
        }
        words = words.stream()
                // Do usunięcia kropek i przecinków z kolejnych wyrazów wykorzystujemy metodę replaceAll() klasy String.
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());


        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                //  metody peek() możemy w międzyczasie wyświetlić elementy strumienia i sprawdzić ich poprawność
                .peek(s -> System.out.print(s + " "))
                .count();  // metoda count(), zwraca liczbę w postaci long reprezentującą ilość elementów w strumieniu
        System.out.println();
        System.out.println("Liczba wyrazów na 's': " + countSWords + "\n");

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                //  metody peek() możemy w międzyczasie wyświetlić elementy strumienia i sprawdzić ich poprawność
                .peek(s -> System.out.print(s + " "))
                .count();   // metoda count(), zwraca liczbę w postaci long reprezentującą ilość elementów w strumieniu
        System.out.println();
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);


        reader.close();
    }
}
