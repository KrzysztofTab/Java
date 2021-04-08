package Ex01;

public class Cart {
    private final int MAX_PRODUCT = 10;
    Product[] products = new Product[MAX_PRODUCT];
    private int productCount;                           // ledzimy ile produktów już mamy w tablicy

    void addProducts(Product product) {
        if (productCount < MAX_PRODUCT) {
            products[productCount] = product;
            productCount++;
        }
    }

    double totalCost() {
        return sumPrices(0);
//        double totalPrice = 0;
//        for (int i = 0; i < productsCount; i++) {
//            totalPrice += products[i].getPrice();
//        }
//        return totalPrice;
    }

    private double sumPrices(int counter) {
        if (productCount == 0)
            return 0;
        else if (counter < (productCount - 1))
            return products[counter].getPrice() + sumPrices(++counter);
        else
            return products[counter].getPrice();
    }

    public void printProducts() {
        for (Product product : products) {
            if (product != null)
                System.out.println(product);
        }
    }

}
