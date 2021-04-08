package MetodyPosrednie;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie")
        );
//        courses.sorted((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()))  // to samo co poniżej
//        courses.sorted(Comparator.comparingDouble(Course::getPrice))              // sortuje do A do Z
        courses.sorted((c1, c2) -> -Double.compare(c1.getPrice(), c2.getPrice()))   // sortuje Z do A (wstawiamy )
                .forEach(System.out::println);
    }
}
