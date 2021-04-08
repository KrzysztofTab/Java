package Sort01;

import java.util.Arrays;

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", 3.90);
        products[1] = new Product("Amino", "Zupa ogórkowa", 3.90);
        products[2] = new Product("WINIARY", "Zupa pomidorowa", 4.20);
        products[3] = new Product("WINIARY", "Zupa pieczarkowa", 4.10);
        products[4] = new Product("WINIARY", "Rosół", 3.60);
        products[5] = new Product("Knorr", "Placki ziemniaczane", 6.40);
        products[6] = new Product("Knorr", "Racuchy", 7.20);

        System.out.println("\nNieposortowana: ");
        for (Product p : products)
        System.out.println(p);

        Product.ProductNameComparator productNameComparator = new Product.ProductNameComparator();
        Arrays.sort(products, productNameComparator);
        System.out.println("\nPosortowana: ");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
