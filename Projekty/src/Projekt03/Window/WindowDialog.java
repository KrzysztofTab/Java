package Projekt03.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowDialog extends JFrame implements ActionListener {
    PanelPassword panelPassword;
    JTextArea notebook;
    JScrollPane scrollPane;
    JButton buttonAddUser;

    public WindowDialog() {
        setTitle("Okno Dialogowe");
        setSize(400, 400);
        setLayout(null);

        notebook = new JTextArea();
//        po dojściu do końca lini wiersz bdzie się zawijać
        notebook.setWrapStyleWord(true);

        scrollPane = new JScrollPane(notebook);
        scrollPane.setBounds(5, 20, 375, 200);
        add(scrollPane);

        buttonAddUser = new JButton("Dodaj Użytkownika");
        buttonAddUser.setBounds(50, 250, 150, 20);
        add(buttonAddUser);
        buttonAddUser.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        jesli nie ma panelu hasłą to stwórz nowy
        if (panelPassword == null)
            panelPassword = new PanelPassword(this);
//        jesli jest to pokaż go
        panelPassword.setVisible(true);
        panelPassword.setFocus();

        if (panelPassword.isOk()) {
            notebook.append(panelPassword.getUser() + ", ");
            notebook.append(panelPassword.getPassword() + "\n");
        }
    }

    static class PanelPassword extends JDialog implements ActionListener {
        JLabel labelUser, labelPassword;
        JTextField textFieldUser;
        JPasswordField passwordField;
        JButton buttonOk, buttonCancel;
        boolean okData;

        public PanelPassword(JFrame owner) {
            super(owner, "Wprowadzanie hasłą", true);
            setSize(300, 200);
            setLayout(null);

            labelUser = new JLabel("Użytkownik", JLabel.RIGHT);
            labelUser.setBounds(0, 5, 100, 20);
            add(labelUser);

            textFieldUser = new JTextField();
            textFieldUser.setBounds(150, 5, 100, 20);
            add(textFieldUser);

            labelPassword = new JLabel("Hasło", JLabel.RIGHT);
            labelPassword.setBounds(0, 35, 100, 20);
            add(labelPassword);

            passwordField = new JPasswordField();
            passwordField.setBounds(150, 35, 100, 20);
            passwordField.setEchoChar('*');
            add(passwordField);

            buttonOk = new JButton("Ok");
            buttonOk.setBounds(10, 100, 100, 20);
            add(buttonOk);
            buttonOk.addActionListener(this);

            buttonCancel = new JButton("Cancel");
            buttonCancel.setBounds(150, 100, 100, 20);
            add(buttonCancel);
            buttonCancel.addActionListener(this);
        }

        public String getUser() {
            return textFieldUser.getText();
        }

        public String getPassword() {
            return  new String(passwordField.getPassword());
        }

        public boolean isOk() {
            return okData;
        }

        public void setFocus() {
            textFieldUser.requestFocusInWindow();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            okno dialogowe po wybraniu 'OK' lub 'Cancel' bedzie ukrywane
            Object variable = e.getSource();
            okData = variable == buttonOk;
            setVisible(false);

        }
    }
}
