package Ex02;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MusicCollection {
    static Scanner scanner = new Scanner(System.in);

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
        String type = typeGenre();

        long artistSongs = countSongsByArtist(songs, Song.Genre.valueOf(type));
        System.out.println("\nLiczba piosenek " + type + " na playliście: " + artistSongs);

        int totalLength = totalLengthByGenre(songs, Song.Genre.valueOf(type));
        System.out.println("\nŁączny czas piosenek " + type + " na playliście: " + totalLength + "sec.\n");

        System.out.print("Artyści " + type+ ": " );
        artistsGivenCategory(songs, Song.Genre.valueOf(type));

        System.out.println("\n");
        List<Song> songsWithout = songsWithGenreFiltered(songs, Song.Genre.valueOf(type));
        songsWithout.forEach(System.out::println);
    }

    private static void artistsGivenCategory(List<Song> songs, Song.Genre artists) {
        songs.stream()
                .filter(song -> song.getGenre() == artists)
                .distinct()
                .collect(Collectors.toList())
                .forEach(song -> System.out.print(song.getArtist()+"; "));
    }

    private static String typeGenre() {
        System.out.println("\nMETAL, POP, ROCK, DANCE\nWybierz gatunek muzyczny:");
        return scanner.nextLine().toUpperCase(Locale.ROOT);
    }

    static int totalLengthByGenre(List<Song> songs, Song.Genre genre) {
        return songs.stream()
                .filter(song -> song.getGenre() == genre)
                .distinct()
                .mapToInt(Song::getLength)
                .sum();
    }

    static long countSongsByArtist(List<Song> songs, Song.Genre artist) {
        return songs.stream()
                .filter(song -> song.getGenre() == artist)
                .distinct()
                .count();
    }

    static List<Song> songsWithGenreFiltered(List<Song> songs, Song.Genre genreToRemove) {
        return songs.stream()
                .filter(song -> song.getGenre() == genreToRemove)
                .distinct()
                .collect(Collectors.toList());
    }
}


