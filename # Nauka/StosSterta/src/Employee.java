public class Employee {
    String firstName;
    String lastName;
    double salary;
    double bonus;

    void printTotalSalary() {
        double totalSalary = salary + bonus;
        String message = "Całkowita wypłata: " + totalSalary;
        System.out.println(message);
    }
}
