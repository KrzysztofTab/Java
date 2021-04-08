package Example03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductReader {
    private final Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public int getInt() {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }

    public String getString() {
        return sc.nextLine();
    }

    public String readCategoryFromUser() {
        System.out.println("\nPodaj nazwę kategorii :");
        return sc.nextLine();
    }

//    public Product createProdukt(){
//       ProductImporter importer = new ProductImporter( category ,String name);
//        System.out.println("Kategoria: ");
//        String. category = sc.nextLine();
//        System.out.println("Produkt: ");
//        String name = sc.nextLine();
//        System.out.println("Cena: ");
//        String price = sc.nextLine();
//
//    }
}
