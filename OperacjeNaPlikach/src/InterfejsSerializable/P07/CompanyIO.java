package InterfejsSerializable.P07;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CompanyIO {
    private static final Scanner sc = new Scanner(System.in);
    private static final String FILE_NAME = "Employees.scv";


    public void addEmpolee(Map<Integer, Employee> employeesMap) {
        System.out.println("Wprowadż pesel: ");
        int pesel = sc.nextInt();
        sc.nextLine();
        System.out.println("Wprowadź imię:");
        String firstName = sc.nextLine();
        System.out.println("Wprowadź nazwisko:");
        String lastName = sc.nextLine();
        System.out.println("Wprowadź stanowisko:");
        String position = sc.nextLine();
        System.out.println("Wprowadź rok zatrudnienia:");
        int yearOfEmployment = sc.nextInt();
        System.out.println("Wprowadź wypłatę:");
        double salary = sc.nextDouble();
        sc.nextLine();
        employeesMap.put(pesel, new Employee(pesel, firstName, lastName, position, yearOfEmployment, salary));
    }

        static Employee[] readFile() throws FileNotFoundException {
        final int linesNumber = countLinesWithoutHeader();
        Employee[] employees = new Employee[linesNumber];
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            for (int i = 0; i < linesNumber; i++) {
                String csvLine = sc.nextLine();
                employees[i] = createClientFromCsv(csvLine);
            }
        }
        return employees;
    }

    private static Employee createClientFromCsv(String csvLine) {
        String[] data = csvLine.split(";");
        int pesel = Integer.parseInt(data[0]);
        String firstName = data[1];
        String lastName = data[2];
        String position = data[3];
        int yearOfEmployment = Integer.parseInt(data[4]);
        double salary = Double.parseDouble(data[5]);
        return new Employee(pesel, firstName, lastName, position, yearOfEmployment, salary);
    }

    private static int countLinesWithoutHeader() throws FileNotFoundException {
        int lines = 0;
        try (Scanner sc = new Scanner(new File(FILE_NAME))) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
        }
        return lines;
    }

    private static void writeFile(CompanyIO company) {
        try (
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
