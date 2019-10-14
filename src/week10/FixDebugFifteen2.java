package week10;// Demonstrates layout positions
// using BorderLayout

import javax.swing.*;
import java.awt.*;

public class FixDebugFifteen2 extends JFrame {
    JButton nb = new JButton("Up    ");
    JButton sb = new JButton("Down  ");
    JButton eb = new JButton("Right ");
    JButton wb = new JButton("Left  ");
    JButton cb = new JButton("Center");
    Container con = null;

    public FixDebugFifteen2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = this.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(nb, BorderLayout.PAGE_START);
        con.add(sb, BorderLayout.PAGE_END);
        con.add(eb, BorderLayout.LINE_END);
        con.add(cb, BorderLayout.CENTER);
        con.add(wb, BorderLayout.LINE_START);
    }

    public static void main(String[] args) {
        FixDebugFifteen2 f = new FixDebugFifteen2();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}