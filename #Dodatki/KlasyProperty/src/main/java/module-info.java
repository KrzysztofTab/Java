module KlasyProperty {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports fxproperties.main to javafx.graphics;
    opens fxproperties.controller to javafx.fxml;
}