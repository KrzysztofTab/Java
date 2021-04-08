package MetodyPosrednie;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Java od podstaw", 159, "Programowanie"),
                new Course(4L, "Tajniki Google", 299, "Marketing")
        );
        //  courses .map(course -> course.getName())
        courses.map(Course::getName)
                .filter(name -> name.toLowerCase().contains("java"))  // contains - sprawdza czy zawiera "java"
                .collect(Collectors.toList())                           // ładuje steumień do listy
                .forEach(System.out::println);
    }
}
