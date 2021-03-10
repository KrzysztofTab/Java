package InterfejsSerializable.P07;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyApp {
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Employee> employeesMap = new HashMap<>();
        CompanyIO company = new CompanyIO();
        System.out.println("Wprowadzanie danych pracowników - " + READ_FROM_USER);
        System.out.println("Wczytaj i wyświetl dane z pliku - " + READ_FROM_FILE);

        int option = sc.nextInt();
        sc.nextLine();
        if (option == READ_FROM_USER) {
            company.addEmpolee(employeesMap);
        } else if (option == READ_FROM_FILE) {
            Employee[] employees = CompanyIO.readFile();
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }
        sc.close();
    }


}
