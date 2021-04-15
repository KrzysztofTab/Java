package Ex02;

import java.util.Optional;

public class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        Optional<Person> personOpt1 = db.findById(2);   // Karol Zawadzki
        Optional<Person> personOpt2 = db.findById(33);   // null

            // Metoda ifPresent() wykonuje przekazane jej jako argument wyrażenie, ale tylko wtedy gdy obiekt istnieje.
        personOpt1.ifPresent(person -> System.out.println(person.getLastName()));
        personOpt2.ifPresent(person -> System.out.println(person.getLastName()));

            // Metoda ifPresentOrElse() to z kolei odpowiednik konstrukcji if else i pozwala wykonać pewną czynność,
            // zdefiniowaną jako drugą funkcję, w przypadku gdy Optional będzie pusty.
                        // if(personOpt2.isPresent()) {
                        //    System.out.println(personOpt2.get().getLastName());
                        //} else {
                         //    System.out.println("Brak obiektu o wskazanym id"); }
        personOpt2.ifPresentOrElse(
                p -> System.out.println(p.getLastName()),
                () -> System.out.println("Brak obiektu o wskazanym id")
        );
    }
}
