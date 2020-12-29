package Projekt01.Libary.app;

import Projekt01.Libary.io.DataIn;
import Projekt01.Libary.model.Library;
import Projekt01.Libary.model.Book;

public class LibraryControl {
    //    zmienne do kontrolowania programu
    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOKS = 2;

    //    zmienna do komunikacji z użytkownikiem
    private DataIn danaIn = new DataIn();

    //    "biblioteka" przechowująca dane
    private Library library = new Library();

    /*
     *     Główna metoda programu, która pozwala na wybór opcji i interakcję
     */
    public void controlLoop() {
        int option;
        do {
            printOptions();
            option = danaIn.getInt();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie:");
            }
        } while (option != EXIT);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD_BOOK + " - dodanie nowej książki");
        System.out.println(PRINT_BOOKS + " - wyświetl dostępne książki");
    }

    private void addBook() {
        Book book = danaIn.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();

    }

    private void exit() {
        System.out.println("Koniec!");
//        zamykamy strumień wejścia
        danaIn.close();
    }
}

