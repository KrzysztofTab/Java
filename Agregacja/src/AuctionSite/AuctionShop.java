package AuctionSite;

public class AuctionShop {
    public static void main(String[] args) {
        User user01 = new User();
        user01.firstName = "Wojtek";
        user01.lastName = "Kowalski";
        user01.sellerAddress = new Address();
        user01.sellerAddress.postCode="55-104";
        user01.sellerAddress.city = "Wrocław";
        user01.sellerAddress.street="Jaśminowa";
        user01.sellerAddress.domeNo="21A";
        user01.sellerAddress.flatNo=5;

        Auction auction01 = new Auction();
        auction01.seller = user01;
        auction01.title = "Xbox One";
        auction01.description = "Konsola dla wymagajacych graczy";
        auction01.price = 999.99;

        User user02 = new User();
        user02.firstName = "Alicja";
        user02.lastName = "Janowska";


        Auction auction02 = new Auction();
        auction02.seller = user02;
        auction02.title = "Samsung S20";
        auction02.description = "Niesamowity telefon z 3 obiektywami";
        auction02.price = 3999.00;

        System.out.println("Ogłoszenie 1:");
        System.out.println(auction01.title +" \n"+auction01.description+"; "+auction01.price+"zł.");
        System.out.println("Sprzedający: ");
        System.out.println(user01.firstName+" "+user01.lastName+" zamieszkały "+user01.sellerAddress.city);
        System.out.println();
        System.out.println("Ogłoszenie 2:");
        System.out.println(auction02.title +" \n"+auction02.description+"; "+auction02.price+"zł.");
        System.out.println("Sprzedający: ");
        System.out.println(user02.firstName+" "+user02.lastName);

    }
}
