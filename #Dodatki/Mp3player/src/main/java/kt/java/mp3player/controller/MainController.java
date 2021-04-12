package kt.java.mp3player.controller;

/**
 * Sample Skeleton for 'mainPane.fxml' Controller Class
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;

public class MainController {

    @FXML // fx:id="fileMenuItem"
    private MenuItem fileMenuItem; // Value injected by FXMLLoader

    @FXML // fx:id="dirMenuitem"
    private MenuItem dirMenuitem; // Value injected by FXMLLoader

    @FXML // fx:id="closeMaenuItem"
    private MenuItem closeMaenuItem; // Value injected by FXMLLoader

    @FXML // fx:id="aboutMenuItem"
    private MenuItem aboutMenuItem; // Value injected by FXMLLoader

    @FXML // fx:id="contentTable"
    private TableView<?> contentTable; // Value injected by FXMLLoader

    @FXML // fx:id="preiousButton"
    private Button preiousButton; // Value injected by FXMLLoader

    @FXML // fx:id="playButton"
    private ToggleButton playButton; // Value injected by FXMLLoader

    @FXML // fx:id="nextButton"
    private Button nextButton; // Value injected by FXMLLoader

    @FXML // fx:id="columeSlider"
    private Slider columeSlider; // Value injected by FXMLLoader

    @FXML // fx:id="progressSlider"
    private Slider progressSlider; // Value injected by FXMLLoader

    public void initialize(){
        System.out.println("MainController created");
    }

}

