package fxAction02.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class TextPaneController {
    @FXML
    private TextArea originalTextArea;
    @FXML
    private TextArea invertedTextArea;

    public TextArea getOriginalTextArea() {
        return originalTextArea;
    }

    public TextArea getInvertedTextArea() {
        return invertedTextArea;
    }

    public void initialize() {
        originalTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                reverseText(originalTextArea, invertedTextArea));

        invertedTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                reverseText(invertedTextArea, originalTextArea));
    }

    private void reverseText(TextArea source, TextArea target){
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }
}
