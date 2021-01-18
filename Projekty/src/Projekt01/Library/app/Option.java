package Projekt01.Library.app;

import Projekt01.Library.exception.NoSuchOptionException;

public enum Option {
    EXIT(0, "Wyjście z programu"),
    ADD_BOOK(1, "Dodanie książki"),
    ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
    PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
    PRINT_MAGAZINES(4, "Wyświetlenie dostępnych magazynów / gazet");

    private int value;
    private String desciption;

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
        return value + " " + desciption;
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
