package Ex01;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

public class FirstName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Teodor", "Jancia", "Piotr", "Zofia", "Andrzej");
        Comparator<String> comp = String::compareToIgnoreCase; // s1.compareToIgnoreCase(s2)
        names.sort(comp);

//        Comparator<String> comp = (String s1, String s2) -> s1.compareToIgnoreCase(s2);
//        Collections.sort(names, comp);

        for ( String name: names      ) {
            System.out.println(name);
        }
    }
}