package Projekt01.Libary.io;

import Projekt01.Libary.model.Book;

import java.util.Scanner;

public class DataIn {
    private final Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
//        nie musimy już pamiętać o wywołaniu metody nextLine() po każdej metodzie nextInt() obiektu Scanner
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}
