package ProjektyWlasne.P07;

import java.util.Objects;

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final int pesel;

    public Person(int pesel, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(),
                person.getLastName()) && Objects.equals(getPesel(), person.getPesel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPesel());
    }

    @Override
    public String toString() {
        return "Pesel:" + pesel + "; " + firstName + " " + lastName;
    }

    public abstract String toCSV();
}
