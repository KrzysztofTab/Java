package Ex01;

import java.util.Arrays;
import java.util.List;

public class SimpleStringComparator {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("Teodor", "Jancia", "Piotr", "Zofia", "Andrzej");
        names.sort(String::compareToIgnoreCase);
        System.out.println();
        names.forEach(System.out::println);
    }
}
