package Ex03;

import java.util.Optional;

class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        db.findById(3).ifPresent(PersonTest::printLastName);
        Optional<Person> optPerson = db.findById(55);

        optPerson.ifPresent(PersonTest::printLastName);
        optPerson.ifPresentOrElse(
                PersonTest::printLastName,
                () -> System.out.println("Brak obiektu o wskazanym id")
        );
    }

    private static void printLastName(Person person) {
        System.out.println(person.getLastName());
    }
}
    