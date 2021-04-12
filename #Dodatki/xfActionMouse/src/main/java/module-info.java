module xfAction {
    requires javafx.fxml;     // zależności
    requires javafx.controls;
    requires javafx.graphics;

    exports xfaction.main to javafx.graphics;   // eksportujemy pakiey main do graphics aby uruchomic aplikacje
    opens xfaction.controller to javafx.fxml;   // otwieramy controls dla modułu j.fxml
                                                // w pakiecie tym znajude się kontrolki z adnątacją @FXML
}