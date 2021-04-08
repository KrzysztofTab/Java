import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingNumbers {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        addList(numbers);
        printList(numbers);
    }

    private static void addList(List<Integer> numbers) {
        boolean correct = true;
        while (correct) {
            System.out.println("Podaj liczbę nieujemną, podzielną przez 5");
            int numb = sc.nextInt();
            if (numb > 0 && numb % 5 == 0) {
                numbers.add(numb);
            } else {
                correct = false;
            }
        }
    }

    private static void printList(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double avg = ((double) sum) / numbers.size();
        System.out.println("Ile poprawnych liczb: " + numbers.size());
        System.out.println("Ich suma wynosi: " + sum);
        System.out.printf("Natomiast średnia to: %.2f \n", avg);
    }
}
