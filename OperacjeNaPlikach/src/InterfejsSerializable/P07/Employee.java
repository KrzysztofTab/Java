package InterfejsSerializable.P07;

import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>{
    private String position;
    private int yearOfEmployment;
    private double salary;


    public Employee(String firstName, String lastName, String position, int yearOfEmployment, double salary) {
        super(firstName, lastName);
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
    public int compareTo(Employee e) {
        return Integer.compare(this.yearOfEmployment,e.yearOfEmployment);
    }
}
