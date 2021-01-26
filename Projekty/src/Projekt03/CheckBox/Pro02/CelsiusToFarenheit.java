package Projekt03.CheckBox.Pro02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFarenheit extends JFrame implements ActionListener {
    JTextField textCelsius, textFahrenheit;
    JButton buttonConvert;
    JCheckBox checkBoxBigLeters;
    JLabel labelCelsius, labelFahrenheit;
    ButtonGroup buttonGroupSize;
    JRadioButton radioButtonSmall, radioButtonMedium, radioButtonBig;

    public CelsiusToFarenheit() {
        setSize(300, 300);
        setTitle("Przeliczanie C na F");
        setLayout(null);

        labelCelsius = new JLabel("Stopnie Celsiusza:");
        labelCelsius.setBounds(40, 20, 150, 20);
        add(labelCelsius);
        textCelsius = new JTextField(" ");
        textCelsius.setBounds(170, 20, 50, 20);
        add(textCelsius);
        textCelsius.addActionListener(this);
        textCelsius.setToolTipText("Podaj temperaturę w stopniach Celsiusza");

        labelFahrenheit = new JLabel("Stopnie Fahrenheita:");
        labelFahrenheit.setBounds(40, 50, 150, 20);
        add(labelFahrenheit);
        textFahrenheit = new JTextField(" ");
        textFahrenheit.setBounds(170, 50, 50, 20);
        add(textFahrenheit);

        buttonConvert = new JButton("Konwertuj");
        buttonConvert.setBounds(30, 100, 100, 20);
        add(buttonConvert);
        buttonConvert.addActionListener(this);

        buttonGroupSize = new ButtonGroup();
        radioButtonSmall = new JRadioButton("Mały", false);
        radioButtonSmall.setBounds(20, 150, 60, 20);
        buttonGroupSize.add(radioButtonSmall);
        add(radioButtonSmall);
        radioButtonSmall.addActionListener(this);

        radioButtonMedium = new JRadioButton("Średni", true);
        radioButtonMedium.setBounds(90, 150, 80, 20);
        buttonGroupSize.add(radioButtonMedium);
        add(radioButtonMedium);
        radioButtonMedium.addActionListener(this);

        radioButtonBig = new JRadioButton("Duży", false);
        radioButtonBig.setBounds(170, 150, 80, 20);
        buttonGroupSize.add(radioButtonBig);
        add(radioButtonBig);
        radioButtonBig.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object orgin = e.getSource();
        if (orgin == buttonConvert || orgin == textCelsius) {
//        pobieramy z pola teksu doubule i zmieniamy na String
            double tempCelsius = Double.parseDouble(textCelsius.getText());
            double tempFahrenheit = 32.0 + ((9.0 / 5.0) * tempCelsius);
//        wyswietlamy stopnie po przekształceniu z double na Stringa
            textFahrenheit.setText(String.valueOf(tempFahrenheit));
        } else if (orgin == radioButtonSmall) {
            textFahrenheit.setFont(new Font("SansSerif", Font.PLAIN, 10));
        } else if (orgin == radioButtonMedium) {
            textFahrenheit.setFont(new Font("SansSerif", Font.PLAIN, 16));
        } else if (orgin == radioButtonBig) {
            textFahrenheit.setFont(new Font("SansSerif", Font.BOLD, 20));
        }
    }
}
