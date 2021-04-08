package Zadania.Employee;

public class CompanyTest {
    public static void main(String[] args) {
        new Company();
        Employee[] employees = Company.createEmployees();
        double totalMonthlySalaries = Company.totalMonthlySalaries(employees);
        double totalYearlySalaries = Company.totalYearlySalaries(employees);

        Company.printEmployees(employees);
        Company.printLine("\nSuma miesięcznych wynagrodzeń: " + totalMonthlySalaries + "zł");
        Company.printLine("Suma rocznych wynagrodzeń: " + totalYearlySalaries + "zł");
    }
}
