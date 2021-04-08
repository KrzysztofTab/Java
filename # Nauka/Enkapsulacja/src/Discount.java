class Discount {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        boolean clientPremium = true;
        double price = 1100; //zł
        double discountPrice = price;
        if(clientPremium && price > 1000) {
            discountPrice *= 0.85; //15% taniej klient premium i zakupy powyżej 1000zł
        } else if(price > 1000) {
            discountPrice *= 0.9; //10% zniżki na zakupy powyżej 1000zł
        } else if(clientPremium) {
            discountPrice *= 0.95; //5% zniżki dla klienta premium na dowolne zakupy
        }

        System.out.println("Witaj " + firstName + " " + lastName);
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);

    }
}