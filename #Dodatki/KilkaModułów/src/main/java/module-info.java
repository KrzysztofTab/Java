module KilkaModu.w {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    opens fxmodules.controller to javafx.fxml;
    exports fxmodules.main to javafx.graphics;
}