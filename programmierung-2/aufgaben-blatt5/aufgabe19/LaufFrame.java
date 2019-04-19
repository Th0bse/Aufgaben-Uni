package programmiern2.blatt5.aufgabe19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaufFrame extends JFrame {
    ColorRunButton c1,c2;
    JComboBox<String> combo = new JComboBox<>();
    JCheckBox check = new JCheckBox("Buchstaben");

    public LaufFrame() {
        setLayout(new FlowLayout());
        setSize(200,200);
        c1 = new ColorRunButton();
        c2 = new ColorRunButton();
        combo.addItem("schwarze Schrift");
        combo.addItem("graue Schrift");
        c1.addActionListener(new EventListener(c1));
        c2.addActionListener(new EventListener(c2));
        add(c1);
        add(c2);
        add(combo);
        add(check);
    }

    class EventListener implements ActionListener {
        ColorRunButton crb;

        public EventListener(ColorRunButton crb) {
            this.crb = crb;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (combo.getSelectedIndex()) {
                case 0:
                    crb.setForeground(Color.BLACK);
                    break;
                case 1:
                    crb.setForeground(Color.GRAY);
                    break;
            }
            crb.change(check.isSelected());
        }
    }

    public static void main(String[] args) {
        LaufFrame tmp = new LaufFrame();
        tmp.setVisible(true);
    }
}
