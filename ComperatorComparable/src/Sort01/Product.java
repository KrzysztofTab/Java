package Sort01;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String producer;
    private String name;
    private double price;

    public Product(String producer, String name, double price) {
        this.producer = producer;
        this.name = name;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product { " + "producent= '" + producer + '\'' + ", nazwa= '" + name + '\'' +
                ", cena= " + price + "zł }";
    }

    //    'compareTo' ta metoda może tylko sortować po jednym argumenice
    @Override
    public int compareTo(Product p) {
        if (price > p.price)
            return 1;
        else if (price < p.price)
            return -1;
        int producerCompare = producer.compareTo(p.producer);
        if (producerCompare != 0)
            return producerCompare;
        return name.compareTo(p.name);
    }

    static class ProductNameComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
//            sortujemy wg nzayw produktu
            return p1.getName().compareTo(p2.getName());
//            sortujemy wg ceny produktu
//          return  p1.compareTo(p2);
        }
    }
}

