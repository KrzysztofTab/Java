import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadż imie: ");
        String firstName = scanner.nextLine();
        System.out.println("Wprowadż nzawisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();
//        Jeżeli wiemy, że obiekt Scanner nie będzie nam już dłużej potrzebny do odczytu danych,
//        powinniśmy wywołać metodę close(), nie będziesz mieć już możliwości odczytania czegokolwiek z konsoli.
//        scanner.close();
        System.out.println("Cześć " + firstName + " " + lastName);
        System.out.println("Masz już " + age + ", starość nie radość! :)");


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();
//        input.close();
        System.out.println("A + B = " + (a + b));

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //pobierz znak nowej linii \n
        sc.nextLine();
        //teraz możesz pobrać od użytkownika napis
        String word = sc.nextLine();
        //obie wartości zostają wyświetlone
        System.out.println(number);
        System.out.println(word);
        sc.close();
    }
}
