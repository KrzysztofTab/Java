package MetodyPosrednie;

import java.util.stream.Stream;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

public class StreamFilter {
    public static void main(String[] args) {
        Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        )
                .filter(course -> course.getPrice() > 200)
                .forEach(System.out::println);
    }
}
