module Mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports kt.java.mp3player.main to javafx.graphics;
    opens kt.java.mp3player.controller to javafx.fxml;
}