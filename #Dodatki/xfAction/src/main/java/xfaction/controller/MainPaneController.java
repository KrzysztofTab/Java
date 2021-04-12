package xfaction.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPaneController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    /* dodajemy obsługę akcji poprzez metodę setOnAction()
    Jako jej argument przekazujemy obiekt typu EventHandler sparametryzowanej typem ActionEvent który odpowiada
    zdarzeniom typu wciśnięcie przycisku EventHandler jest interfejsem, więc obiekt tworzymy za pomocą klasy
    anonimowej, w której implementujemy jej jedyną metodę handle(). Po wywołaniu zdarzenia, czyli wciśnięciu przycisku,
    tworzony jest obiekt ActionEvent przechowujący informacje o zdarzeniu, a następnie przekazywany jest do metody handle() */
    public void initialize() {
        lowerCaseButton.setOnAction(actionEvent -> {  // EventHandler jest interfejsem funkcyjnym - wyrażenie Lambda
            System.out.println("Wciśnieto przycisk");
            // Metoda getEventType(), której wynik wyświetlamy w System.out.println()
            // zwraca po prostu obiekt typu EventType.
            System.out.println(actionEvent.getEventType());
            // W celu podmiany tekstu w obiekcie mainTextArea, najpierw pobieramy jego oryginalną
            // zawartość do zmiennej originalText za pomocą metody getText() klasy TextArea.
            // Dalej musimy ustawić ten sam tekst, ale przerobiony na małe litery.
            // W tym celu zamieniamy tekst przy pomocy metody toLowerCase() i ustawiamy go wywołując metodę setText().
            String orginalText = mainTextArea.getText();  // pobieramy orginalny tekst
            String lowerText = orginalText.toLowerCase(); // metoda toLowerCase zwraca nowy obiekt zapisany małymi literami
            mainTextArea.setText(lowerText);  // ustawiamy nowy teks zamieniony na małe litery
        });
    }

}
