package Example02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductImporter {

    //      metoda man nam zwócić Mapę ( kluczem ma być kategoria "String" do kategori bedą przypisane zbiory produktów
//    "TreeSet<Prduct>" - odczytywanie danych do mapy
    static Map<String, TreeSet<Product>> readFile(String fileName) throws FileNotFoundException {
//        tworzymy mapę która bedzie naszym wynikiem - mapa stworzona przez nas
        Map<String, TreeSet<Product>> productsMap = new HashMap<>();
//        teorzymy skaner do wczytania informacji z pliku
        try (Scanner fileReader = new Scanner(new File(fileName))) {
//            ignorujemy nagłówek w pliku ktury odczytujemy
            fileReader.nextLine();
            while (fileReader.hasNextLine()) {
//                wczytany wiersz do plku rozdzielamy ";" i wyniku dostajemy tablicę w której bedą 3 napisy
                String[] data = fileReader.nextLine().split(";");
//                pierwszym napisem jest kategoria
                String category = data[0];
//                kolejne tapisy tworzą "Produkt - nazwę i cenę"
//                cenę któta jeat Stringiem zamieniamy na Double parseDouble
                Product product = new Product(data[1], Double.parseDouble(data[2]));
//                mamy gotowy produkt który wstawiamy do mapy
                insertProductIntoMap(productsMap, category, product);
            }
        }
        return productsMap;
    }

    private static void insertProductIntoMap(Map<String, TreeSet<Product>> productsMap,
                                             String category, Product product) {
//        torzymy "if" jeżeli kategoria już istnieje dopisujemy produkt do danej kategori "add.(product)"
        if (productsMap.containsKey(category))
//            "get(category)" zwraca nam zbór przypisany do kategorii
            productsMap.get(category).add(product);
        else {
//            Jeżeli nie mamy kategori i zbioru to tworzymy nowy zbiór z produktem
            TreeSet<Product> categorySet = new TreeSet<>();
            categorySet.add(product);
            productsMap.put(category, categorySet);
        }
    }

    static void writeFile(String fileName) {
        try (
                var fis = new FileOutputStream(fileName, true);
                var oos = new ObjectOutputStream(fis);
        ) {
            oos.writeObject(createProduct());
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }

    public static Map<String, TreeSet<Product>> createProduct()  {
        Map<String, TreeSet<Product>> productsMap = new HashMap<>();
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Wprowadź kategorię:");
            String category = sc.nextLine();
            System.out.println("Wprowadź nazę:");
            String name = sc.nextLine();
            System.out.println("Wprowadź cenę:");
            double price = sc.nextDouble();
            sc.nextLine();
            TreeSet<Product> categorySet = new TreeSet<>();
            categorySet.add(new Product(name,price));
            productsMap.put(category, categorySet);
        }
        return productsMap;
    }

}
