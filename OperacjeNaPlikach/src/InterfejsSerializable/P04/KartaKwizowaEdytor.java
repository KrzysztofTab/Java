package InterfejsSerializable.P04;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class KartaKwizowaEdytor {
    private JTextArea pytanie;
    private JTextArea odpowiedz;
    private ArrayList<KartaKwizowa> listaKart;
    private JFrame ramka;

    public static void main(String[] args) {
        KartaKwizowaEdytor edytor = new KartaKwizowaEdytor();
        edytor.doDziela();
    }
    private void czyscKarte() {
        pytanie.setText("");
        odpowiedz.setText("");
        pytanie.requestFocus();
    }
    public void doDziela() {
// 		stworzenie i wyświetlenie graficznego interfejsu użytkownika
        ramka = new JFrame("Edytor kart kwizowych");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelGlowny = new JPanel();
        Font czcionkaDuza = new Font("sanserif", Font.BOLD, 24);

        pytanie = new JTextArea(6, 20);
        pytanie.setLineWrap(true);
        pytanie.setWrapStyleWord(true);
        pytanie.setFont(czcionkaDuza);

        JScrollPane przewijaniePyt = new JScrollPane(pytanie);
        przewijaniePyt.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        przewijaniePyt.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        odpowiedz = new JTextArea(6, 20);
        odpowiedz.setLineWrap(true);
        odpowiedz.setWrapStyleWord(true);
        odpowiedz.setFont(czcionkaDuza);

        JScrollPane przewijanieOdp = new JScrollPane(odpowiedz);
        przewijanieOdp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        przewijanieOdp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton przyciskNastepna = new JButton("Następna karta");

        listaKart = new ArrayList<KartaKwizowa>();

        JLabel etykietaPyt = new JLabel("Pytanie:");
        JLabel etykietaOdp = new JLabel("Odpowied: ");

        panelGlowny.add(etykietaPyt);
        panelGlowny.add(przewijaniePyt);
        panelGlowny.add(etykietaOdp);
        panelGlowny.add(przewijanieOdp);
        panelGlowny.add(przyciskNastepna);
        przyciskNastepna.addActionListener(new NastepnaKartaListener());
        JMenuBar menu = new JMenuBar();
        JMenu menuPlik = new JMenu("Plik");
        JMenuItem opcjaNowa = new JMenuItem("Nowy");

        JMenuItem opcjaZapisz = new JMenuItem("Zapisz");
        opcjaNowa.addActionListener(new NowyMenuListener());
        opcjaZapisz.addActionListener(new ZapiszMenuListener());
        menuPlik.add(opcjaNowa);
        menuPlik.add(opcjaZapisz);
        menu.add(menuPlik);
        ramka.setJMenuBar(menu);
        ramka.getContentPane().add(BorderLayout.CENTER, panelGlowny);
        ramka.setSize(500, 600);
        ramka.setVisible(true);
    }

//		Klasa wewnętrzna
//      Metoda jest wywoływana w chwili, gdy użytkownik kliknie przycisk Następna karta, co oznacza,
//		że użytkownik chce zapisać na liście bieżącą karteczkę kwizową i utworzyć następną.
    public class NastepnaKartaListener implements ActionListener {
        public void actionPerformed(ActionEvent zd) {
// 			dodanie bieżcej karteczki do listy i wyczyszczenie wielowierszowych pól tekstowych
            KartaKwizowa karta = new KartaKwizowa(pytanie.getText(), odpowiedz.getText());
            listaKart.add(karta);
            czyscKarte();
        }
    }

//      Klasa wewnętrzna
//		Metoda jest wywoływana, gdy użytkownik wybierze z menu Plik opcję Zapisz, co oznacza, że chce zapisać wszystkie
//		karteczki aktualnie dostępne na liście, tworząc z nich jeden „zbiór” (na przykład zbiór mechanika kwantowa,
//		zbiór gwiazdy Hollywood, zbiór Java górą i tak dalej)
    public class ZapiszMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent zd) {
// 			wyświetlenie okna dialogowego obsługi plików użytkownik może podać nazwę pliku i zapisać w nim zbiór karteczek
            KartaKwizowa karta = new KartaKwizowa(pytanie.getText(), odpowiedz.getText());
            listaKart.add(karta);
            JFileChooser plikDanych = new JFileChooser();
            plikDanych.showSaveDialog(ramka);
            zapiszPlik(plikDanych.getSelectedFile());

//			Ten fragment kodu wyświetla okno dialogowe do obsługi plików (o nazwie Save). Realizacja
//			programu zatrzymuje się na tym wierszu i jest wznawiana dopiero, gdy użytkownik
//			kliknie przycisk Save w oknie dialogowym. Cała obsługa okna dialogowego, wybieranie
//			pliku itp. są realizowane w całości w klasie JFileChooser! To naprawdę jest aż tak proste.
        }
    }
//		Klasa wewnętrzna
//		Metoda jest wywoływana, gdy użytkownik wybierze opcję Nowy z menu Plik, co oznacza,
//		że użytkownik chce utworzyć zupełnie nowy zbiór karteczek (zatem czyścimy listę karteczek
//		oraz pola tekstowe).
    public class NowyMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent zd) {
// 			wyczyszczenie listy karteczek oraz wielowierszowych pól tekstowych
            listaKart.clear();
            czyscKarte();
        }
    }
    public void zapiszPlik (File plik) {
// 		odczytanie każdego elementu listy karteczek i zapisanie w pliku tekstowym
// 		w sposób pozwalający na jego póniejsze odczytanie (czyli z jednoznacznymi separatorami
// 		pomiędzy poszczególnymi elementami pliku).
//		Ta metoda odpowiada za faktyczne zapisanie danych w pliku (i jest wywoływana przez
//		metodę obsługi zdarzeń ZapiszMenuListener). Jej argumentem jest obiekt File, reprezentujący
//		plik, który użytkownik zapisuje. Klasę Filec przedstawimy dokładniej na następnej stronie.
        try {
//				Łączymy strumień BufferedWriter z FileWriter, aby poprawić efektywność operacji zapisywania danych w pliku.
//				(Tym zagadnieniem zajmiemy się w dalszej części rozdziału).
            BufferedWriter pisarz = new BufferedWriter(new FileWriter(plik));
//				Pobieramy całą zawartość listy kart i zapisujemy je po kolei w pliku. Każda
//				karta jest zapisywana w nowym wierszu, pytanie jest oddzielane od odpowiedzi
//				znakiem „/”, a na końcu każdego wiersza umieszczamy znak nowego wiersza („\n”).
            for (KartaKwizowa karta : listaKart) {
                pisarz.write(karta.getPytanie() + "/");
                pisarz.write(karta.getOdpowiedz() + "\n");
            }
            pisarz.close();
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku kart!");
            ex.printStackTrace();
        }
    }
}
