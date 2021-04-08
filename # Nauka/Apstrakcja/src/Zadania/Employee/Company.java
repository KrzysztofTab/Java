package Zadania.Employee;

public class Company {
    public static Employee[] createEmployees() {
        Employee[] employees = new Employee[2];
        employees[0] = new PersonalFullTime("Tomasz Kozioł", 5000);
        employees[1] = new PersonalPartTime("Anna Zalewska", 10, 1000);
        return employees;
    }

    public static void printEmployees(Employee[] employees) {
        printLine("Pracownicy:\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double totalYearlySalaries(Employee[] employees) {
        double totalYearlySalaries = 0;
        for (Employee employee : employees) {
            totalYearlySalaries += employee.getYearlySalary();
        }
        return totalYearlySalaries;
    }

    public static double totalMonthlySalaries(Employee[] employees) {
        double totalMonthlySalaries = 0;
        for (Employee employee : employees) {
            totalMonthlySalaries += employee.getMonthlySalary();
        }
        return totalMonthlySalaries;
    }

    public static void printLine(String text) {
        System.out.println(text);
    }
}
