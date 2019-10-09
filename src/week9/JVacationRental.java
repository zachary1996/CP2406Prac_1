package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JVacationRental extends JFrame implements ActionListener {
    ButtonGroup location = new ButtonGroup();
    JRadioButton parkSide = new JRadioButton("Park side");
    JRadioButton poolSide = new JRadioButton("Pool side");
    JRadioButton lakeSide = new JRadioButton("Lake side");
    ButtonGroup numOfBedrooms = new ButtonGroup();
    JRadioButton oneBedroom = new JRadioButton("1 bedroom");
    JRadioButton twoBedroom = new JRadioButton("2 bedroom's");
    JRadioButton threeBedroom = new JRadioButton("3 bedroom's");
    ButtonGroup meals = new ButtonGroup();
    JRadioButton meal = new JRadioButton("Included meal");
    JRadioButton noMeal = new JRadioButton("No meal");
    JLabel totalPrice = new JLabel("0");
    int price;

    JVacationRental() {
        super("rental");
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(parkSide);
        parkSide.addActionListener(this);
        add(poolSide);
        poolSide.addActionListener(this);
        add(lakeSide);
        lakeSide.addActionListener(this);
        add(oneBedroom);
        oneBedroom.addActionListener(this);
        add(twoBedroom);
        twoBedroom.addActionListener(this);
        add(threeBedroom);
        threeBedroom.addActionListener(this);
        add(meal);
        meal.addActionListener(this);
        add(noMeal);
        noMeal.addActionListener(this);
        add(totalPrice);
        location.add(parkSide);
        location.add(poolSide);
        location.add(lakeSide);
        numOfBedrooms.add(oneBedroom);
        numOfBedrooms.add(twoBedroom);
        numOfBedrooms.add(threeBedroom);
        meals.add(meal);
        meals.add(noMeal);

    }

    public static void main(String[] args) {
        JFrame frame = new JVacationRental();
        frame.setVisible(true);
        frame.setSize(400, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        price = 0;
        if (parkSide.isSelected())
            price += 600;
        if (poolSide.isSelected())
            price += 750;
        if (lakeSide.isSelected())
            price += 825;
        if (oneBedroom.isSelected())
            price += 75;
        if (twoBedroom.isSelected())
            price += 150;
        if (threeBedroom.isSelected())
            price += 225;
        if (meal.isSelected())
            price += 200;
        totalPrice.setText("Total: " + price);
    }
}
