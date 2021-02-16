package HashSet;

import java.util.Objects;

//Klasę Person z metodami equals() i hashCode()

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    To między innymi tutaj wymagane jest spełnienie kontraktu pomiędzy metodami equals() i hashCode(),
//    który dla przypomnienia mówi o tym, że jeśli metoda equals() dla dwóch obiektów zwraca true,
//    to metoda hashCode() wywołana na tych obiektach powinna zwrócić identyczną wartość.
    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (!(o instanceof Person)) {
            result = false;
        } else {
            Person person = (Person) o;
            result = firstName.equals(person.firstName) && lastName.equals(person.lastName);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
