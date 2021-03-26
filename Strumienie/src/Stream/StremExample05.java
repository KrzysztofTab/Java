package Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StremExample05 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader fileReader = new BufferedReader(new FileReader("File.txt"));
        fileReader.lines()
                .map(String::toUpperCase)               // odczytuje całe linie
//                .filter("JANEK"::equals)             // filtruje po słowie JANEK
                .forEach(System.out::println);
    }
}
