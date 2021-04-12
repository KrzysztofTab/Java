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
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuitem;

    @FXML
    private MenuItem closeMaenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private Button preiousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;
    public void initialize(){
        configureButtons();
        configureVolume();
    }

    private void configureVolume() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, event ->
                System.out.println("Wciśnięto przycisk na suwaku głośności")
        );
    }

    private void configureButtons() {
        preiousButton.setOnAction(event-> System.out.println("Poprzednia piosenka"));
        nextButton.setOnAction(x-> System.out.println("Następna piosenka"));
        playButton.setOnAction(event->{
            if(playButton.isSelected()){
                System.out.println("Play");
            }else {
                System.out.println("Stop");
            }
        });
    }


}

