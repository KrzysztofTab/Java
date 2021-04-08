package Ex02;

import java.util.Objects;

public class Song {
    private final String title;
    private final int length;
    private final String artist;
    private final Genre genre;

    public Song(String title, int length, String artist, Genre genre) {
        this.title = title;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public String getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    enum Genre {
        METAL, POP, ROCK, DANCE
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return getLength() == song.getLength() && Objects.equals(getTitle(),
                song.getTitle()) && Objects.equals(getArtist(),
                song.getArtist()) && getGenre() == song.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getLength(), getArtist(), getGenre());
    }

    @Override
    public String toString() {
        return "'" + title + "' : " + length + "s. - " + artist + " / " + genre;
    }
}
