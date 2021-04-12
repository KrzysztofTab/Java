package xfaction.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneController {
    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button upperCaseButton;

    public void initialize() {
//        mainTextArea.setOnKeyPressed(keyEvent -> System.out.println("Wcisniecie przycisku "
//                + keyEvent.getCharacter()));
//        mainTextArea.setOnKeyReleased(keyEvent -> System.out.println("Zwolnienie przycisku "
//                + keyEvent.getCharacter()));
//        mainTextArea.setOnKeyTyped(keyEvent -> System.out.println("Wciśnięto i puszcono przycisk "
//                + keyEvent.getCharacter()));

        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> System.out.println("Wciśnięto i puszcono przycisk "
                + keyEvent.getCharacter())); // addEventFilter mogę dodawać wiele zdarzeń które się wykonają

        upperCaseButton.addEventFilter(ActionEvent.ACTION, event -> {
            System.out.println("Wciśnięto przycisk");
            System.out.println(event.getEventType());
            String originalText = mainTextArea.getText();
            String lowerText = originalText.toUpperCase();
            mainTextArea.setText(lowerText);
        });
    }
}
