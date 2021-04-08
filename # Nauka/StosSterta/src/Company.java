public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.firstName = "Jan";
        emp.lastName = "Kowalski";
        emp.salary = 5000;
        emp.bonus = 500;
        emp.printTotalSalary();
    }
}
