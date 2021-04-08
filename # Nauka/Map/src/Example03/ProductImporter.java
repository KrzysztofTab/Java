package Example03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductImporter extends Product {
    private final String category;

    public ProductImporter(String category, String name, double price) {
        super(name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    static Map<String, TreeSet<Product>> readFile(String fileName) throws FileNotFoundException {
        Map<String, TreeSet<Product>> productsMap = new HashMap<>();
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            fileReader.nextLine();
            while (fileReader.hasNextLine()) {
                String[] data = fileReader.nextLine().split(";");
                String category = data[0];
                Product product = new Product(data[1], Double.parseDouble(data[2]));
                insertProductIntoMap(productsMap, category, product);
            }
        }
        return productsMap;
    }

    private static void insertProductIntoMap(Map<String, TreeSet<Product>> productsMap, String category, Product product) {
        if (productsMap.containsKey(category))
            productsMap.get(category).add(product);
        else {
            TreeSet<Product> categorySet = new TreeSet<>();
            categorySet.add(product);
            productsMap.put(category, categorySet);
        }
    }

    @Override
    public String toString() {
        return category + ";" + getName() + ";" + getPrice();
    }
}
