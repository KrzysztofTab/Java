package Zadanie16;

public class Hangman {
    // stała określająca maksymalną ilość błędnych liter, które może podać użytkownik
    private static final int MAX_MISTAKES = 8;

    private final String guessWord;     //  hasło do zgadnięcia
    private String guessWordDisplay;    //  hasło do zgadnięcia z ukrytymi literami
    private final char[] userGuesses;   //  tablica ze wszystkimi literami, które podał użytkownik,
    private int guesses;                //  liczba "strzałów" gracza
    private int mistakes;               //  liczba nietrafionych liter gracza

    public Hangman(String guessWord) {
        this.guessWord = guessWord;
        userGuesses = new char[32];
        generateDisplay();
    }

    public String getGuessWord() {                  //  getter pola guessWord,
        return guessWord;
    }

    public String getGuessWordDisplay() {           //  getter pola guessWordDisplay
        return guessWordDisplay;
    }

    public boolean userLost() {     //  prawdza, czy użytkownik przegrał, czyli czy popełnił więcej błędów niż mógł,
        return mistakes >= MAX_MISTAKES;
    }

    public boolean userWon() {     //  prawdza czy użytkownik wygrał, czyli, czy nie pozostała żadna litera do odgadnięcia.
        return !guessWordDisplay.contains("*");
    }

    public void checkLetter(char letter) {
        if (!arrayContains(userGuesses, letter)) {   // użytkownik podaje literę
            checkMistake(letter);                   // prawdzamy, czy nie jest ona błędem
            rememberGuess(letter);                  //  zapamiętujemy literę wprowadzoną przez użytkownika
            generateDisplay();                      //  generujemy słowo do wyświetlenia
        }
    }
    //  sprawdzamy, czy nie jest ona błędem (metoda checkMistake()),
    //  w takiej sytuacji zwiększamy ilość potknięć (mistakes) o 1,
    private void checkMistake(char letter) {
        if (guessWord.indexOf(letter) == -1) {
            mistakes++;
        }
    }

    //  zapamiętujemy literę wprowadzoną przez użytkownika w tablicy userGuesses
    //  i zwiększamy ilość podejść (guesses) o 1 (metoda rememberGuess()),
    private void rememberGuess(char letter) {
        userGuesses[guesses] = letter;
        guesses++;
    }

    //  generujemy słowo do wyświetlenia
    private void generateDisplay() {
        String display = "";
        for (int i = 0; i < guessWord.length(); i++) {
            char nextChar = guessWord.charAt(i);
            if (arrayContains(userGuesses, nextChar))
                display += nextChar;
            else if (nextChar == ' ')
                display += ' ';
            else
                display += "*";
        }
        this.guessWordDisplay = display;
    }

    //  Ostatnia metoda w klasie arrayContains() będzie nam przydatna do sprawdzenia,
    //  czy jakaś litera znajduje się tablicy znaków.
    private boolean arrayContains(char[] array, char letter) {
        for (char element : array) {
            if (element == letter)
                return true;
        }
        return false;
    }
}

// Hangman - główna logika gry,