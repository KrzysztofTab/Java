import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NotebookTreeMap {
    public static void main(String[] args) {
//        typ klucza obiekt Notebook a wartoscią int - ilosć szt w naszym sklepie
        Map<Notebook, Integer> notebooks = new HashMap<>();
//        Do mapy wartości wstawiamy korzystając z metody put()
        notebooks.put(new Notebook("Lenovo", "B590"), 12);
        notebooks.put(new Notebook("Dell", "Inspiron0211A"), 5);
        notebooks.put(new Notebook("HP", "G2A33EA"), 8);
        notebooks.put(new Notebook("Dell", "XPS0091V"), 6);

        Set<Map.Entry<Notebook, Integer>> entries = notebooks.entrySet();
        for (Map.Entry<Notebook, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }
}
//    Również analogicznie jak w przypadku zbioru typu TreeSet, mapa typu TreeMap różni się od standardowego HashMap tym,
//    że obiekty są w niej sortowane zgodnie z naturalnym porządkiem kluczy lub zgodnie z komparatorem przekazanym w konstruktorze.