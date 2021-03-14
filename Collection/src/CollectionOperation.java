import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {
    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, testowa";

        // dzielenie listy na słowa
        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println("Lista oryginalna: ");
        printCollection(words);

        // wymieszanie słów
        Collections.shuffle(words);
        System.out.println("\nLista shuffle (wymieszanie słów):");
        printCollection(words);

        // sortowanie
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nLista sort");
        printCollection(words);

        // wyszukiwanie binarne
        int position = Collections.binarySearch(words, "drukarki");
        System.out.println("\nSłowo \"drukarki\" jest w liście na " + position + " miejscu");

        // ilość wystąpień
        int freq = Collections.frequency(words, "testowa");
        System.out.println("\nSłowo \"testowa\" występuje na liście " + freq + " razy");

        // najmniejszy element w liście
        System.out.println("\nNajmniejszy element w liście to: " + Collections.min(words));

        // najmniejszy element w liście
        System.out.println("\nNajmniejszy element w liście to: " + Collections.min(words,String.CASE_INSENSITIVE_ORDER));
    }

    private static void printCollection(Collection<String> collection) {
        for (String s : collection) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }

}
