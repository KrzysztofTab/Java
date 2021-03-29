import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberStreams02 {
    private static final int DIVIDER = 10;

    public static void main(String[] args) {
        List<Integer> squareNumbers = IntStream.range(0, 100)  // metoda range(0, 100) generuje dla nas liczby od 0 do 99
                .map(NumberStreams02::square)  // korzystamy z referencji do metody
                .boxed()                       // Jeżeli chcemy przekształcić strumień IntStream w typ Stream<Integer>
                .collect(Collectors.toList()); // należy wywołać metodę boxed() a wtedy przerobić ją na listę

        Set<Integer>biggerThan5 = squareNumbers.stream()
                .filter(NumberStreams02::isDividedBy)
                .map(NumberStreams02::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + " ; "));

    }

    private static int divide(int x) {
        return x / DIVIDER;
    }

    private static boolean isDividedBy(int x) {
        return x % DIVIDER == 0;
    }

    private static int square(int x) {
        return x * x;
    }
}
