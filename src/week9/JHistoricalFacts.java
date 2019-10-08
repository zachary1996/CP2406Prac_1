package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    int i = 0;
    JLabel fact1 = new JLabel("Turkeys Were Once Worshipped Like Gods");
    JLabel fact2 = new JLabel("Napoleon Was Once Attacked By a Horde of Bunnies");
    JLabel fact3 = new JLabel("Using Forks Used to Be Seen as Sacrilegious");
    JLabel fact4 = new JLabel("The Titanic‘s Owners Never Said the Ship Was “Unsinkable”");
    JLabel fact5 = new JLabel("Cleopatra Was Not Egyptian");
    JButton nextFact = new JButton(("next fact"));
    JLabel[] labelList = new JLabel[]{fact1, fact2, fact3, fact4, fact5};

    JHistoricalFacts() {
        super("historical facts");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(fact1, BorderLayout.PAGE_END);
        add(nextFact, BorderLayout.PAGE_START);
        nextFact.addActionListener(this);


    }

    public static void main(String[] arguments) {
        JFrame frame = new JHistoricalFacts();
        frame.setVisible(true);
        frame.setSize(400, 100);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (i == 4) {
            i = 0;
            remove(labelList[4]);
            add(fact1);
            revalidate();
            repaint();
        } else {
            add(labelList[i + 1]);
            remove(labelList[i]);
            revalidate();
            repaint();

            i += 1;
        }


    }
}
