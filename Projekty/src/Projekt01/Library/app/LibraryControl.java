package Projekt01.Library.app;

import Projekt01.Library.exception.DataExportException;
import Projekt01.Library.exception.DataImportException;
import Projekt01.Library.exception.NoSuchOptionException;
import Projekt01.Library.exception.UserAlreadyExistsException;
import Projekt01.Library.io.ConsolePrinter;
import Projekt01.Library.io.DataReader;
import Projekt01.Library.io.file.FileManager;
import Projekt01.Library.io.file.FileManagerBuilder;
import Projekt01.Library.model.*;
import Projekt01.Library.model.comparator.AlphabeticalTitleComparator;

import java.util.Comparator;
import java.util.InputMismatchException;

public class LibraryControl {
    //      drukowanie wszytskich printów
    private final ConsolePrinter printer = new ConsolePrinter();
    //    zmienna do komunikacji z użytkownikiem
    private final DataReader dataReader = new DataReader(printer);
    //    "biblioteka" przechowująca dane
    private FileManager fileManager;
    private Library library;

    LibraryControl() {
        fileManager = new FileManagerBuilder(printer, dataReader).bulid();
        try {
            library = fileManager.importData();
            printer.printLine("\nZaimportowane dane z pliku\n");
        } catch (DataImportException e) {
            printer.printLine(e.getMessage());
            printer.printLine("Zainicjowano nową bazę.");
            library = new Library();
        }
    }

    //    Główna metoda programu, która pozwala na wybór opcji i interakcję
    public void controlLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case ADD_BOOK -> addBook();
                case ADD_MAGAZINE -> addMagazine();
                case PRINT_BOOKS -> printBooks();
                case PRINT_MAGAZINES -> printMagazines();
                case DELETE_BOOK -> deleteBook();
                case DELETE_MAGAZINE -> deleteMagazine();
                case ADD_USER -> addUser();
                case PRINT_USERS -> printUsers();
                case EXIT -> exit();
                default -> printer.printLine("Nie ma takiej opcji, wprowadź ponownie:");
            }
        } while (option != Option.EXIT);
    }

    private enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD_BOOK(1, "Dodanie książki"),
        ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
        PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
        PRINT_MAGAZINES(4, "Wyświetlenie dostępnych magazynów / gazet"),
        DELETE_BOOK(5, "Usuń książkę"),
        DELETE_MAGAZINE(6, "Usuń magazyn"),
        ADD_USER(7,"Dodaj czytelnika"),
        PRINT_USERS(8,"Wyświetl czytelnika");


        private final int value;
        private final String desciption;

        Option(int value, String desc) {
            this.value = value;
            this.desciption = desc;
        }

        public int getValue() {
            return value;
        }

        public String getDesciption() {
            return desciption;
        }

        @Override
        public String toString() {
            return value + " - " + desciption;
        }

        //    createFromInt(int option), która pozwala przekształcić wartość typu int na odpowiednią wartość typu Option
        static Option createFromInt(int option) throws NoSuchOptionException {
            try {
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchOptionException("Brak opcji o id " + option);
            }
        }
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage() + ", podaj ponownie:");
            } catch (InputMismatchException ignored) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }

        return option;
    }

    private void printOptions() {
        printer.printLine("\nWybierz opcję: ");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }
    }

    private void addBook() {
        try {
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć książki, niepoprawne dane");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemności, nie można dodać kolejnej książki");
        }
    }

    private void deleteBook() {
        try {
            Book book = dataReader.readAndCreateBook();
            if (library.removePublication(book))
                printer.printLine("Usunięto książkę.");
            else
                printer.printLine("Brak wskazanej książki.");
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć książki, niepoprawne dane");
        }
    }

    private void printBooks() {
        printer.printBooks(library.getSortedPublications(new AlphabeticalTitleComparator()));
    }

    private void addMagazine() {
        try {
            Magazine magazine = dataReader.readAndCreateMagazine();
            library.addMagazine(magazine);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć magazynu, niepoprawne dane");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemności, nie można dodać kolejnego magazynu");
        }
    }

    private void deleteMagazine() {
        try {
            Magazine magazine = dataReader.readAndCreateMagazine();
            if (library.removePublication(magazine))
                printer.printLine("Usunięto magazyn.");
            else
                printer.printLine("Brak wskazanego magazynu.");
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć magazynu, niepoprawne dane");
        }
    }

    private void printMagazines() {
        printer.printMagazines(library.getSortedPublications(new AlphabeticalTitleComparator()));
    }

    private void addUser() {
        LibraryUser libraryUser = dataReader.createLibraryUser();
        try {
            library.addUser(libraryUser);
        } catch (UserAlreadyExistsException e) {
            printer.printLine(e.getMessage());
        }
    }

    private void printUsers() {
        printer.printUsers(library.getSortedUsers(new Comparator<LibraryUser>() {
            @Override
            public int compare(LibraryUser p1, LibraryUser p2) {
                return p1.getLastName().compareToIgnoreCase(p2.getLastName());
            }
        }));
    }

    private void exit() {
        try {
            fileManager.exportData(library);
            printer.printLine("Export danych do pliku zakończony powodzeniem");
        } catch (DataExportException e) {
            printer.printLine(e.getMessage());
        }
        dataReader.close();
        System.err.println("\nKoniec programu!");
    }

}

