package ReferencjaDoKonstruktora.ReferencjaDoKonstruktoraZparametrami;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PersonOperators {
    private static final String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static final String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private static final int[] ages = {22, 33, 44, 55};

    public static void main(String[] args) {
        List<Person> people = generateRandomList(5, Person::new);
        consumeList(people, System.out::println);
    }

    //   Metoda generateRandomList() nie jest już generyczna
    private static List<Person> generateRandomList(int elements, PersonSupplier supplier) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get(firstNames, lastNames, ages));
        }
        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
