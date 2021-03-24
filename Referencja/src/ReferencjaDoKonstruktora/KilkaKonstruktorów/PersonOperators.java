package ReferencjaDoKonstruktora.KilkaKonstruktorów;

import java.util.function.Supplier;

public class PersonOperators {
    private static final String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static final String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private static final int[] ages = {22, 33, 44, 55};

    public static void main(String[] args) {

        //    jeżeli referencja do konstruktora to zawsze zapis NazwaKlasy::new
        //  konstruktora bezparametrowego
        Supplier<Person> personSupplier = Person::new;
        //  konstruktora z trzema parametrami
        PersonSupplier randomPersonSupplier = Person::new;
        System.out.println(personSupplier.get());
        System.out.println(randomPersonSupplier.get(firstNames, lastNames, ages));
    }
}