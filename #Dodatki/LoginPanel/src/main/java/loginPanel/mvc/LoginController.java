package loginPanel.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField userNameTextField;

    @FXML
    private Button loginButon;

    @FXML
    private Label userNameLabel;

    public void initialize(){
        String labelText = userNameTextField.getText();
        System.out.println(labelText);
        userNameTextField.setText("Tekst z kontrolera");
    }

}