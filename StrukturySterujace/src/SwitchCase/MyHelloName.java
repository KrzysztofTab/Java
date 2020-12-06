package SwitchCase;

import java.util.Scanner;

public class MyHelloName {

    public static void main(String[] args) {
        final int krzysiek = 1;
        final int maciek = 2;
        final int marek = 3;
        System.out.println("1 -Krzysiek"+"\n"+"2 -Maciek"+"\n"+"3 -Marek");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz  liczbę przy imieniu: ");
        int liczba = scanner.nextInt();

        int name = liczba;

        switch (name) {
            case maciek:
            case krzysiek:
                System.out.println("Siemano! Witaj w programie.");
                break;
            case marek:
                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
                break;
            default:
                System.out.println("Witaj nieznany użytkowniku!");
        }
    }
}
