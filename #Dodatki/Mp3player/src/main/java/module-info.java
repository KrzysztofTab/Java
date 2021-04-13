module Mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports mp3player.main to javafx.graphics;
    opens mp3player.controller to javafx.fxml;
}