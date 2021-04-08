import java.util.ArrayList;
import java.util.List;

public class IteratorRemoverException03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

        System.out.println(">>> Pętla 3");
        for (String name : names) {
            System.out.println(name);
            if (name.equals("Maniek")) {
                // błąd - iterujemy po kolekcji za pomocą niejawnego iteratora
                // petli for-each, a usuwamy
                // obiekt metodą remove() bezpośrednio z kolekcji
                names.remove(name);
            }
        }
    }
}
