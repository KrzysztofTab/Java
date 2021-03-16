package ProjektyWlasne.Ex01;

import java.util.*;


public class LottoGame {
    public static final Scanner CONSOLE = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n- LOSOWANIE LOTTO -\n");
        List<Integer> userNumbers = readNumbersFromUser(); // wpisujemy własne liczby
        Lotto lotto = new Lotto();
        int result = lotto.checkResult(userNumbers);        //wczytuje liczby od urzytkownika do metody "checkResult"
        Collections.sort(userNumbers);                      // sotuje listę wpisanych liczb
        List<Integer> lottoResult = lotto.getLottoResult(); // wczytule 6 liczb z losowania
        Collections.sort(lottoResult);                      // sortuję listę wylosowanych liczb
        System.out.println("\nTwoje liczby: " + userNumbers);
        System.out.println("\nWynik losowania: " + lottoResult);
        System.out.println("\nLiczba trafień: " + result);
    }

    // dodaje liczby od urzytkownika
    public static List<Integer> readNumbersFromUser() {
        List<Integer> userNumbers = new ArrayList<>(); //tworzy nową liste z numerami podanymi przez urzytkownika
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) { // pętla pwtarza sie tyle razy ile jest podane "MAX_NUMBERS"
            System.out.println("Podaj " + (i + 1) + " liczbę z przedziału [1 - 49]:");
            int nextNumber = getInt();
            nextNumber = largeNumber(nextNumber);
            nextNumber = seriousNumber(userNumbers, nextNumber);
            userNumbers.add(nextNumber);            // dodaje kolejne liczny do Listy
        }
        return userNumbers;
    }

    // sprawdza wielkosc podanej liczby
    private static int largeNumber(int nextNumber) {
        while (nextNumber > Lotto.NO_OF_NUMBERS) {
            System.err.println("Podałeś za duża wartość");
            nextNumber = getInt();
        }
        return nextNumber;
    }

    // sprawdza czy już nie podaliśmy takiej liczby
    private static int seriousNumber(List<Integer> userNumbers, int nextNumber) {
        for (int number : userNumbers) {
            if (number == nextNumber) {
                System.err.println("Ta liczba jest już podana: " + number);
                nextNumber = getInt();
            }
        }
        return nextNumber;
    }

    // sprawdza czy podana licza jest prawidłowa
    private static int getInt() {
        try {
            return CONSOLE.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("To nie jest liczba");
        } finally {
            CONSOLE.nextLine();
        }
        return getInt();
    }
}

