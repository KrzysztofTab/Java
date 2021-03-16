package ProjektyWlasne.Ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    public static final int NO_OF_NUMBERS = 49;
    public static final int MAX_NUMBERS = 6;

    private final List<Integer> numbers = new ArrayList<>(); //  liczbami z zakresu od 1 do 49
    private List<Integer> lottoResult; // przypiszemy 6 liczb losowania

    // Metody generate() i randomize() wywołuję w konstruktorze
    Lotto() {
        generate();
        randomize();
    }

    public List<Integer> getLottoResult() {
        return lottoResult;
    }

    // mieszamy te liczby korzystając z metody Collections.shuffle()
    private void randomize() {
        Collections.shuffle(numbers);
        lottoResult = numbers.subList(0, 6); // tworzymy listę, którą przypisujemy do listy lottoResult

    }

    // wypełniamy listę numbers wartościami od 1 do 49
    private void generate() {
        for (int i = 1; i < NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    // Metoda checkResult() przyjmuje listę liczb (które będą wprowadzone przez użytkownika)
    // i sprawdza ile liczb użytkownika pokrywa się z liczbami z losowania.
    int checkResult(List<Integer> userNumbers) {
        int found = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (lottoResult.contains(userNumbers.get(i)))
                found++;
        }
        return found;
    }
}