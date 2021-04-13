module ExampleFxAction {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports fxAction01.main to javafx.graphics;
    exports fxAction02.main to javafx.graphics;

    opens fxAction01.controller to javafx.fxml;
    opens fxAction02.controller to javafx.fxml;
}