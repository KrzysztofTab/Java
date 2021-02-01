package Projekt03.Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import static javax.swing.UIManager.setLookAndFeel;

public class Slider extends JFrame implements ChangeListener {
    JLabel labelCelsius, labelFahrenheit;
    JSlider sliderFahrenheit, sliderCelsius;
    int temFahrenheita, temCelsius;

    public Slider() {
        setSize(500, 300);
        setTitle("Przeliczanie stopni Celsjusza na Fahreneita");
        setLayout(null);

        try {
            setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFee");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);

        sliderCelsius = new JSlider(-50, 50, 0);
        sliderCelsius.setBounds(50, 50, 300, 50);
//        podziałka przy suwaku co 20 stopni
        sliderCelsius.setMajorTickSpacing(20);
//        podziałka przy suwaku co 5 stopni
        sliderCelsius.setMinorTickSpacing(5);
//       wyświetalnie podziałki przy suwaku
        sliderCelsius.setPaintTicks(true);
//        etykiety przy podzałce 20,50 itp
        sliderCelsius.setPaintLabels(true);
        sliderCelsius.addChangeListener(this);
        add(sliderCelsius);

        sliderFahrenheit = new JSlider(-58, 122, 30);
        sliderFahrenheit.setBounds(50, 150, 300, 50);
//        podziałka przy suwaku co 20 stopni
        sliderFahrenheit.setMajorTickSpacing(20);
//        podziałka przy suwaku co 5 stopni
        sliderFahrenheit.setMinorTickSpacing(5);
//       wyświetalnie podziałki przy suwaku
        sliderFahrenheit.setPaintTicks(true);
//        etykiety przy podzałce 20,50 itp
        sliderFahrenheit.setPaintLabels(true);
        sliderFahrenheit.addChangeListener(this);
        add(sliderFahrenheit);

//        etykieta
        labelCelsius = new JLabel("Celsius: ");
        labelCelsius.setBounds(370, 50, 300, 50);
        add(labelCelsius);

        labelFahrenheit = new JLabel("Fahrenheit: ");
        labelFahrenheit.setBounds(370, 150, 300, 50);
        add(labelFahrenheit);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        temCelsius = sliderCelsius.getValue();
        labelCelsius.setText("Celsius: " + temCelsius);
//        wyrażenie '(int) Math.round(32 + (9.0 / 5.0) * temCelsius)' przekształaca duble na int
        temFahrenheita = (int) Math.round(32 + (9.0 / 5.0) * temCelsius);
        labelFahrenheit.setText("Fahrenheit: "+temFahrenheita);
        sliderFahrenheit.setValue(temFahrenheita);
    }
}
