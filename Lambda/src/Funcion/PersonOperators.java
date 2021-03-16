package Funcion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


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

        //  Predicate<T> - posiada metodę test(T t) - przyjmuje argument typu T i zwraca wartość typu boolean,
        //  R apply(T t);
        System.out.println("\n>>> FirstNames");
        List<String>firstName = convertList(people, Person::getFirstName);
//        List<Integer> ages = convertList(people, Person::getAge); //  wiek wszystkich osób
        consumeList(firstName, System.out::println);
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);    //   String result = person.getFirstName()
            resultList.add(result);
        }
        return resultList;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
