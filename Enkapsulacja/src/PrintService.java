public class PrintService {
    void primeSummary(Client client, double orgialPrice, double discountPrice){

        printWelcomeMessage(client);
        printPrices(orgialPrice, discountPrice);
    }

    private void printPrices(double orgialPrice, double discountPrice) {
        System.out.println("Kwota przed rabatem: " + orgialPrice);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice + "\n");
    }

    private void printWelcomeMessage(Client client) {
        if(client.getFirstName() != null && client.getLastName() ==null){
            System.out.println("Dzień dobry "+ client.getFirstName());
        }
        else if(client.getFirstName() != null && client.getLastName() != null){
            System.out.println("Dzień dobry " + client.getFirstName() + " " + client.getLastName());
        }
        else if(client.getFirstName() == null && client.getLastName() != null) {
            System.out.println("Dzień dobry panie/pani "+ client.getLastName());
        }
        else {
            System.out.println("Dzień dobry nieznajomy");
        }
    }
}
