package programmiern2.blatt5.aufgabe18;

import javax.swing.*;
import java.awt.*;

public class StartStopButton extends JButton {
    public StartStopButton(Color c) {
        setText("START");
        setBackground(c);
        setOpaque(true);
        setFont(new Font("Arial", Font.PLAIN, 25));
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
    }

    public Boolean isStart() {
        return this.getText().equalsIgnoreCase("START");
    }

    public void switchText() {
        if (isStart()) {
            this.setText("STOP");
        } else {
            this.setText("START");
        }
    }
}
