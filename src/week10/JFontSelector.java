package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {
    int size = 16;
    boolean clicked = true;
    JButton button1 = new JButton("Arial");
    JButton button2 = new JButton("Impact");
    JButton button3 = new JButton("Times New Roman");
    JButton button4 = new JButton("Courier New");
    JButton button5 = new JButton("Georgia");
    JButton fontSize = new JButton("Change font size");
    JLabel demo = new JLabel("Font", SwingConstants.CENTER);
    JPanel panel1 = new JPanel(new GridLayout(5, 1));
    JPanel panel2 = new JPanel(new GridLayout(2, 1));

    JFontSelector() {
        demo.setFont(new Font("Dialog", Font.PLAIN, size));
        setLayout(new GridLayout(1, 2));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        add(panel2);
        panel1.add(button1);
        button1.addActionListener(this);
        panel1.add(button2);
        button2.addActionListener(this);
        panel1.add(button3);
        button3.addActionListener(this);
        panel1.add(button4);
        button4.addActionListener(this);
        panel1.add(button5);
        button5.addActionListener(this);
        panel2.add(demo);
        panel2.add(fontSize);
        fontSize.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFontSelector();
        frame.setSize(400, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == fontSize && clicked) {
            size = 32;
            demo.setFont(getFont().deriveFont(Font.PLAIN, size));
            clicked = false;
        } else if (source == fontSize) {
            size = 10;
            demo.setFont(getFont().deriveFont(Font.PLAIN, size));
            clicked = true;
        }
        if (source == button1) {
            demo.setFont(new Font("Arial", Font.PLAIN, size));
        } else if (source == button2) {
            demo.setFont(new Font("Impact", Font.PLAIN, size));
        } else if (source == button3) {
            demo.setFont(new Font("Times New Roman", Font.PLAIN, size));
        } else if (source == button4) {
            demo.setFont(new Font("Courier New", Font.PLAIN, size));
        } else {
            demo.setFont(new Font("Georgia", Font.PLAIN, size));
        }

        repaint();
    }
}
