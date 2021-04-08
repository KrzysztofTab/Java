package Sort03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PremisesExplorer {
    static Premises[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLinesWithoutHeader(fileName);
//        okreslanie wielkosc tablicy "linesNumber"
        Premises[] premises = new Premises[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
//            scanner.nextLine(); //pomijamy nagłówek
            for (int i = 0; i < linesNumber; i++) {
                String csvLine = scanner.nextLine();
                premises[i] = createPremisesFromCsv(csvLine);
            }
        }
        return premises;
    }

    private static Premises createPremisesFromCsv(String csvLine) {
//        odczytaj dane z lini odzielone przcinkami (csvLine.split(","))
        String[] data = csvLine.split(";");
        String city = data[0];
//        zamieniamy liczbę zmiennoe przecinkowa na double 'Double.parseDouble'
        double area = Integer.parseInt(data[1]);
        double price = Integer.parseInt(data[2]);
        return new Premises(city, area, price);
    }

    //  metoda zliczanie liczby wierszy bez nagłówka
    private static int countLinesWithoutHeader(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (
                Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
//            hasNextLine() - jezeli jest kolejny wiersz wpliku to przejdż do kloejnego wiersza
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }
}
