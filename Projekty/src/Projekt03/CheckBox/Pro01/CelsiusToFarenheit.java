package Projekt03.CheckBox.Pro01;

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

        checkBoxBigLeters = new JCheckBox("Wielkie litery");
        checkBoxBigLeters.setBounds(150, 100, 150, 20);
        add(checkBoxBigLeters);
        checkBoxBigLeters.addActionListener(this);
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
        } else if (orgin == checkBoxBigLeters) {
            if (checkBoxBigLeters.isSelected()) {
                textFahrenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
            } else {
                textFahrenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
            }
        }
    }
}
