package fxmodules.main;

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
        VBox mainePane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/mainPane.fxml")));
        Scene scene = new Scene(mainePane);
        stage.setScene(scene);
        stage.setTitle("MultiView example");
        stage.show();
    }
}
