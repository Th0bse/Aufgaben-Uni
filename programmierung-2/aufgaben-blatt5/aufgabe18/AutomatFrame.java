package programmiern2.blatt5.aufgabe18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomatFrame extends JFrame {
    Container c;
    ColorRunLabel c1;
    ColorRunLabel c2;
    ColorRunLabel c3;
    StartStopButton s1;
    StartStopButton s2;
    StartStopButton s3;

    public AutomatFrame() {
        c = getContentPane();
        setLayout(new GridLayout(2,3));
        c1 = new ColorRunLabel(Color.RED);
        c2 = new ColorRunLabel(Color.YELLOW);
        c3 = new ColorRunLabel(Color.GREEN);
        s1 = new StartStopButton(Color.RED);
        s2 = new StartStopButton(Color.YELLOW);
        s3 = new StartStopButton(Color.GREEN);
        s1.addActionListener(new EventHandler(s1,c1));
        s2.addActionListener(new EventHandler(s2,c2));
        s3.addActionListener(new EventHandler(s3,c3));
        add(c1);
        add(c2);
        add(c3);
        add(s1);
        add(s2);
        add(s3);
        setSize(600,200);
    }

    class EventHandler implements ActionListener {
        StartStopButton s;
        ColorRunLabel c;

        public EventHandler(StartStopButton s, ColorRunLabel c) {
            this.s = s;
            this.c = c;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (s.isStart()) {
                c.start();
                s.switchText();
            } else {
                c.stop();
                s.switchText();
            }
        }
    }

    public static void main(String[] args) {
        AutomatFrame tmp = new AutomatFrame();
        tmp.setVisible(true);
    }
}
