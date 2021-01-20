package FirstFrame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("Hello Word");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        określ wielkosć ramki w pikselach
        setSize(300, 300);
//        okresli połozenie ramki
        setLocation(50,50);
//        wyswietli ramkę (true)
        setLayout(new FlowLayout(FlowLayout.CENTER));


        add(new JButton("Przycisk 1"));
        add(new JButton("Przycisk 2"));
        add(new JButton("Przycisk 3"));

        setVisible(true);
    }
}
