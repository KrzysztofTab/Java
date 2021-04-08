package Ex02;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class New {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Twilight Zone", 444, "2 Unlimited", Song.Genre.DANCE),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("Zawsze tam Gdzie Ty", 504, "Lady Pank", Song.Genre.ROCK),
                new Song("What Is Love", 469, "Haddaway", Song.Genre.DANCE),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP),
                new Song("Mój Dom", 484, "IRA", Song.Genre.ROCK),
                new Song("Everybody", 539, "DJ Bobo", Song.Genre.DANCE)
        );
        String type = getString();

        int totalPopLength = totalLengthByGenre(songs, Song.Genre.valueOf(type));
        System.out.println("Łączny czas piosenek popowych na playliście (w sekundach): " + totalPopLength);
    }

    private static String getString() {
        System.out.println("\nMETAL, POP, ROCK, DANCE\nWybierz gatunek muzyczny:");
        String type = scanner.nextLine().toUpperCase(Locale.ROOT);
        return type;
    }

    private static int totalLengthByGenre(List<Song> songs, Song.Genre genre ){
        return songs.stream()
                .filter(song -> song.getGenre() == genre)
                .mapToInt(Song::getLength)
                .sum();
    }
}
