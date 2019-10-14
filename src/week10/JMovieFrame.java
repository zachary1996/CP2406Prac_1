package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {
    JButton button1 = new JButton("North to Alaska");
    JButton button2 = new JButton("South Pacific");
    JButton button3 = new JButton("heroes of the east");
    JButton button4 = new JButton("West of Thunder");
    JButton button5 = new JButton("The Center");


    JMovieFrame() {
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(button1, BorderLayout.NORTH);
        button1.setPreferredSize(new Dimension(70, 100));
        add(button2, BorderLayout.SOUTH);
        button2.setPreferredSize(new Dimension(70, 100));
        add(button3, BorderLayout.EAST);
        add(button4, BorderLayout.WEST);
        add(button5, BorderLayout.CENTER);
        button5.setPreferredSize(new Dimension(70, 100));
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JMovieFrame();
        frame.setSize(800, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button1) {
            button1.setText("Starring Stewart Granger\n released in 1960");
        } else if (source == button2) {
            button2.setText("Starring Mitzi Gaynor\n released in 1958");
        } else if (source == button3) {
            button3.setText("Starring Gorden liu\n released in 1978");
        } else if (source == button4) {
            button4.setText("Starring michael worth\n released in 1899");
        } else
            button5.setText("Starring Matt Cici\n released in 2015");
    }
}
