package InterfejsSerializable.P06;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ClientDataReader {
    static Client[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLinesWithoutHeader(fileName);
//        okreslanie wielkosc tablicy "linesNumber"

        Client[] clients = new Client[linesNumber];

        try (Scanner scanner = new Scanner(new File(fileName))) {

            scanner.nextLine(); //pomijamy nagłówek

            for (int i = 0; i < linesNumber; i++) {

                String csvLine = scanner.nextLine();

                clients[i] = createClientFromCsv(csvLine);
            }
        }
        return clients;
    }

    private static Client createClientFromCsv(String csvLine) {
//        odczytaj dane z lini odzielone przcinkami (csvLine.split(","))

        String[] data = csvLine.split(",");
//        zamien stringa na int - to jest identyfikator  - 'Integer.parseInt '

        int id = Integer.parseInt(data[0]);

        String firstName = data[1];

        String lastName = data[2];

        String country = data[3];
//        zamieniamy liczbę zmiennoe przecinkowa na double 'Double.parseDouble'

        double value = Double.parseDouble(data[4]);

        return new Client(id, firstName, lastName, country, value);
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
