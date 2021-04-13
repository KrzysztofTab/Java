package fxAction01.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneController {

    @FXML
    private TextArea originalTextArea;

    @FXML
    private TextArea invertedTextArea;

    @FXML
    private Button clearBotton;

    public void initialize() {                              //KEY_RELEASED - zdarzenie zwalniania przycisku
//        originalTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent -> {
//            String orginalText = originalTextArea.getText();
//            StringBuilder orgial = new StringBuilder();
//            invertedTextArea.setText(orgial.append(orginalText).reverse().toString());
//    });
        originalTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                reverseText(originalTextArea, invertedTextArea));

        invertedTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                reverseText(invertedTextArea, originalTextArea));

        clearBotton.setOnAction(event -> {
            originalTextArea.clear();
            invertedTextArea.clear();
        });
    }

    private void reverseText(TextArea source, TextArea target){
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }

}



