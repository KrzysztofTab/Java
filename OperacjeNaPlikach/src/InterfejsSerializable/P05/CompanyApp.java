package InterfejsSerializable.P05;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    //    'employees.info' plik w którym bedą zapisane dane pracowników
    private static final String FILE_NAME = "employees.info";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wprowadzanie danych pracowników - " + READ_FROM_USER);
        System.out.println("Wczytaj i wyświetl dane z pliku - " + READ_FROM_FILE);

//        menu wyboru (wpisujemy czy wyswietlamy)
        int option = scanner.nextInt();

        scanner.nextLine();

        if (option == READ_FROM_USER) {

            Company company = createCompany();

            writeFile(company);
        } else if (option == READ_FROM_FILE) {

            try {

                Company company = readFile();
                System.out.println(company);

            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Błąd odczytu danych");
            }
        }
        scanner.close();
    }

    //    odczytywanie pliku
    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var fIS = new FileInputStream(FILE_NAME);
                var oIS = new ObjectInputStream(fIS)
        ) {
            return (Company) oIS.readObject();
        }
    }

    //    zapisywnie do pliku
    private static void writeFile(Company company) {
        try (
                var fOS = new FileOutputStream(FILE_NAME);
                var oOS = new ObjectOutputStream(fOS)
        ) {
            oOS.writeObject(company);
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }

    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPOLYEES; i++) {
            System.out.println("Wprowadź imię:");
            String firstName = scanner.nextLine();
            System.out.println("Wprowadź nazwisko:");
            String lastName = scanner.nextLine();
            System.out.println("Wprowadź wypłatę:");
            double pay = scanner.nextDouble();
            scanner.nextLine();

            company.add(new Employee(firstName, lastName, pay));
        }
        return company;
    }
}
