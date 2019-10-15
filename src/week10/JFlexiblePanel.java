package week10;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("", SwingConstants.CENTER);

    JFlexiblePanel(Color color1, Color color2, Font font, String msg) {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        panel.add(label);
        panel.setBackground(color1);
        label.setForeground(color2);
        label.setFont(font);
        label.setText(msg);
    }
}
