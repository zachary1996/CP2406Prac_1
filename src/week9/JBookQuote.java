package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote extends JFrame implements ActionListener {
    JButton button = new JButton("click");
    JLabel text = new JLabel("Not all those who wander are lost.");
    JLabel title = new JLabel();
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    FlowLayout flow = new FlowLayout();

    JBookQuote() {
        super("book quote");
        setLayout(flow);
        text.setFont(bigFont);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(text);
        add(button);
        add(title);
        button.addActionListener(this);

    }

    public static void main(String[] arguments) {
        JFrame frame = new JBookQuote();
        frame.setSize(400, 100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        title.setText("The lord of the rings");

    }


}
