package Projekt03.CheckBox.Pro03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFarenheit extends JFrame implements ActionListener {
    double tempCelsius, tempFahrenheit;
    JTextField textCelsius, textFahrenheit;
    JButton buttonConvert;
    JLabel labelCelsius, labelFahrenheit;
    ButtonGroup buttonGroupSize;
    JRadioButton radioButtonCelsiusToFarenheit, radioButtonFarenheitToCelsius;

    public CelsiusToFarenheit() {
        setSize(400, 400);
        setTitle("Przeliczanie C na F");
        setLayout(null);

        labelCelsius = new JLabel("Stopnie Celsiusza:");
        labelCelsius.setBounds(40, 20, 150, 20);
        add(labelCelsius);
        textCelsius = new JTextField(" ");
        textCelsius.setBounds(170, 20, 150, 20);
        add(textCelsius);
        textCelsius.addActionListener(this);
        textCelsius.setToolTipText("temperaturę w stopniach Celsiusza");

        labelFahrenheit = new JLabel("Stopnie Fahrenheita:");
        labelFahrenheit.setBounds(40, 50, 150, 20);
        add(labelFahrenheit);
        textFahrenheit = new JTextField(" ");
        textFahrenheit.setBounds(170, 50, 150, 20);
        add(textFahrenheit);
        textFahrenheit.addActionListener(this);
        textFahrenheit.setToolTipText("temperaturę w stopniach Fahrenheit");

        buttonConvert = new JButton("Konwertuj");
        buttonConvert.setBounds(30, 100, 100, 20);
        add(buttonConvert);
        buttonConvert.addActionListener(this);

        buttonGroupSize = new ButtonGroup();
        radioButtonCelsiusToFarenheit = new JRadioButton("Celsius to Fahrenheit", true);
        radioButtonCelsiusToFarenheit.setBounds(20, 150, 150, 20);
        buttonGroupSize.add(radioButtonCelsiusToFarenheit);
        add(radioButtonCelsiusToFarenheit);
        radioButtonCelsiusToFarenheit.addActionListener(this);

        radioButtonFarenheitToCelsius = new JRadioButton("Fahrenheit to Crlsius", false);
        radioButtonFarenheitToCelsius.setBounds(180, 150, 150, 20);
        buttonGroupSize.add(radioButtonFarenheitToCelsius);
        add(radioButtonFarenheitToCelsius);
        radioButtonFarenheitToCelsius.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object orgin = e.getSource();
        if (orgin == buttonConvert || orgin == textCelsius || orgin == textFahrenheit) {
            if (radioButtonCelsiusToFarenheit.isSelected()) {
                tempCelsius = Double.parseDouble(textCelsius.getText());
                tempFahrenheit = 32.0 + ((9.0 / 5.0) * tempCelsius);
//        wyswietlamy stopnie po przekształceniu z double na Stringa
                textFahrenheit.setText(String.valueOf(tempFahrenheit));
            } else if (radioButtonFarenheitToCelsius.isSelected()) {
                tempFahrenheit = Double.parseDouble(textFahrenheit.getText());
                tempCelsius = (tempFahrenheit - 32.0) * (5.0 / 9.);
                textCelsius.setText(String.valueOf(tempCelsius));
            }
        }
    }
}