package BeepPrintExample;

import java.awt.*;

public class BeepTask implements Runnable {
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}
