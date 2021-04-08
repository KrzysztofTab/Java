package Example03;

import Example03.execption.NoSuchOptionException;

public enum Option {
    EXIT(0, "WYJŚCIE"),
    WCZYTANIE_DANYCH(1, "WYŚWIETLANIE DANYCH"),
    WPROWADZANIE_DANYCH(2, "DODANIE DANYCH");


    private final int value;
    private final String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

   static Option createFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id " + option);
        }
    }
}
