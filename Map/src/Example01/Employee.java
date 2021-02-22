package Example01;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private double price;

    public Employee(String firstName, String lastName, double price) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.price = price;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getPrice(), getPrice()) == 0 && Objects.equals(getFirstName(),
                employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPrice());
    }

    @Override
    public String toString() {
        return "Employee : " + firstName + " " +lastName + " :" + price +"zł.\n";
    }
}
