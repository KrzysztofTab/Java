package mp3player.mp3;

public class Mp3Song {
    private final String title;
    private final String author;
    private final String album;
    private final String filePath;

    public Mp3Song(String title, String author, String album, String filePath) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getAlbum() {
        return album;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "Mp3Song [title=" + title + ", author=" + author + ", album=" + album + "]";
    }
}
