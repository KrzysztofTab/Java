package Zadania.Calculator.io;

import Zadania.Calculator.exception.NoSuchOptionException;

import java.util.NoSuchElementException;

public enum Option {
    EXIT(0, " - EXIT"),
    CIRCLE(1, " - koło"),
    TRIANGLE(2, " - trójkat"),
    RECTANGLE(3, " - prostokat"),
    SQUARE(4, " - kwadrat");

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
        return value + " " + desciption;
    }

    //    createFromInt(int option)- sprawdza poprawnosć podanej wartości
    public static Option createFromInt(int option) throws NoSuchElementException {
        try {
            return Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException("Brak opcji o id " + option);
        }
    }
}
