package InterfejsSerializable.P07;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CompanyApp {

    private static final String FILE_NAME = "Employees.scv";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Wprowadzanie danych pracowników - " + READ_FROM_USER);
        System.out.println("Wczytaj i wyświetl dane z pliku - " + READ_FROM_FILE);

        int option = sc.nextInt();
        sc.nextLine();
        if (option == READ_FROM_USER) {
//            Company company = createCompany();
//            writeFile(company);
        } else if (option == READ_FROM_FILE) {
            try {
                Employee[] employees = readFile();
                System.out.println(Arrays.toString(employees));
            } catch (IOException e) {
                System.err.println("Błąd odczytu danych");
            }
        }
        sc.close();
    }

    static Employee[] readFile() throws FileNotFoundException {
        final int linesNumber = countLinesWithoutHeader();
        Employee[] employees = new Employee[linesNumber];
        try (Scanner sc = new Scanner(new File(CompanyApp.FILE_NAME))) {
            for (int i = 0; i < linesNumber; i++) {
                String csvLine = sc.nextLine();
                employees[i] = createClientFromCsv(csvLine);
            }
        }
        return employees;
    }

    private static Employee createClientFromCsv(String csvLine) {
        String[] data = csvLine.split(";");
        String firstName = data[0];
        String lastName = data[1];
        String position = data[2];
        int yearOfEmployment = Integer.parseInt(data[3]);
        double salary = Double.parseDouble(data[4]);
        return new Employee(firstName, lastName, position, yearOfEmployment, salary);
    }

    private static int countLinesWithoutHeader() throws FileNotFoundException {
        int lines = 0;
        try (Scanner sc = new Scanner(new File(CompanyApp.FILE_NAME))) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
        }
        return lines;
    }

    private static void writeFile(Company company) {
        try(
                var fis = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fis);
        ) {
            oos.writeObject(company);
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }

}
