package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

        System.out.println("\n>>> People");
//        consumeList(people, p -> System.out.println(p));
        consumeList(people, System.out::println);  // to samo co wiersz wyżej
        System.out.println("\n>>> People - 1 rok");
        consumeList(people, p -> p.setAge(p.getAge() - 1));
//        consumeList(people, p -> System.out.println(p));
        consumeList(people, System.out::println); // to samo co wiersz wyżej
        consumeList(people, p -> System.out.println(p.getLastName())); //wyświetlenia samych nazwisk
    }

//      Consumer<T> - posiada metodę accept(T t) - przyjmuje argument typu T,
//      ma za zadanie wykonać pewną operację i nie zwraca wyniku,
//      void accept(T t);
    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
//    Metoda jest sparametryzowana typem T. Jeżeli do metody przekażemy listę przechowującą obiekty typu Person,
//    to pod T zostanie podstawione Person. Analogicznie dla listy typu String, pod T zostanie podstawiony String.
//    Jako drugi argument metody można przekazać np. obiekt klasy anonimowej implementującej interfejs Consumer,
//    ale dużo bardziej praktyczne będzie przekazać tam pewne wyrażenie lambda (jest to możliwe,
//    bo Consumer jest interfejsem funkcyjnym). Zapis consumer.accept(t) oznacza więc tak naprawdę
//    "wykonaj wyrażenie lambda przypisane do zmiennej consumer z argumentem t (czyli kolejnym obiektem z listy).


