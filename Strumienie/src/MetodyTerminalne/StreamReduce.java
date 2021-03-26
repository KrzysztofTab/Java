package MetodyTerminalne;

import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        System.out.println();
//        Double sumPrice = courses.map(Course::getPrice).reduce(0.0, (result, next) -> result + next);
        Double sumPrice = courses.map(Course::getPrice).reduce(0.0, Double::sum);
        System.out.println("Wszystkie kursy kosztują: " + sumPrice);


        Stream<String> name = Stream.of("Ania", "Basia", "Kasia");
        System.out.println();
        String allName = name.reduce("", (result, next) -> result + next + " ");
        System.out.println(allName);
    }
}
