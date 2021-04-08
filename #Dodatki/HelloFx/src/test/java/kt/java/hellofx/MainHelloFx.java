package kt.java.hellofx;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainHelloFx extends Application {
    public MainHelloFx() {
        System.out.println("Constructor");
    }

    @Override
    public void start(Stage stage) {
        System.out.println("Start");
        stage.setTitle("Hello FX!");    // setTitle() ustawia tytuł okna
        stage.show();                   // metoda show() sprawia, że okno staje się widoczne.
    }

    public static void main(String[] args) {
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
