module LoginPanel {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports loginPanel.mvc to javafx.graphics;
    opens loginPanel.mvc to javafx.fxml;     //  utworzenie modułu otwartego, czyli takiego,
                                            // w którym każdy inny moduł będzie miał dostęp
                                           // do wszystkich składowych, ze wszystkich jego pakietów.
}