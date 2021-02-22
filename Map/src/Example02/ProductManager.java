package Example02;

import java.io.FileNotFoundException;
import java.util.*;

public class ProductManager {
    private static final String FILE_NAME = "employees.info";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;
    private static Scanner sc = new Scanner(System.in);
    private static final String fileName = "thingsRTV.csv";

    public static void main(String[] args) {
        System.out.println("Wprowadzanie danych do pliku - " + READ_FROM_USER);
        System.out.println("Wczytaj i wyświetl dane z pliku - " + READ_FROM_FILE);

        int option = sc.nextInt();
        sc.nextLine();
        if (option == READ_FROM_USER) {
            ProductImporter.writeFile(fileName);
        } else if (option == READ_FROM_FILE) {
            writeFile();
        }
        sc.close();
    }

    private static void writeFile() {
        try {
            Map<String, TreeSet<Product>> produktsMap = ProductImporter.readFile(fileName);
            printCategory(produktsMap);
            String category = readCategoryFromUser();
            printCategoryStats(produktsMap, category);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku z danymi!");
        }
    }

    private static void printCategory(Map<String, TreeSet<Product>> produktsMap) {
        Set<String> keys = produktsMap.keySet();
        System.out.print("\nKategorie: ");
        for (String key : keys) {
            System.out.print(key + "; ");
        }
    }

    private static String readCategoryFromUser() {
        System.out.println("\nPodaj nazwę kategorii: ");
        return sc.nextLine();
    }

    private static void printCategoryStats(Map<String, TreeSet<Product>> produktsMap, String category) {
        TreeSet<Product> products = produktsMap.get(category);
        if (products == null)
            System.err.println("Brak produktów w danej kategori");
        else {
            printAll(products);
            printAvgPrice(products);
            printCheapestAndExpensiveProduct(products);
        }
    }

    private static void printAll(TreeSet<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void printAvgPrice(TreeSet<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice / products.size();
        System.out.printf("\nŚrednia cena produktów: %.2f\n", avgPrice);
    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt: " + products.first());
        System.out.println("Najdroższy produkt: " + products.last());
    }
}
