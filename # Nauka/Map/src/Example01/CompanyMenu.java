package Example01;

import java.util.*;

public class CompanyMenu {
    private static final int ADD_EMPLOYEE = 1;
    private static final int FIND_EMPLOYEE = 2;
    private static final int PRINT_EMPLOYEES = 3;
    private static final int EXIT = 4;

    private static final Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Company company = new Company();
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
                case ADD_EMPLOYEE:
                    Employee employee = readAndCreateEmployee();
                    company.addEmployee(employee);
                    break;
                case FIND_EMPLOYEE:
                    findEmployee(company);
                    break;
                case PRINT_EMPLOYEES:
                    printEmployees(company);
                    break;
                case EXIT:
                    System.err.println("! Konic !");
            }
        } while (userOption != EXIT);
    }

    //    wyszukiwanie pracownika
    private static void findEmployee(Company company) {
        System.out.println("Podaj imię:");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();
        Employee employee = company.getEmployee(firstName, lastName);
        if (employee == null)
            System.out.println("Brak takiego pracownika");
        else
            System.out.println(employee);
    }


    //    dodawanie pracownika
    private static Employee readAndCreateEmployee() {
        System.out.println("Podaj imię:");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();
        System.out.println("Podaj wypłatę:");
        double salary = sc.nextDouble();
        sc.nextLine();
        return new Employee(firstName, lastName, salary);
    }

   private void printEmployees(Company company) {
       Set<Map.Entry<String, Employee>> entries = company.employees.entrySet();
       for (Map.Entry<String, Employee> entry : entries){
           System.out.println(entry.getValue());
       }
    }

    private static void printOptions() {
        System.out.println(ADD_EMPLOYEE + " - Dodanie pracownika");
        System.out.println(FIND_EMPLOYEE + " - Wyszukiwanie pracownika");
        System.out.println(PRINT_EMPLOYEES + " - Pokarz wszystkich pracowników");
        System.out.println(EXIT + " - Wyjście z programu");
    }
}

//    Wykorzystaj w klasie Company dowolny rodzaj mapy. Jako klucz wykorzystaj np. połączone imię oraz nazwisko,
//    a jako wartości przechowuj w niej obiekty typu Employee.
//    Company - przechowuje informacje o pracownikach w postaci mapy,