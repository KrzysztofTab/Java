package fxmodules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControlPaneController {
    @FXML
    private Button lowerCaseButton;

    @FXML
    private Button upperCaseButton;

    public Button getLowerCaseButton() {
        return lowerCaseButton;
    }

    public Button getUpperCaseButton() {
        return upperCaseButton;
    }
    public void initialize() {
        System.out.println("ControlPaneController created");
    }
}
