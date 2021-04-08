import java.util.Scanner;

public class WritingData {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Wprowadż imie: ");
         String firstName = sc.nextLine();
         System.out.println("Wprowadż nazwisko: ");
         String lastName = sc.nextLine();

         Client client = new Client(lastName,firstName);

         PrintDane printDane = new PrintDane();
         printDane.printDaneOsobowe(client);

    }
}
