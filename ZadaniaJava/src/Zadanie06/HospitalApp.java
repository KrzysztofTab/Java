package Zadanie06;
//    klasa startowa programu, która posiada trzy opcje:
//    0 - wyjście z programu,
//    1 - dopisanie pacjenta,
//    2 - wyświetlenie listy zapisanych pacjentów.
//    Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu.

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
//        menu wyboru na klawiaturze
        final int exit = 0;
        final int addPatiens = 1;
        final int printPatiens = 2;
        int option = -1;

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

//        petla w kórej utrzymuje sie menu wyboru do puki z niej nie wyjdziemy
        while (option != exit) {
            System.out.println("     -- MENU -- ");
            System.out.println("0 - wyjscie z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyswietlenie listy pacjentów");

            System.out.println("\n" + "Wybierz: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case addPatiens:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(sc.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(sc.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(sc.nextInt());
                    hospital.addPatient(patient);
                    break;
                case printPatiens:
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Zamykam program");
                    break;
                default:
                    System.out.println("Nie znaleiono opci w MENU");
            }
        }
        sc.close();
    }
}
