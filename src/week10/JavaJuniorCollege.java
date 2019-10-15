package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJuniorCollege extends JFrame implements ActionListener {
    JMenuBar mainBar = new JMenuBar();
    JMenu menu1 = new JMenu("campus");
    JMenu menu2 = new JMenu("major fields");
    JMenu menu3 = new JMenu("activities");
    JMenuItem cairnsCampus = new JMenuItem("Cairns campus");
    JMenuItem townsvilleCampus = new JMenuItem("Townsville campus");
    JMenuItem dentistry = new JMenuItem("Dentistry");
    JMenuItem engineering = new JMenuItem("Engineering");
    JMenuItem baseball = new JMenuItem("baseball");
    JMenuItem photography = new JMenuItem("Photography");
    JTextArea textField = new JTextArea();

    JavaJuniorCollege() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);
        menu1.add(cairnsCampus);
        menu1.add(townsvilleCampus);
        menu2.add(dentistry);
        menu2.add(engineering);
        menu3.add(baseball);
        menu3.add(photography);
        cairnsCampus.addActionListener(this);
        townsvilleCampus.addActionListener(this);
        dentistry.addActionListener(this);
        engineering.addActionListener(this);
        baseball.addActionListener(this);
        photography.addActionListener(this);
        add(textField);
    }

    public static void main(String[] args) {
        JFrame frame = new JavaJuniorCollege();
        frame.setSize(650, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String text = "  ";
        if (source == cairnsCampus)
            text = "cairns campus \nLocation: 14-88 McGregor Road\nSmithfield, Cairns, QLD 4878 " +
                    "\n\nnumber: (07) 4232 1111";
        else if (source == townsvilleCampus)
            text = "Townsville campus \nLocation: City Arcade, 383 Flinders Street\n" +
                    "Townsville, QLD 4810 \n\nnumber: (07) 6263 7832";
        else if (source == dentistry)
            text = "Course code: 73010 \n\nCourse type:This course is accredited by the Australian Dental Council (ADC). " +
                    "\nStudents enrolled in this degree will be registered with the Dental Board of Australia through the " +
                    "\nAustralian Health Practitioner Regulation Agency (AHPRA) for the duration of their program of study or " +
                    "\nuntil they are no longer enrolled. Graduates will be eligible for professional registration with dental " +
                    "\nboards in Australia and New Zealand.";
        else if (source == engineering)
            text = "Course code: 116309 \n\nCourse type: This course is accredited by Engineers Australia. Graduates are immediately " +
                    "\neligible for graduate membership of Engineers Australia and, following a period of professional practice, may " +
                    "\nbecome Chartered Professional Engineers (CPEng).";
        else if (source == baseball)
            text = "join the unis baseball team";
        else
            text = "join the unis photography club";
        textField.setText(text);
        repaint();
    }

}
