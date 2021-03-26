package MetodyTerminalne;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMinMax {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        System.out.println();
//        Wynikiem metody nie jest bezpośrednio najmniejszy, czy największy obiekt, tylko Optional.
//        W przypadku pustego strumienia metody zwracają pustego Optionala
//        courses.min((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
//        courses.min(Comparator.comparingDouble(c -> c.getPrice());
        courses.max(Comparator.comparingDouble(Course::getPrice))  // min można zmienić na max
                .ifPresent(System.out::println);                    //ifPresent - jeżeli nie jest pusty to wyświetlamy
    }
}
