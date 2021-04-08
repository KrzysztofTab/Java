import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
//        alt+Enter - tworzenie klasy
        User user = new User("Jan","Kowalski");

        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikuj dane użytkownika");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadż ocje: ");
        int option = scanner.nextInt();

        if (option == 0){
            System.out.println("Bye bye!");
        } else if (option == 1) {
            System.out.println("Użytkownik: " + user.getFirstName() + " " + user.getLastName());
        } else if (option ==2){
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmieniono dane użytkownika na: " + user.getFirstName() + " " + user.getLastName());
        }
    }
}
