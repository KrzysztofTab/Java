module Inicjalizator {
    requires javafx.fxml;
    requires javafx.controls;

    exports Inicjalizator.mvc;
    opens Inicjalizator.mvc to  javafx.fxml;
}