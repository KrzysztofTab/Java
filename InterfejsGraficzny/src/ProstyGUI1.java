import javax.swing.*;

public class ProstyGUI1 {
    public static void main(String[] args) {
//        tworzymy ramkę
        JFrame ramka = new JFrame();

//        tworzymy przycisk z tekstem
        JButton przycisk = new JButton("Kliknij mnie");

//        Ten wiersz kodu zapewnia, że program zostanie zakończony bezpośrednio po zamknięciu okna.
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Dodaj przycisk do panelu zawartości okna.
        ramka.getContentPane().add(przycisk);

//        określ wielkosć ramki w pikselach
        ramka.setSize(300, 300);

//        W końcu określ, że ramka ma być widoczna!! (Jeśli zapomnisz o tym wierszu
//        kodu, to po uruchomieniu programu na ekranie nic się nie pojawi).
        ramka.setVisible(true);
    }
}
