package fxAction02.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ContentPaneController {

    @FXML
    private TextPaneController textPaneController;

    @FXML
    private Button clearButton;

    public void initialize() {
        var inputTextArea = textPaneController.getOriginalTextArea();
        var outputTextArea = textPaneController.getInvertedTextArea();

        clearButton.setOnAction(event -> {
            inputTextArea.clear();
            outputTextArea.clear();
        });
    }
}
