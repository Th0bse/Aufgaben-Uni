package programmiern2.blatt5.aufgabe19;

import javax.swing.*;
import java.awt.*;

public class ColorRunButton extends JButton implements Runnable {
    Thread t = new Thread(this);
    boolean running = false;
    boolean zeigtBuchstabe = true;

    public ColorRunButton() {
        setBackground(Color.WHITE);
        setFont(new Font("Arial", Font.BOLD, 50));
        setText("  ");
    }

    public void change(boolean z) {
        this.zeigtBuchstabe = z;
        if (running) {
            running = false;
        } else {
            running = true;
            new Thread(this).start();

        }
    }

    @Override
    public void run() {
        String s;
        while(true) {
            if (!running) {
                break;
            }
            if (zeigtBuchstabe) {
                setText(Character.toString((char)(((int)(Math.random()*10))+65)));
            } else {
                setText(Integer.toString((int)(Math.random()*10)));
            }
        }
    }
}
