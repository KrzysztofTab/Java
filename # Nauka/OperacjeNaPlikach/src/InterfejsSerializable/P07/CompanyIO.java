package InterfejsSerializable.P07;

import java.io.*;
import java.util.*;

public class CompanyIO{
    private static final String FILE_NAME = "Employees.csv";
    private static final int ADD_EMPLOYEE = 1;
    private static final int PRINT_EMPLOYEES = 2;
    private static final int EXIT = 3;
    private static final Scanner sc = new Scanner(System.in);


    void mainLoop() throws FileNotFoundException {
        Map<Integer, TreeSet<Employee>> employeesMap = readFile(FILE_NAME);
//        Employee employee = new Employee();
        int userOption = 0;
        do {
            try {
                printOptions();
                System.out.println("Wybierz opcję:");
                userOption = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
            } finally {
                sc.nextLine();
            }
            switch (userOption) {
                case ADD_EMPLOYEE -> addEmployee(employeesMap);
                case PRINT_EMPLOYEES -> printEmploee(employeesMap);
               case EXIT -> saveRecord(employeesMap);

            }
        } while (userOption != EXIT);
    }

    private static void printOptions() {
        System.out.println();
        System.out.println(ADD_EMPLOYEE + " - Dodanie pracownika");
        System.out.println(PRINT_EMPLOYEES + " - Pokarz wszystkich pracowników");
        System.out.println(EXIT + " - Wyjście z programu");
    }

    //    Wprowadanaie nowych danych
    private void addEmployee(Map<Integer, TreeSet<Employee>> employeesMap) {
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
        Employee employee = new Employee(pesel, firstName, lastName, position, yearOfEmployment, salary);
        TreeSet<Employee> categorySet = new TreeSet<>();
        categorySet.add(employee);
        employeesMap.put(pesel, categorySet);
    }

    //    Wczytywanie pliku cz.1
    public Map<Integer, TreeSet<Employee>> readFile(String fileName) throws FileNotFoundException {
        Map<Integer, TreeSet<Employee>> employeesMap = new HashMap<>();
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNextLine()) {
                String[] data = fileReader.nextLine().split(";");
                int category = Integer.parseInt(data[0]);
                Employee employee = new Employee(Integer.parseInt(data[0]), data[1], data[2], data[3],
                        Integer.parseInt(data[4]), Double.parseDouble(data[5]));
                insertProductIntoMap(employeesMap, category, employee);
            }
        }
        return employeesMap;
    }

    //    Wczytywanie pliku cz.2
    private static void insertProductIntoMap(Map<Integer, TreeSet<Employee>> employeesMap,
                                             int category, Employee employee) {
        if (employeesMap.containsKey(category))
            employeesMap.get(category).add(employee);
        else {
            TreeSet<Employee> categorySet = new TreeSet<>();
            categorySet.add(employee);
            employeesMap.put(category, categorySet);
        }
    }

    //    Wyświetlanie pracowników
    public static void printEmploee(Map<Integer, TreeSet<Employee>> employeesMap) {
        Set<Map.Entry<Integer, TreeSet<Employee>>> entries = employeesMap.entrySet();
        for (Map.Entry<Integer, TreeSet<Employee>> entry : entries) {
            System.out.println(entry.getValue());
        }
    }

    public void saveRecord(Map<Integer, TreeSet<Employee>> employeesMap) {
        try (
                var fileWriter = new FileWriter(FILE_NAME);
                var bufferedWriter = new BufferedWriter(fileWriter)) {
            for (TreeSet<Employee> employeeTreeSet : employeesMap.values()) {
                bufferedWriter.write(employeeTreeSet.last().toCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Bład zapisu");
        }
    }
}
