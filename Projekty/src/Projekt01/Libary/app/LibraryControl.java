package Projekt01.Libary.app;

import Projekt01.Libary.io.DataReader;
import Projekt01.Libary.model.Library;
import Projekt01.Libary.model.Book;
import Projekt01.Libary.model.Magazine;


public class LibraryControl {

    //    zmienna do komunikacji z użytkownikiem
    private final DataReader dataReader = new DataReader();

    //    "biblioteka" przechowująca dane
    private final Library library = new Library();

    //    Główna metoda programu, która pozwala na wybór opcji i interakcję
    public void controlLoop() {
        Option option;
        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch (option) {
                case ADD_BOOK -> addBook();
                case ADD_MAGAZINE -> addMagazine();
                case PRINT_BOOKS -> printBooks();
                case PRINT_MAGAZINES -> printMagazines();
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji, wprowadź ponownie:");
            }
        } while (option != Option.EXIT);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Option option : Option.values()) {
            System.out.println(option);
        }
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void exit() {
        System.out.println("Koniec programu!");
        // zamykamy strumień wejścia
        dataReader.close();
    }
}

