package ReferencjaDoKonstruktora.ReferencjaDoKonstruktoraBezparametrowego;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PersonOperators {
    public static void main(String[] args) {
//        Supplier<Person> supplier = Person::new;
        List<Person> people = generateRandomList(5, Person::new);
        consumeList(people, System.out::println);
    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
