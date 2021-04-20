package Zadanie16.Exam;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "witaj tutaj";
        char[] charArray = new char[11];

        System.out.printf("s1: %s", s1);

        // Test metody length - liczby znaków znajdujących się w obiekcie String o referencji s1.
        System.out.printf("     Długość s1: %d", s1.length());

        // Przejdź w pętli przez znaki s1 za pomocą charAt i wyświetl je w odwrotnej kolejności
        System.out.printf("%nTekst po odwróceniu: ");

        for (int count = s1.length() - 1; count >= 0; count--) {
            System.out.printf("%c ", s1.charAt(count)); // Metoda charAt klasy String  Metoda ta przyjmuje argument
            // w postaci liczby całkowitej stanowiący indeks znaku i zwraca ten znak.
        }

        // Kopiowanie znaków z tekstu do charArray
        /*
        Używa metody getChars do skopiowania znaków tekstu do tablicy znaków.
        Pierwszym argumentem jest indeks pierwszego znaku do skopiowania.
        Drugim argumentem jest indeks znaku po ostatnim z kopiowanych znaków.
        Trzecim argumentem jest tablica, w której mają być umieszczone znaki.
        Ostatni argument to indeks w tablicy znaków, od którego mają być umieszczane znaki.
        Wiersze od "for(){" do "}". wyświetlają zawartość tablicy znak po znaku.
         */
        s1.getChars(0, 11, charArray, 0);
        System.out.printf("%nTablica znaków: ");
        for (char character : charArray) {
            System.out.print(character);
        }
        System.out.println();
    }
}
