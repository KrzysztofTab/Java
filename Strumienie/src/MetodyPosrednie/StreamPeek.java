package MetodyPosrednie;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeek {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie")
        );
        courses.filter(c -> c.getName().toLowerCase().contains("java")) // zamienia litery na małe
//        Metoda peek() pozwoli wyświetlić wszystkie kursy, które w nazwie mają słowo java.
//        Metodę peek() możesz wywołać na dowolnym etapie transformacji strumienia,
//        czyli np. równie dobrze mogłaby ona być wywołana po metodzie map().
                .peek(course -> System.out.println("filtered stream: " + course))
//                .map(course -> course.getName())
                .map(Course::getName)                   // wyciąga ze steumienia wszystkie poszikiwane wyrazenia
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
