package Example01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    public static void main(String[] args) {
        final String fileName = "namespl.txt";

        TreeSet<String> name = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                sotowanie w kolejnosci alfabetycznej ("-" oaznacza sortowanie od Z - A)
                return -o1.compareTo(o2);
            }
        });

        try (Scanner sc = new Scanner(new File(fileName))) {
//            hasNextLina - dopuki w zboirze jest kolejny wiersz to z czytuj
            while (sc.hasNextLine()) {
                name.add(sc.nextLine());
            }
            System.out.println("Liczba imion w zbiorze: " + name.size());
            System.out.println("Pierwsze imię: " + name.first());
            System.out.println("Ostatnie imię: " + name.last());
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku" + fileName);
        }
    }
}
