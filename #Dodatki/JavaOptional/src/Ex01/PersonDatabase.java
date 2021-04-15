package Ex01;

import java.util.ArrayList;
import java.util.List;

public class PersonDatabase {
    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        if (person == null)
            // eśli ktoś spróbuje dodać do listy pustą referencję, to rzucamy wyjątek NullPointerException
            throw new NullPointerException("Cannot add null reference");
        if (findById(person.getId()) != null)
            // Jeśli ktoś będzie próbował dodać obiekt o takim samym id co jakiś wcześniej dodany obiekt,
            // to rzucamy wyjątek IllegalArgumentException.
            throw new IllegalArgumentException("Object with such id already exists");
        people.add(person);
    }
            // Do metody findById() przekazujemy id osoby, którą chcemy pobrać z bazy. W pętli wyszukujemy taką osobę
            // i jeśli ją znajdziemy to zwracamy jako wynik. Jeśli jednak w bazie nie istnieje osoba o wskazanym id,
            // to zwracamy wartość null.
    public Person findById(int id) {
        for (Person person : people) {
            if (person.getId() == id)
                return person;
        }
        return null;
    }
}
