import java.sql.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String words = "  Jeden dwa trzy cztery pięć sześć siedem ";
        String sub1 = words.substring(2, 7);

//        tekst do podmainy , pierw podajesz co podmieniamy - na co
        String sub2 = words.replaceAll("dwa", "hehe");

//        trim(). Dzięki niej możesz usunąć zbędne białe znaki z początku i końca napisu (spacje, tabulatory, entery).
        String sub3 = words.trim();

//        charAt() - zwraca znak w aktualnym ciągu znaków, jako parametr przyjmuje index (licząc od 0).
        char charat = words.charAt(2);

        System.out.println("\n" + words);
        System.out.println("-------------------------------------------");
        System.out.println("words.substring(2, 7)");
        System.out.println(sub1);
        System.out.println("-------------------------------------------");
        System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
        System.out.println(sub2);
        System.out.println("-------------------------------------------");
        System.out.println("words.trim()");
        System.out.println(sub3);
        System.out.println("-------------------------------------------");
        System.out.println("words.charAt(2)");
        System.out.println(charat);

        System.out.println("-------------------------------------------");
//        żadna z powyższych metod nie modyfikuje oryginalnego napisu, ale zwraca w wyniku nowy zmodyfikowany napis
        String original = "Ala ma kota";
        original.replaceAll("Ala", "Kasia");
        System.out.println(original);

        System.out.println(" ");
//        Jeżeli chcesz wyświetlić tekst z podmienionym słowem,
//        przypisz wynik metody replaceAll() do którą chcemy nadpisać:
        String originale = "Ala ma kota";
        originale = originale.replaceAll("Ala", "Kasia");
        System.out.println("Referencja nadpisana Ale zastepiuje Kasia");
        System.out.println(originale);
//        przypisz wynik metody replaceAll() do nowej referencji
        String orgi = originale.replaceAll("kota", "chomika");
        System.out.println(orgi);

        System.out.println("-------------------------------------------");
//        zamienia cały naps na duże litery
        System.out.println(words.toUpperCase());
//        zamienia cały napis na małelitery
        System.out.println(words.toLowerCase());

        System.out.println("-------------------------------------------");
//        podaje długosci tekstu
        System.out.println("Długość tekstu w znakach: " + words.length());

        System.out.println("-------------------------------------------");
//        rozdzielanie napisu np: po spasji - torzy nam tablicę z wyrazów które zostały rozdielone
        String[] split = words.trim().split(" ");
        System.out.println("Wyswetla podzielone wyrazy rozdielone ',': "+ Arrays.toString(split));
        System.out.println("-------------------------------------------");
        System.out.println("podaje ilosć powstałych wyrazów z rozdelenia: " + split.length);

    }
}

/*      append() - metoda w wielu przeciążonych wersjach, która jako parametr przyjmuje napisy,
                    liczby lub obiekty i dokleja je do budowanego napisu
         insert() - również przeciążona w wielu wersjach. Pozwala wstawić konkretny znak,
                    wartość lub ciąg znaków do istniejącego ciągu znaków.
                    Jako pierwszy argument podajemy index (licząc od 0), na który chcemy coś wstawić,
                    jako drugi parametr wartość jaka ma zostać wstawiona
        charAt() - zwraca znak w aktualnym ciągu znaków, jako parametr przyjmuje index (licząc od 0).
        indexOf() - zwraca index w ciągu znaków, na którym występuje napis podany jako argument
        toString() - zwraca w postaci obiektu String ciąg znaków przechowywany przez obiekt StringBuilder
        length() - zwraca ona podobnie jak w przypadku tablic długość łańcucha znaków.
                    Zwróć uwagę, że w przypadku tablic jest to właściwość (na końcu nie ma nawiasów),
                    a przypadku typu String jest to metoda.
        toUpperCase() / toLowerCase() - zmienia napis na WERSALIKI lub wyłącznie małe litery
        split(String reg) - dzieli napis na tablicę napisów. parametr reg oznacza wyrażenie regularne
                    (może to być w najprostszej formie pojedynczy znak), które podzieli napis.
                    Przykładowo "1a2a3a4".split("a") zwróci tablicę Stringów {"1", "2", "3", "4"}.
*/