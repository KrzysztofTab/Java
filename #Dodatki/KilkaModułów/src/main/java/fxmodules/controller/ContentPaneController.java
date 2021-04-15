package fxmodules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ContentPaneController {

    @FXML
    private TextArea mainTextArea;

    public TextArea getMainTextArea() {
        return mainTextArea;
    }
    public void initialize() {
        System.out.println("ContentPaneController created");
    }
}
