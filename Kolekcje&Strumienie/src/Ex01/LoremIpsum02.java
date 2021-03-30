package Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum02 {
    public static void main(String[] args) {
        final String fileName = "loremipsum.txt";

        List<String> words = null;
        try {
            words = readFile(fileName);
            showWordStats(words);
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku " + fileName);
        }
    }

    private static void showWordStats(List<String> words) {
        long countSWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s+" "))
                .count();
        System.out.println("Liczba wyrazów na 's': " + countSWords);

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(System.out::println)
                .count();
        System.out.println("Liczba wyrazów z 5 znakami: " + fiveLetters);
    }

    private static List<String> readFile(String fileName) throws IOException {
        try (var reader = new BufferedReader(new FileReader(fileName))) {
            List<String> words = new ArrayList<>();
            return reader.lines() //Stream<String>
                    .map(line -> line.split(" ")) //Stream<String[]>
                    .flatMap(Arrays::stream) //Stream<String>
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", "")) //Stream<String>
                    .collect(Collectors.toList());
        }
    }
}
