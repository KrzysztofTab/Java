/**
 * Sample Skeleton for 'mainPane.fxml' Controller Class
 */

package loginPanel.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML // fx:id="userNameTextField"
    private TextField userNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="loginButon"
    private Button loginButon; // Value injected by FXMLLoader

    @FXML // fx:id="userNameLabel"
    private Label userNameLabel; // Value injected by FXMLLoader

    public void initialize() {
        String labelText = userNameTextField.getText();
        System.out.println(labelText);
        userNameTextField.setText("Tekst z kontrolera");
    }
}