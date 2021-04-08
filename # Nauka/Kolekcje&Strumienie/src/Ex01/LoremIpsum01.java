package Ex01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum01 {
    public static void main(String[] args) throws IOException {
        final String fileName = "loremipsum.txt";
        var reader = new BufferedReader(new FileReader(fileName));

        List<String> words = reader.lines()     // Metoda lines() zwraca listę wierszy tekstu
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)   //  flatMap(Arrays::stream) przekształca więc Stream<String[]> na Stream<String>
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(s -> System.out.print(s + " "))
                .count();
        System.out.println();

        System.out.println("Liczba wyrazów na 's': " + countSWords);
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);

        reader.close();
    }
}
