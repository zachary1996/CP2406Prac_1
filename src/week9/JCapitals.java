package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCapitals extends JFrame implements ItemListener {
    String[] capitalList = new String[]{"Canberra", "Washington DC", "Tokyo", "London", "Ottawa", "Berlin", "Rome"};
    JComboBox country = new JComboBox();
    JLabel capitals = new JLabel();

    JCapitals() {
        super("capitals");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        country.addItem("Australia");
        country.addItem("America");
        country.addItem("japan");
        country.addItem("Britain");
        country.addItem("Canada");
        country.addItem("Germany");
        country.addItem("Italy");
        country.addItemListener(this);
        add(country);
        add(capitals);
        capitals.setText("The capital is Canberra");
    }

    public static void main(String[] args) {
        JFrame frame = new JCapitals();
        frame.setVisible(true);
        frame.setSize(300, 100);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        capitals.setText("The capital is " + capitalList[country.getSelectedIndex()]);

    }

}
