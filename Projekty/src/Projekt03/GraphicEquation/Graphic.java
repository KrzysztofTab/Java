package Projekt03.GraphicEquation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphic extends JFrame implements ActionListener {
    private JTextField textA, textB, textC, textResult;
    private JLabel labelA, labelB, labelC;
    private JButton buttonExit, buttonAnswer;

    public Graphic() {
        setSize(370, 350);
        setTitle("Rozwiązywanie równania kwadratowego");
        setLayout(null);

        labelA = new JLabel("a", JLabel.RIGHT);
        labelA.setBounds(20, 50, 20, 20);
        add(labelA);
        textA = new JTextField();
        textA.setBounds(50, 50, 50, 20);
        add(textA);
        textA.setToolTipText("Podaj wartość 'a'");

        labelB = new JLabel("b", JLabel.RIGHT);
        labelB.setBounds(120, 50, 20, 20);
        add(labelB);
        textB = new JTextField();
        textB.setBounds(150, 50, 50, 20);
        add(textB);
        textB.setToolTipText("Podaj wartość 'b'");

        labelC = new JLabel("c", JLabel.RIGHT);
        labelC.setBounds(220, 50, 20, 20);
        add(labelC);
        textC = new JTextField();
        textC.setBounds(250, 50, 50, 20);
        add(textC);
        textC.setToolTipText("Podaj wartość 'c'");

        buttonAnswer = new JButton("Rozwiąż równanie");
        buttonAnswer.setBounds(50, 100, 250, 20);
        add(buttonAnswer);
        buttonAnswer.addActionListener(this);

        buttonExit = new JButton("EXIT");
        buttonExit.setBounds(230, 230, 70, 20);
        add(buttonExit);
        buttonExit.addActionListener(this);

        textResult = new JTextField();
        textResult.setBounds(10, 150, 340, 40);
        add(textResult);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonExit) {
            dispose();
        } else if (source == buttonAnswer) {
            int typedValueA = Integer.parseInt(textA.getText());
            int typedValueB = Integer.parseInt(textB.getText());
            int typedValueC = Integer.parseInt(textC.getText());
            SquareEquation squareEquation = new SquareEquation(typedValueA,typedValueB,typedValueC);
            String result = squareEquation.solution();
            textResult.setText(result);
    }
}}
