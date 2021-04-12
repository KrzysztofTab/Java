package xfaction.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class MainPaneController {
    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button upperCaseButton;

    public void initialize() {
        mainTextArea.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> System.out.println("Wciśnięcie przycisku myszy"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_RELEASED, mouseEvent -> System.out.println("Zwolnienie przycisku myszy"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent ->
                System.out.println("Wciśnięto i zwolniono przycisk myszy " + mouseEvent.getClickCount()));

        mainTextArea.addEventFilter(MouseEvent.MOUSE_ENTERED, mouseEvent ->
                System.out.println("Mysz w opbszaże kontrolki " + mouseEvent.getSceneX() + mouseEvent.getSceneY()));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_EXITED, mouseEvent -> System.out.println("Mysz po za opbszarem kontrolki"));
//        mainTextArea.addEventFilter(MouseEvent.MOUSE_MOVED, mouseEvent -> System.out.println("Mysz porusza się nad opbszarem kontrolki"));


        upperCaseButton.addEventFilter(ActionEvent.ACTION, event -> {
            System.out.println("Wciśnięto przycisk");
            System.out.println(event.getEventType());
            String originalText = mainTextArea.getText();
            String lowerText = originalText.toUpperCase();
            mainTextArea.setText(lowerText);
        });
    }
}
/*
setOnMouseEntered() - zdarzenie wywoływane, gdy kursor zostaje wprowadzony nad słuchacza,
setOnMouseExited() - zdarzenie wyjścia kursora poza słuchacza,
setOnMouseClicked() - zdarzenie wywoływane przy kliknięciu przyciskiem w obszarze słuchacza (wciśnięcie i puszczenie przycisku),
setOnMouseDragged() - przesunięcie kursora z wciśniętym przyciskiem nad obszarem słuchacza,
setOnMouseMoved() - przesunięcie kursora nad słuchaczem bez wciśniętych przycisków,
setOnMousePressed() - wciśnięcie przycisku nad obszarem słuchacza,
setOnMouseReleased() - zwolnienie przycisku nad obszarem słuchacza.
 */