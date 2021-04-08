import java.util.Scanner;
public class DiscountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadż imie: ");
        String firstName1 = scanner.nextLine();
        System.out.println("Wprowadż nzawisko: ");
        String lastName1 = scanner.nextLine();
        Client client1 = new Client(firstName1,lastName1,true);
        double price1 = 950;
//        Client client2 = new Client("Joanna","Tara",false);
//        double price2 = 1350;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1,price1);
//        double priceDiscount2 = discountService.calculateDiscountPrice(client2,price2);

        PrintService printService = new PrintService();
        printService.primeSummary(client1,price1,priceDiscount1);
//        printService.primeSummary(client2,price2,priceDiscount2);
    }
}
