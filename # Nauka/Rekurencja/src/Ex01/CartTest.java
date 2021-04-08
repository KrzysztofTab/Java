package Ex01;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProducts(new Product("mleko", 2.55));
        cart.addProducts(new Product("małso", 2.99));
        cart.addProducts(new Product("chleb", 4.5));
        cart.addProducts(new Product("ser złóty", 9.95));
        cart.addProducts(new Product("kiełbasa", 7.935));
        cart.printProducts();
        
    }
}
