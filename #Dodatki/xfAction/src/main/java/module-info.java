module xfAction {
    requires javafx.fxml;     // zależności
    requires javafx.controls;
    requires javafx.graphics;

    exports fxaction.main to javafx.graphics;   // eksportujemy pakiey main do graphics aby uruchomic aplikacje
    opens fxaction.controller to javafx.fxml;   // otwieramy controls dla modułu j.fxml
                                                // w pakiecie tym znajude się kontrolki z adnątacją @FXML
}