package Inicjalizator.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class LoginController {

    @FXML
    private Label etykietaLabel1;

    @FXML
    private Button przyciskButton1;

    @FXML
    private Label etykietaLabel2;

    @FXML
    private Button przyciskButton2;

    public void initialize() {
        etykietaLabel1.setText("Etykieta 1");
        etykietaLabel2.setText("Etykieta 2");
        przyciskButton1.setText("Przycisk 1");
        przyciskButton2.setText("Przycisk 2");
    }
}