package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class InterfejsSupplier {
    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};

        Random random = new Random();

//        interfej Supplier - T get();
//        torzymy nową ArrayList z wylosowanych danych i uzupełniamy metodą get()
        Supplier<Person> supplier = () -> {
//            losujemy imona, nazwiska, wiek osób z powyższych tablic
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
//            tworzymy nowe dane na podstawie losowania
            return new Person(firstName, lastName, age);
        };

//        Tworzymy nową ArrayList którą uzupełniamy wylosowanymi danymi
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            people.add(supplier.get());
        }
//        wyświetlamy osoby za ArrayList
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

//  Supplier<T> - posiada metodę get() - tworzy nowy obiekt typu T.