import java.util.Scanner;

public class PricesWithTax {
    public static void main(String[] args) {
        double vat = 0.23;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cenę; ");
        double prices =sc.nextDouble();
        double vatRate = prices*vat;
        System.out.println("cena brutto: "+(prices+vatRate));
        System.out.println("w tym cena netto: "+prices + " +VAT: "+vatRate);
    }
}
