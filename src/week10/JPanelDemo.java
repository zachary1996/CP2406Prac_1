package week10;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFlexiblePanel(Color.RED, Color.ORANGE, new Font("Times New Roman", Font.BOLD, 40), "hello");
        frame.setSize(400, 100);
    }
}
