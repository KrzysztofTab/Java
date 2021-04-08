package MetodyTerminalne;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        System.out.println();
//        //    courses.toArray(n -> new Object[n]);
        Course[] coursesArray = courses.toArray(Course[]::new);
        System.out.println(Arrays.toString(coursesArray));
    }
}