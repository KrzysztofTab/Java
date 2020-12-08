public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null,"Kowalewski",true);
        double price1 = 950;
        Client client2 = new Client("Joanna","Tara",false);
        double price2 = 1350;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1,price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2,price2);

        PrintService printService = new PrintService();
        printService.primeSummaty(client1,price1,priceDiscount1);
        printService.primeSummaty(client2,price2,priceDiscount2);
    }
}
