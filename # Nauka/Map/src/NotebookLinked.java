import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NotebookLinked {
    public static void main(String[] args) {
//        typ klucza String wartosć jest obiektem
                Map<String, Notebook> notebooks = new LinkedHashMap<>();
//        Do mapy wartości wstawiamy korzystając z metody put()
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));

        System.out.println();
        System.out.println("zachowuje kolejność dodawanych elementów");
        Set<Map.Entry<String, Notebook>> entries = notebooks.entrySet(); // to samo co poniżej tylko krócej zapisane
        for (Map.Entry<String, Notebook> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

//    Podobnie jak w przypadku zbioru typu LinkedHashSet, klasa LinkedHashMap różni się od standardowej HashMap tym,
//    że zachowuje kolejność dodawanych elementów, co może być przydatne, gdy będziemy chcieli po nich iterować.