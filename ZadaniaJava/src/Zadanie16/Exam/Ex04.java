package Zadanie16.Exam;

public class Ex04 {
    public static void main(String[] args) {
        String[] strings = {"zajęte", "zajęta", "wolne", "aktywne"};

        // Test metody startsWith
        for (String string : strings) {
            if (string.startsWith("za")) {
                System.out.printf("'%s' zaczyna się od 'za'\n", string);
            }
        }
        System.out.println();

        // Test metody startsWith z początkiem sprawdzania od znaku 2.
        for (String string : strings) {
            if (string.startsWith("jęt", 2)) {
                System.out.printf("'%s' zaczyna się od 'jęt' na pozycji 2.\n", string);
            }
        }
        System.out.println();

        // Test metody endsWith
        for (String string : strings) {
            if (string.endsWith("ne")) {
                System.out.printf("'%s' kończy się na 'ne'\n", string);
            }
        }
    }
}

/*
metody startsWith i endsWith klasy String. Metoda main tworzy tablicę z tekstami "zajęte", "zajęta", "wolne" i "aktywne".
Pozostała część metody składa się z trzech instrukcji for, które sprawdzają, czy elementy tablicy zaczynają się
lub kończą określonymi zestawami znaków. Wiersze od 9. do 13. używają wersji metody startsWith, która przyjmuje
tylko jeden argument w postaci tekstu. Warunek w instrukcji if (wiersz 10.) określa, czy każdy tekst w tablicy
zaczyna się od znaków "za". Jeśli tak, metoda zwraca true i aplikacja wyświetla tekst. Jeśli metoda zwróci false,
nic się nie dzieje. Wiersze od 18. do 23. używają wersji metody startsWith, która przyjmuje dwa
argumenty: obiekt String i liczbę całkowitą. Liczba całkowita określa indeks, od którego powinno rozpocząć się wyszukiwanie.
Warunek w instrukcji if (wiersz 19.) określa, czy każdy tekst w tablicy zawiera znaki "jęt" od trzeciego znaku tekstu
(indeks 2). Jeśli tak, metoda zwraca true i aplikacja wyświetla tekst. Trzecia instrukcja for (wiersze od 28. do 32.)
używa metody endsWith, która przyjmuje argument w postaci tekstu. Warunek w wierszu 29. określa,
czy każdy tekst w tablicy kończy się znakami "ne". Jeśli tak, metoda zwraca true i aplikacja wyświetla tekst.
 */