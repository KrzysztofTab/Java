package fxmodules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {
    @FXML
    private ContentPaneController contentPaneController;
    @FXML
    private ControlPaneController controlPaneController;

    public void initialize(){
        Button lowerCase = controlPaneController.getLowerCaseButton();
        Button upperCase = controlPaneController.getUpperCaseButton();
        TextArea textArea =contentPaneController.getMainTextArea();

        lowerCase.setOnAction(x->textArea.setText(textArea.getText().toLowerCase()));
        upperCase.setOnAction(x->textArea.setText(textArea.getText().toUpperCase()));
    }
}
