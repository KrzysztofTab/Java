package Projekt01.Library.io;

import Projekt01.Library.model.*;

import java.util.Collection;

public class ConsolePrinter {
    public void printBooks(Collection<Publication> publications) {
//        int counter = 0;                                           // wczesniejsze rozwiązanie
//        for (Publication publication : publications) {
//            if (publication instanceof Book) {
//                printLine(publication.toString());
//                counter++;
//            }
//        }
        long count = publications.stream()
                .filter(publication -> publication instanceof  Book)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0)
            printLine("Brak książek w bibliotece");
    }

    public void printMagazines(Collection<Publication> publications) {
//        int counter = 0;                                              // wczesniejsze rozwiązanie
//        for (Publication publication : publications) {
//            if (publication instanceof Magazine) {
//                printLine(publication.toString());
//                counter++;
//            }
//        }
        long count = publications.stream()
                .filter(publication -> publication instanceof Magazine)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0)
            printLine("Brak magazynów w bibliotece");
    }

    public void printUsers(Collection<LibraryUser> users) {
//        for (LibraryUser user : users) {                        // wczesniejsze rozwiązanie
//            printLine(user.toString());
//        }
        users.stream()
                .map(User::toString)
                .forEach(this::printLine);
    }
    public void printLine(String text) {
        System.out.println(text);
    }
}
