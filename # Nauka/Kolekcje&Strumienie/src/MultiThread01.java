import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiThread01 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints = ints.stream()
                .parallel()  // przyspiesza przetwarzanie i nie gwaratnuje kolejności
                .map(MultiThread01::incrementValute)
                .collect(Collectors.toList());
    }

    private static int incrementValute(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + x);
        return x + 1;
    }
}
