package week5;

import javax.swing.*;

public class CondoSales {

    public static void main(String[] args) {
        String usersChoiceString = JOptionPane.showInputDialog(null,
                "choose\n1 - park view\n2 - Golf course view" +
                        "\n3 - Lake view");
        int usersChoice = Integer.parseInt(usersChoiceString);
        double lakeViewCost = 210000;
        double golfViewCost = 170000;
        double parkViewCost = 150000;
        double cost;
        if (usersChoice == 1)
            cost = parkViewCost;
        else if (usersChoice == 2)
            cost = golfViewCost;
        else if (usersChoice == 3)
            cost = lakeViewCost;
        else
            cost = 0;
        if (cost > 0)
            usersChoiceString = JOptionPane.showInputDialog(null,
                    "garage or parking space?\n1 - garage\n2 - parking space");
        usersChoice = Integer.parseInt(usersChoiceString);
        final double garageCost = 5000;
        if (usersChoice == 1) {
            cost = cost + garageCost;
        }
        System.out.println("the cost is $" + cost);
    }
}
