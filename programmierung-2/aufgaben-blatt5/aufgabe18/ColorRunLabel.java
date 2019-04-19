package programmiern2.blatt5.aufgabe18;

import javax.swing.*;
import java.awt.*;

public class ColorRunLabel extends JLabel implements Runnable {
    private Thread t = new Thread(this);
    private Boolean flag;
    public ColorRunLabel(Color c) {
        setOpaque(true);
        setBackground(c);
        setFont(new Font("Arial", Font.BOLD, 50));
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
    }

    public void start() {
        flag = true;
        t.start();
    }

    public void stop() {
        flag = false;
    }

    @Override
    public void run() {
        while(flag) {
            this.setText((Integer.toString((int)(Math.random()*10))));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
        }
    }
}
