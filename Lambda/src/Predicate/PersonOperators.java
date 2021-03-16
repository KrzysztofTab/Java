package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonOperators {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));

        System.out.println("\n>>> Adults");
        List<Person> adults = filterByPredicate(people, person -> person.getAge() >= 18);
//        consumeList(adults, person -> System.out.println(person));
        consumeList(adults, System.out::println);  // to samo co wiersz wyżej
        System.out.println("\n>>> Jan People");
        List<Person> janPeople = filterByPredicate(people, person -> "Jan".equals(person.getFirstName()));
//        consumeList(janPeople,person -> System.out.println(person));
        consumeList(janPeople, System.out::println); // to samo co wiersz wyżej

    }

    //  Predicate<T> - posiada metodę test(T t) - przyjmuje argument typu T i zwraca wartość typu boolean,
    //  boolean test(T t);
    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
//            dodaj obiekt t do listy result, jeżeli predykat dla argumentu t jest spełniony
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
