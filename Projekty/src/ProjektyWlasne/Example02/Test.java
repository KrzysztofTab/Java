package ProjektyWlasne.Example02;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Notebook> notebooks = new HashMap<>();
        HashMapTest test = new HashMapTest();
        test.addNotebook(notebooks);
        test.printNotebook(notebooks);
    }
}
