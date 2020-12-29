package Projekt01.Libary.model;

public class Library {
    private static final int MAX_BOOKS = 100;
    private final Book[] books = new Book[MAX_BOOKS];
    private int booksNumber;

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba ksiązek została osągnieta");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }
}
