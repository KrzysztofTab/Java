package KeyFrame;

import java.awt.*;

public class KeyTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Key();
            }
        });
    }
}
