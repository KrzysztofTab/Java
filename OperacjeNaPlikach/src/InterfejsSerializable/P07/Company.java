package InterfejsSerializable.P07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Company {
    private static final Scanner sc = new Scanner(System.in);
    public Map<String, TreeMap<Employee>> employeesMap = new HashMap<>();

    public void add(Map<String, TreeMap<Employee>> employeesMap) {
        System.out.println("Wprowadź klucz:");
        String key = sc.nextLine();
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
        employeesMap.put(key, new Employee(firstName, lastName, position, yearOfEmployment, salary));
    }
        return employeesMap;
}
}
