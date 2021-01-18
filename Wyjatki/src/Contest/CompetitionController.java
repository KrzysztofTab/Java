package Contest;

import Contest.exception.AgeViolationException;
import Contest.exception.DuplicateException;
import Contest.exception.MaxCompetitorsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        printLine("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        printLine("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = readPositiveNumber();
        printLine("Podaj ograniczenie wiekowe:");
        int ageLimit = readPositiveNumber();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            printLine("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try {
                competition.addParticipant(participant);
            } catch (AgeViolationException e) {
                printLine("Nie dodano uczestnika, minimalny wiek: " + e.getAgeRequired());
            } catch (DuplicateException e) {
                printLine("Uczestnik o wskazanym identyfikatorze został już dodany do tych zawodów " + e.getParticipant());
            } catch (MaxCompetitorsException e) {
                printLine("Nie dodano uczestnika. Maksymalna liczba uczestników to " + e.getMaxCompetitors());
            }
        }
    }

    private Participant createParticipant() {
        printLine("Podaj imię:");
        String firstName = scanner.nextLine();
        printLine("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        printLine("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        printLine("Podaj wiek:");
        int age = readPositiveNumber();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }

    public void printLine(String text) {
        System.out.println(text);
    }

    private int readPositiveNumber() {
        int number = -1;
        while (number <= 0) {
            try {
                number = scanner.nextInt();
                if (number < 0)
                    printLine("Podana liczba musi być dodatnia");
            } catch (InputMismatchException ex) {
                printLine("Musisz podać liczbę!");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }
}
