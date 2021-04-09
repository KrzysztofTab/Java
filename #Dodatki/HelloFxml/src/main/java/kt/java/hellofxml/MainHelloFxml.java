package kt.java.hellofxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainHelloFxml extends Application {

    public MainHelloFxml() {
        System.out.println("Constructor");
    }

    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane mainPane;
        mainPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/helloView.fxml")));

        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        System.out.println("Start");
        stage.setTitle("Hello FX!");
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);
    }

    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
