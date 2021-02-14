package Sort02;

import Sort01.Product;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers {
    public static void main(String[] args) {
        Integer[] integers = {2, 20, 63, 78, 69, 51, 32, 84, 5, 10,
                11, 98, 101, 13, 45, 96, 71, 77, 54, 32, 20};

        System.out.println("\nNieposortowana: ");
//        Do wygodnego wyświetlania tablicy skorzystaliśmy ze statycznej metody Arrays.toString().
        System.out.print(Arrays.toString(integers)+"\n");

        Arrays.sort(integers);
        System.out.println("\nPosortowana rosnąco: ");
        System.out.println(Arrays.toString(integers));

//        w sortowaniu malejącym wykorzystujemy komparator utworzony przez klasę anonimową
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("\nPosortowana malejąco: ");
        System.out.println(Arrays.toString(integers));
    }
}
