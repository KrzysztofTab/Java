import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NotebookStore {
    public static void main(String[] args) {
//        typ klucza String wartosć jest obiektem
        Map<String, Notebook> notebooks = new HashMap<>();
//        Do mapy wartości wstawiamy korzystając z metody put()
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));

//        wyświetlamy zbiór kluczy0
        System.out.println();
        System.out.println("wyświetlamy zbiór kluczy: ");
//        Metoda keySet() zwraca zbiór kluczy.
        Set<String> keys = notebooks.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

//        wyswietla wartosci
        System.out.println();
        System.out.println("wyświetla wartości");
        Collection<Notebook> valius = notebooks.values();
        System.out.println(valius);

//        wyświetla kulucze i wartości ( obiekt przypisany do danego klucza )
        System.out.println();
        Set<Map.Entry<String, Notebook>> entries = notebooks.entrySet(); // to samo co poniżej tylko krócej zapisane
        for (Map.Entry<String,Notebook> entry : entries){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
//        System.out.println("wyświetla kulucze i wartości");
//        Set<String> keyse = notebooks.keySet();
//        for (String key : keyse) {
//            System.out.println(key + " : " + notebooks.get(key));
//        }

//        wyświetlamy informację o laptopach na podstawie kluczy
        System.out.println();
        String key = "G2A33EA";
        System.out.println("wyświetlamy informację o laptopach na podstawie kluczy\n" +
                "Znaleziono laptop o kodzie G2A33EA: ");
//        Metoda get() wyszukuje wartość przypisaną do danego klucza
//        Jeżeli do metody get() przekażemy klucz, do którego nie jest przypisana żadna wartość,
//        to w wyniku otrzymamy wartość null.
        Notebook foundNotebook = notebooks.get(key);
        System.out.println(foundNotebook);

//        wyswietlanie zawartości pod błednie wpisanym kluczem - null
        System.out.println();
        System.out.println("wyswietlanie zawartości pod błednie wpisanym kluczem");
        String ke = "G2A33Eb";
        Notebook newNotebook = notebooks.get(ke);
        System.out.println(newNotebook);

//        usuwamy obiekt na podstawie klucza
        System.out.println();
        notebooks.remove("XPS0091V");
        System.out.println("usuniecie obiektu na podstawie klucza\nAktualna ilość produktów w sklepie: " + notebooks.size());
    }
}
/*
Najważniejsze metody w interfejsie Map to:
put(K key, V value) - wstawia obiekt value typu V do zbioru i pozwala go odnaleźć pod kluczem key typu K,
get(K key) - zwraca obiekt o kluczu key typu K,
keySet() - zwraca zbiór wszystkich kluczy w mapie,
values() - zwraca kolekcję wszystkich wartości (obiektów) przechowywanych w mapie,
remove(Object key) - usuwa element mapy, dla którego klucza podanego jako parametr,
entrySet() - zwraca zbiór obiektów w postaci klucz-wartość, reprezentowanych przez klasę Map.Entry<K,V>,
clear() - czyści mapę ze wszystkiem przechowywanych danych.
*/