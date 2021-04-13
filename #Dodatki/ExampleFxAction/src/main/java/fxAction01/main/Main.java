package fxAction01.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane =  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml01/mainPane.fxml")));
        Scene scene = new Scene(mainPane);              // layout o sceny
        stage.setScene(scene);                          // scene do okna aplikacji
        stage.setTitle("Events example".toUpperCase());               // tytuł okna
        stage.show();
    }
}
