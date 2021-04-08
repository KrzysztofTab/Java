package MetodyTerminalne;

import java.util.*;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect_00 {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        System.out.println();
        courses
                //.collect(Collectors.toList())     // pozwolą nam zebrać elementy strumienia do listy,
                .collect(Collectors.toSet())     // pozwolą nam zebrać elementy strumienia do zbioru,
//        Jeśli zależy ci na konkretnym typie kolekcji, a nie "jakiejś liście", albo "jakimś zbiorze",
//        to możesz skorzystać z metody Collectors.toCollection(), do której możesz przekazać referencję do
//        konstruktora odpowiedniej kolekcji.
                //.collect(Collectors.toCollection(TreeSet::new))  // utalić sortowanie dla TreeSet
                .forEach(System.out::println);
    }
}
