package Projekt03.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class Menu extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JPopupMenu popupMenu;
    JMenu menuTools, menuPlick, menuOpcions, menuHelp;
    JMenuItem mOpen, mSave, mExit, mTools01, mTools02, mAbout, mOption01, mPopupCopy, mPopupPaste, mPopupConnect;
    JCheckBoxMenuItem chOption02;
    JTextArea notebook;
    JTextField textSearch;
    JScrollPane scrollPane;
    JButton buttonSearch, buttonChooseColor;
    String selectedText;
    JComboBox<String> comboBoxColor;

    public Menu() {
        setTitle("Demonstracja JMenuBar");
        setSize(800, 400);
        setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuPlick = new JMenu("Plik");
        menuBar.add(menuPlick);
        mOpen = new JMenuItem("Otwórz", 'O');
        menuPlick.add(mOpen);
        mOpen.addActionListener(this);

        mSave = new JMenuItem("Zapisz");
        menuPlick.add(mSave);
        mSave.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        mSave.addActionListener(this);

        mExit = new JMenuItem("Wyjście");
        menuPlick.addSeparator();
        menuPlick.add(mExit);
        mExit.addActionListener(this);
//        wyjscie skrótem klawiszowym
        mExit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
//        wyswietla opis nad miejscem
        mExit.setToolTipText("ctrl + X");

        menuTools = new JMenu("Narzedzia");
        menuBar.add(menuTools);
        mTools01 = new JMenuItem("Narzedzia 01");
        menuTools.add(mTools01);
//        włącza i wyłącza wlazeżności od wartości (boolean) aktywnosć menu
        mTools01.setEnabled(false);
        mTools02 = new JMenuItem("Narzedzia 02");
        menuTools.add(mTools02);
        mTools02.addActionListener(this);

        menuOpcions = new JMenu("Opcje");
        menuTools.add(menuOpcions);
        mOption01 = new JMenuItem("Opcja 1");
        menuOpcions.add(mOption01);
//        checkBox bedzie odznaczał i zaznaczał aktywność menu "Narzedzia 01"
        chOption02 = new JCheckBoxMenuItem("Opcja 2");
        menuOpcions.add(chOption02);
        chOption02.addActionListener(this);

//        Teorzy boks i przsówa go w prawą stronę
//        menuBar.add(Box.createHorizontalGlue());
        menuHelp = new JMenu("Pomoc");
        menuBar.add(menuHelp);
        mAbout = new JMenuItem("Informacje o programie");
        menuHelp.add(mAbout);
        mAbout.addActionListener(this);

        notebook = new JTextArea();
        scrollPane = new JScrollPane(notebook);
        scrollPane.setBounds(50, 50, 680, 200);
        add(scrollPane);

        textSearch = new JTextField();
        textSearch.setBounds(50, 280, 200, 20);
        add(textSearch);

        buttonSearch = new JButton("Szukaj");
        buttonSearch.setBounds(260, 280, 100, 20);
        add(buttonSearch);
        buttonSearch.addActionListener(this);

//        Menu kontekstowe ( kliknij prawym klawiszem myszy ) pojawi se menu na notatniku
        popupMenu = new JPopupMenu();
        notebook.setComponentPopupMenu(popupMenu);
        mPopupCopy = new JMenuItem("Kopiuj");
        mPopupCopy.addActionListener(this);
        popupMenu.add(mPopupCopy);
        mPopupPaste = new JMenuItem("Wklej");
        mPopupPaste.addActionListener(this);
        popupMenu.add(mPopupPaste);
        mPopupConnect = new JMenuItem("Dołącz");
        mPopupConnect.addActionListener(this);
        popupMenu.add(mPopupConnect);

//        menu rozwijalne do wyboru koloru
        comboBoxColor = new JComboBox<>();
        comboBoxColor.setBounds(370, 280, 100, 20);
        comboBoxColor.addItem("czarny");
        comboBoxColor.addItem("czerwony");
        comboBoxColor.addItem("zielony");
        comboBoxColor.addItem("niebieski");
        comboBoxColor.addItem("żółty");
        add(comboBoxColor);
        comboBoxColor.addActionListener(this);

//       przycisk wybierz kolor
        buttonChooseColor = new JButton("Kolor");
        buttonChooseColor.setBounds(480, 280, 100, 20);
        add(buttonChooseColor);
        buttonChooseColor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == mOpen) {
            JFileChooser fileChooserOpen = new JFileChooser();
            if (fileChooserOpen.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File fileOpen = fileChooserOpen.getSelectedFile();
//                JOptionPane.showMessageDialog(null,"Wybrany plik to "+ fileOpen.getAbsolutePath());
                try {
                    Scanner scanner = new Scanner(fileOpen);
                    while (scanner.hasNext())
                        notebook.append(scanner.nextLine() + "\n");
                } catch (FileNotFoundException exception) {
                    exception.printStackTrace();
                }
            }
        } else if (source == mSave) {
            JFileChooser fileChooserSave = new JFileChooser();
            if (fileChooserSave.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File fileSave = fileChooserSave.getSelectedFile();
//                JOptionPane.showMessageDialog(null, "Zapisany plik " + fileSave);
                try {
                    PrintWriter printWriterSave = new PrintWriter(fileSave);
                    Scanner scanner = new Scanner(notebook.getText());
                    while (scanner.hasNext())
                        printWriterSave.println(scanner.nextLine() + "\n");
                    printWriterSave.close();
                } catch (FileNotFoundException exception) {
                    exception.printStackTrace();
                }
            }
        } else if (source == mExit) {
            int answer = 0;
            JOptionPane.showMessageDialog(null, "Czy napewno?", "Exit",
                    JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                dispose();
            } else if (answer == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Wiedziałem...");
            } else if (answer == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Tak nie robimy",
                        "Tytuł", JOptionPane.WARNING_MESSAGE);
            }
        } else if (source == chOption02) {
            if (chOption02.isSelected())
                mTools01.setEnabled(true);
            else if (!chOption02.isSelected())
                mTools01.setEnabled(false);
        } else if (source == mAbout) {
//            Wywołuje okno dialogowe  / null - okno wyświetla się srodku ekranu / this - oko wyswetla się
//            na środku ekranu programu
            JOptionPane.showMessageDialog(null,
                    "Program ten powstaje w celu nauki budowy menu", "Tytuł",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (source == mTools02) {
            String sMetry = JOptionPane.showInputDialog("Podaj długośc w metrach");
            double metry = Double.parseDouble(sMetry);
            double stopy = metry / 0.3048;
//            %.2 wyswietli się łąncuch cyfr z dwoma miejscami po przecinku
            String sStopy = String.format("%.2f", stopy);
            JOptionPane.showMessageDialog(null, metry + " metrów = " + sStopy + " stup");
        } else if (source == buttonSearch) {
            String notebookText = notebook.getText();
            String notebookSearch = textSearch.getText();
            StringBuilder notebookWonted = new StringBuilder(" ");
            int numerWonted = 0;
            int index;
            int startIndex = 0;
            while ((index = notebookText.indexOf(notebookSearch, startIndex)) != -1) {
                startIndex = index + notebookSearch.length();
                numerWonted++;
//                znajdź ile razy "szukane" wystapiło wtekscie i na których pozycjach
                notebookWonted.append(", ").append(index);
            }
            JOptionPane.showMessageDialog(null, notebookSearch + " wystopiło " + numerWonted +
                    " razy :" + notebookWonted);
        } else if (source == mPopupCopy) {
            selectedText = notebook.getSelectedText();
        } else if (source == mPopupPaste) {
            notebook.insert(selectedText, notebook.getCaretPosition());
        } else if (source == mPopupConnect) {
            notebook.append("\n" + selectedText);

//            wybór kolorów comboBoxColor
        } else if (source == comboBoxColor) {
            String color = Objects.requireNonNull(comboBoxColor.getSelectedItem()).toString();
            switch (color) {
                case "zielony" -> notebook.setForeground(Color.GREEN);
                case "czarny" -> notebook.setForeground(Color.BLACK);
                case "czerwony" -> notebook.setForeground(Color.RED);
                case "żółty" -> notebook.setForeground(Color.YELLOW);
                case "niebieski" -> notebook.setForeground(Color.BLUE);
           }
//           wybierz kolor z patety kolorów systemowych
        }else if (source == buttonChooseColor){
            Color chooseColor = JColorChooser.showDialog(null,"Wybór koloru", Color.RED);
            notebook.setForeground(chooseColor);
        }

    }
}

