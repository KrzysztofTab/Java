package ExOptional;

import java.util.Scanner;

public class ContactApp {
    // Wprowadź ewentualne poprawki w metodzie main(), wydzielając z niej osobne metody.

    public static void main(String[] args) {
        ContactReader.readFile()
                .ifPresentOrElse(ContactApp::findByEmil, ContactApp::fileNotFlundMessage);
    }

    private static void findByEmil(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        assert contactManager != null;
        contactManager.findByEmail(email)
                .ifPresentOrElse(ContactApp::showShortInfo, ContactApp::contactNotMessage);
    }

    private static void contactNotMessage() {
        System.err.println("Brak kontaktu o wskazanym adresie");
    }

    private static void showShortInfo(Contact contactByEmail) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contactByEmail.getShortInfo());
    }

    private static void fileNotFlundMessage() {
        System.err.println("Brak pliku z danymi");
    }

}

