package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JPizza extends JFrame implements ItemListener {
    int[] sizeCosts = {7, 9, 11, 14};
    int sizeNum;
    int Price;
    int totalPrice;
    int toppingNum;
    int[] toppingCosts = {0, 1, 1, 1, 1};
    int toppingPrice;
    String output;
    JComboBox size = new JComboBox();
    JComboBox toppings = new JComboBox();
    JLabel cost = new JLabel("Pizza Price $7");

    JPizza() {
        super("menu");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        size.addItem("small");
        size.addItem("medium");
        size.addItem("large");
        size.addItem("extra large");
        toppings.addItem("cheese");
        toppings.addItem("sausage");
        toppings.addItem("onion");
        toppings.addItem("olives");
        toppings.addItem("salami");
        add(size);
        size.addItemListener(this);
        add(toppings);
        toppings.addItemListener(this);
        add(cost);
    }

    public static void main(String[] args) {
        JFrame frame = new JPizza();
        frame.setVisible(true);
        frame.setSize(400, 200);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        toppingNum = toppings.getSelectedIndex();
        toppingPrice = toppingCosts[toppingNum];
        sizeNum = size.getSelectedIndex();
        Price = sizeCosts[sizeNum];

        totalPrice = Price + toppingPrice;
        output = "Pizza Price $" + totalPrice;
        cost.setText(output);
    }
}
