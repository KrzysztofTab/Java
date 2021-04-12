package xfaction.controller;

/*
W przypadku definiowania takich metod ważne są dwie rzeczy:
- metoda może przyjmować argument zgodny z typem obsługiwanej akcji. Jeśli więc chcesz obsłużyć wciśnięcie przycisku,
musisz jako parametr ustawić zmienną typu ActionEvent, a jeśli chcesz obsłużyć zdarzenie generowane przez mysz,
wybierz MouseEvent. Jeśli informacja o zdarzeniu nie jest ci potrzebna, to metoda może nie przyjmować żadnego parametru.
- jeżeli metoda nie będzie publiczna, to musi być dodatkowo oznaczona adnotacją @FXML.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ActionEvents {
    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    public void initialize() {
        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
            System.out.println("Wciśnięto " + keyEvent.getCharacter());
        });
    }

    public  void toLowerCaseAction(ActionEvent event) {
        System.out.println("Wciśnięto przycisk");
        System.out.println(event.getEventType());
        String originalText = mainTextArea.getText();
        String lowerText = originalText.toLowerCase();
        mainTextArea.setText(lowerText);
    }
}
/*
Metodę toLowerCaseAction() musimy powiązać z definicją przycisku w pliku mainPane.fxml.
Najłatwiej zrobić to oczywiście z poziomu SceneBuildera. Otwórz w nim plik mainPane.fxml,
kliknij na przycisk lub zaznacz go w sekcji Document Hierarchy po lewej stronie na dole,
a następnie po prawej stronie w sekcji Code wpisz nazwę metody, którą chcesz wywołać w odpowiedzi na wciśnięcie przycisku.
Zwróć uwagę, że nazwę metody podajemy bez nawiasów i argumentów.
Po zapisaniu pliku zauważysz, że w pliku fxml do przycisku został dodany atrybut onAction: onAction="#toLowerCaseAction"
Po uruchomieniu aplikacji zachowanie jest takie samo jak w poprzednich dwóch przypadkach wykorzystujących metodę
 setOnAction() oraz addEventFilter().
 */