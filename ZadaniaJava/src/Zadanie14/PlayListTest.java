package Zadanie14;

public class PlayListTest {
    public static void main(String[] args) {
        Song song1 = new Song("Ulalala", 309);
        Song song2 = new Song("Nothing else matters", 420);
        int playlistLength = Playlist.playList(song1, song2);
        System.out.printf("Wszystkie piosenki trwają: %d sekund, czyli\n", playlistLength);
        String formattedTime = Playlist.getFormattedTime(playlistLength);
        System.out.println(formattedTime);
    }
}
