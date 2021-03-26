package MetodyPosrednie;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

import java.util.stream.Stream;

public class StreamDistinct {
    public static void main(String[] args) {
        Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        )
                .distinct()   // Metoda służy do odfiltrowania ze strumienia duplikatów
                .forEach(System.out::println);
    }
}
//  "distinct" - Zwraca w wyniku strumień wyłącznie z unikalnymi obiektami. Do porównywania obiektów wykorzystywana
//  jest metoda equals(), także powinna być ona poprawnie zdefiniowana w typie obiektów,
//  które są przechowywane w strumieniach.