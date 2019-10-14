package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorFrame extends JFrame implements ActionListener {
    int count = 1;
    JButton button1 = new JButton("Color change");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    JColorFrame() {
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1, BorderLayout.PAGE_START);
        panel1.setPreferredSize(new Dimension(1, 120));
        add(panel2, BorderLayout.PAGE_END);
        panel2.setPreferredSize(new Dimension(1, 120));
        add(panel3, BorderLayout.LINE_START);
        panel3.setPreferredSize(new Dimension(120, 1));
        add(panel4, BorderLayout.LINE_END);
        panel4.setPreferredSize(new Dimension(120, 1));
        add(button1, BorderLayout.CENTER);

        button1.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JColorFrame();
        frame.setSize(400, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (count == 1) {
            panel1.setBackground(Color.RED);
            count += 1;
        } else if (count == 2) {
            panel2.setBackground(Color.YELLOW);
            count += 1;
        } else if (count == 3) {
            panel3.setBackground(Color.GREEN);
            count += 1;
        } else if (count == 4) {
            panel4.setBackground(Color.ORANGE);
            count += 1;
        } else {
            panel1.setBackground(Color.WHITE);
            panel2.setBackground(Color.WHITE);
            panel3.setBackground(Color.WHITE);
            panel4.setBackground(Color.WHITE);
            count = 1;
        }
        repaint();
    }
}
