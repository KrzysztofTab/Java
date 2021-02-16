import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Summation {
    public static final String EXIT = "exit";
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        System.out.println(numbers); // podglad uzupełnianej tablicy
        printData(numbers);
    }

    //     metoda rekurencyjna do wczytywania danych
    static void fillList(List<Double> list) {
        System.out.println("podaj liczbę (koniec \"exit\":");
        String input = sc.nextLine();
//        "equalsIgnoreCase" pozawal na wipsanie mała jak i dużą  literą
        if (input.equalsIgnoreCase(Summation.EXIT))
            return;
        try {
            Double numb = Double.valueOf(input);
            list.add(numb);
        } catch (NumberFormatException e) {
            System.err.println("Liczba w niepoprawnym formacie");
        }
        fillList(list);
    }

    //     metoda do wyświetlania danych
    private static void printData(List<Double> list) {
//        jezeli mamy pustą listę to nic nie wyśietlamy
        if (!list.isEmpty()) {
//            tworzymy napis do wyswietlenia
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (double d : list) {
//                doklejannie liczby do napisu 5, 10, 15,
                sb.append(d);
//                doklejanie zanku "+"  5 + 10 + 15
                sb.append(" + ");
//                sumowanie podanych liczb
                sum += d;
            }
//            "replace" zamiana zanku - podajemy od którego miejsca do jakiego miejsca chcemy coś zamienić i na co "="
            sb.replace(sb.length() - 1, sb.length(), " =");
//            wyświetlanie sumy
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }
}
