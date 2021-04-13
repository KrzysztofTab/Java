package fxaction.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class AddEventFilter {
    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    public void initialize(){
        // Metody addEventFilter() i addEventHandler() przyjmują jako pierwszy argument typ zdarzenia jaki
        // chcemy obsłużyć, a jako drugi obiekt klasy EventHandler z parametrem zgodnym z typem obsługiwanego zdarzenia.
        lowerCaseButton.addEventFilter(ActionEvent.ACTION, event->{
                 System.out.println("Wciśnięto przycisk");
                System.out.println(event.getEventType());
                String originalText = mainTextArea.getText();
                String lowerText = originalText.toLowerCase();
                mainTextArea.setText(lowerText);
        });

        // możemy tutaj obsługiwać nie tylko zdarzenia typu ActionEvent, ale równie dobrze może to być zdarzenie
        // typu MouseEvent, czyli zdarzenie związane z myszą, albo KeyEvent związane z klawiaturą. Dodajmy obsługę
        // zdarzenia, które będzie wywołane przy każdorazowym wciśnięciu klawiszy w TextArea.
        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent ->
            System.out.println("Wcisnięto " + keyEvent.getCharacter())
        );
        //Zdarzenie Key_TYPED jest generowane, gdy ktoś wciśnie i zwolni dowolny klawisz na klawiaturze.
        // Działanie programu jest niemal identyczne jak poprzednio, jednak teraz po każdym wciśnięciu klawisza
        // zobaczymy dodatkowy log w konsoli. Z obiektu keyEvent możemy odczytać znak wciśniętego klawisza.
    }
}
