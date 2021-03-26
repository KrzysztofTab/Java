package Stream;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class StremExample04 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("File.txt"));
        //    while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        scanner.tokens()                        // odczytuje tylko pojedyńcze słowa i dodaje do kolejnej lini
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
