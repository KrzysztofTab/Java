package fxproperties.controller;

import javafx.beans.binding.StringBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class VolumeController {

    @FXML
    private Slider volumeSlider;

    @FXML
    private Label volumeLevelLabel;

    public void initialize() {
        StringBinding volumeSliderBinding = volumeSlider.valueProperty().asString();
        volumeLevelLabel.textProperty().bind(volumeSliderBinding);

        // Jeżeli chcielibyśmy jednak dodać ostrzeżenie w przypadku ustawienia zbyt dużej głośności,
        // albo powiadomienia o zbyt małej głośności, możemy wykorzystać metodę addListener() i obiekt ChangeListener.
        //  observable - obserwowana wartość obiektu,
        //  oldValue - wartość valueProperty przed wywołaniem zdarzenia,
        //  newValue - wartość valueProperty po zdarzeniu.
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            double volume = (Double) newValue;
            if (volume > 75) {
                System.out.println("Za głośno!");
            } else if (volume < 10) {
                System.out.println("Nic nie słychać");
            }
        });
    }
}

/*
Z etykiety pobraliśmy własność typu StringProperty za pomocą metody textProperty(). Następnie chcemy ją powiązać
 z wartością suwaka, ale jego metoda valueProperty() zwraca obiekt DoubleProperty, a argumentem metody może być
  obiekt typu ObservableValue sparametryzowany dodatkowo typem String (lub implementujący ten interfejs),
   albo własność tego samego typu, czyli również StringProperty. W klasie DoubleProperty znajdujemy metodę asString(),
    która zwraca obiekt StringBinding, czyli typ implementujący ObservableValue dzięki czemu wartości zostają powiązane.
 */