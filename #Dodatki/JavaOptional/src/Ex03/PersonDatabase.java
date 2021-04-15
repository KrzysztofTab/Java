package Ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDatabase {
    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        if (person == null)
            // eśli ktoś spróbuje dodać do listy pustą referencję, to rzucamy wyjątek NullPointerException
            throw new NullPointerException("Cannot add null reference");
        // Metoda ifPresent() wykonuje przekazane jej jako argument wyrażenie, ale tylko wtedy gdy obiekt istnieje.
        if (findById(person.getId()).isPresent())
            // Jeśli ktoś będzie próbował dodać obiekt o takim samym id co jakiś wcześniej dodany obiekt,
            // to rzucamy wyjątek IllegalArgumentException.
            throw new IllegalArgumentException("Object with such id already exists");
        people.add(person);
    }

    public Optional<Person> findById(int id) {
        for (Person person : people) {
            if (person.getId() == id)
                return Optional.of(person);
        }
        return Optional.empty();
    }

    public String findLastNameById(int id) {
        return findById(id) // Optional<Person>
                .map(Person::getLastName) // Optional<String>
                .orElse("Anonim");
        // Korzystając z metody orElse() lub orElseGet() możemy zwrócić obiekt, który przechowuje Optional,
        // lub dostarczyć wartość domyślną, jeśli Optional jest pusty.
    }


//    String findLastNameById(int id) {
//        for (Person person : people) {
//            if (person.getId() == id)
//                return person.getLastName();
//        }
//        return "Anonim";
//    }
}

/*
Optional jest typem generycznym, a obiekty tego typu możemy utworzyć przy pomocy jednej z trzech statycznych metod:
of() - tworzy Optional na podstawie istniejącego obiektu, nie można do niej przekazać wartości null,
ofNullable() - tworzy Optional na podstawie istniejącego obiektu, lub pusty Optional jeśli przekażemy wartość null,
empty() - tworzy pusty Optional.
 */