import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStreams01 {
    private static final int DIVIDER = 10;

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);

        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = numStream.map(NumberStreams01::square)
                .limit(100)
                .collect(Collectors.toList());

        Set<Integer> biggerThan5 = squareNumbers.stream()
                .filter(NumberStreams01::isDividedBy)
                .map(NumberStreams01::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + "; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + "; "));
    }

    // Korzystanie z referencji do metod pozwoli ci pisać kod, który możesz wykorzystywać wielokrotnie.

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
