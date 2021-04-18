package Zadanie14.ExDuration;

import Zadanie14.Song;

public class PlayListTest00 {
    public static void main(String[] args) {
        Song song1 = new Song("Ulalala", 558);
        Song song2 = new Song("Nothing else matters", 420);
        Song song3 = new Song("Nothing", 621);

        int  playlistLength = Playlist00.playList(song1, song2, song3);
        System.out.printf("Wszystkie piosenki trwają: %d sekund, czyli\n", playlistLength);
        String formattedTime = Playlist00.getFormattedTime(playlistLength);
        System.out.println(formattedTime);
    }
}
