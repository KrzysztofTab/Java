package InterfejsSerializable.P07;

import java.util.Objects;

public class Employee extends Person implements Comparable<Employee> {
    private final String position;
    private final int yearOfEmployment;
    private final double salary;

    public Employee(int pesel, String firstName, String lastName, String position,
                    int yearOfEmployment, double salary) {
        super(pesel, firstName, lastName);
        this.salary = salary;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
    }


    public String getPosition() {
        return position;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getYearOfEmployment() == employee.getYearOfEmployment() && Double.compare(employee.getSalary(),
                getSalary()) == 0 && Objects.equals(getPosition(), employee.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPosition(), getYearOfEmployment(), getSalary());
    }

    @Override
    public String toString() {
        return super.toString() + " - " + position + "; rok zatrudnienia: " + yearOfEmployment +
                ", wypłata: " + salary + "zł";
    }

    @Override
    public String toCSV() {
        return getPesel() + ";" + getFirstName() + ";" + getLastName() + ";" + position + ";" +
                yearOfEmployment + ";" + salary;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.getPesel(), e.getPesel());
    }


}
