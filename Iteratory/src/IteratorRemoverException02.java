import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoverException02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

        Iterator<String> namesIterator = names.iterator();
        System.out.println(">>> Pętla 2");
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            if (name.equals("Kasia")) {
                // błąd - iterujemy po kolekcji za pomocą iteratora, a usuwamy
                // obiekt metodą remove() bezpośrednio z kolekcji
//                names.remove(name);  // bład
                namesIterator.remove();
            }
        }
    }
}
