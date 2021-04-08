package MetodyPosrednie;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        Course[] cheapCourses = {
                new Course(1L, "Java", 49, "Programowanie"),
                new Course(2L, "Sztuka pisania", 79, "Rozwój osobisty"),
        };
        Course[] expensiveCourses = {
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Python od podstaw", 169, "Programowanie")
        };
        // Stream<List<Course>> to do metody flatMap() należałoby przekazać referencję do metody List::stream
        Stream.of(cheapCourses, expensiveCourses)
                // Metoda flatMap() jako argument przyjmuje funkcję mapującą kolekcję na strumień obiektów
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}
