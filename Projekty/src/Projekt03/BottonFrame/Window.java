package Projekt03.BottonFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Window extends JFrame implements ActionListener {
    JButton battonGiveDate, battonExit;
    JLabel labelPrintDate;

    //    konstruktor
    public Window() {
        setSize(300, 300);
        setTitle("My Window");
        setLayout(null);

//        tworzenie przycisku
        battonGiveDate = new JButton("Podaj datę");
        battonGiveDate.setBounds(40, 100, 100, 30);
//      dodawanie przycisku
        add(battonGiveDate);
//        batton jest źródłem zdażeń a słuchaczem jest ramka
        battonGiveDate.addActionListener(this);

        battonExit = new JButton("Wyjście");
        battonExit.setBounds(150, 100, 100, 30);
        add(battonExit);
        battonExit.addActionListener(this);

        labelPrintDate = new JLabel("Data:");
        labelPrintDate.setBounds(20,150,250,30);
//        definujemy kolor tekstu
        labelPrintDate.setForeground(new Color(0, 193,200));
//        definiujemy font
        labelPrintDate.setFont(new Font("SansSerif",Font.BOLD,16));
        add(labelPrintDate);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object orgin = e.getSource();
        if (orgin == battonGiveDate) {
//            wyswietla date w tamce i kowertuje frmatu daty na tekst
            labelPrintDate.setText(new Date().toString());
//            System.out.println(new Date());
        } else if (orgin == battonExit) {
            dispose();
        }
    }
}
