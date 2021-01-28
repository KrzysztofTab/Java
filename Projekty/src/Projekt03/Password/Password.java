package Projekt03.Password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password extends JFrame implements ActionListener {
    JPasswordField passwordField;

    public Password() {
        setTitle("Hasło");
        setSize(400, 400);
        setLayout(null);

        passwordField = new JPasswordField();
        passwordField.setBounds(50, 50, 250, 20);
//        zmiana pokazujacych się znaków
        passwordField.setEchoChar('*');
        add(passwordField);
        passwordField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, String.valueOf(passwordField.getPassword()));

    }
}
