package Example03;

import java.util.*;

public class ProductManager {

    public static void printAllCategory(Map<String, TreeSet<Product>> productsMap) {
        Set<String> keys = productsMap.keySet();
        System.out.println(" ");
        for (String key : keys) {
            System.out.print(key + ", ");
        }
    }

    public static void printCategoryStats(Map<String, TreeSet<Product>> productsMap, String category) {
        TreeSet<Product> products = productsMap.get(category);
        if (products == null)
            System.out.println("Brak produktów w danej kategorii");
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
        System.out.printf("\nŚrednia cena produktów %.2fzł\n", avgPrice);
    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt: " + products.first());
        System.out.println("Najdroższy produkt: " + products.last());
    }
}
