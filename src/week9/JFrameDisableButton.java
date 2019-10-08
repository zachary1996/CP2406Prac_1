package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    int count = 1;
    JButton button = new JButton("press me");
    JLabel response = new JLabel();

    JFrameDisableButton() {
        super("disable button");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(button);
        add(response);
        button.addActionListener(this);
    }

    public static void main(String[] arguments) {
        JFrame frame = new JFrameDisableButton();
        frame.setSize(250, 100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (count == 8) {
            button.setEnabled(false);
            response.setText("That's enough!");
        } else
            count += 1;
    }
}
