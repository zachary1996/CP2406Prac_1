package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovingFrame extends JFrame implements ActionListener {
    int count = 1;
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JLabel label = new JLabel("why hello there", SwingConstants.CENTER);
    JButton button = new JButton("press me");

    JMovingFrame() {
        setVisible(true);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(button);
        button.addActionListener(this);
        panel1.add(label);

    }

    public static void main(String[] args) {
        JFrame frame = new JMovingFrame();
        frame.setSize(800, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (count == 1) {
            panel2.add(label);
        } else if (count == 2) {
            panel3.add(label);
        } else if (count == 3) {
            panel4.add(label);
        } else if (count == 4) {
            panel5.add(label);
        } else {
            panel1.add(label);
            count = 0;
        }
        count += 1;
        repaint();
    }
}
