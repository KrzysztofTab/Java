package ButtonFrame;

import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionFrame();
            }
        });
    }
}
