package week5;

import javax.swing.*;

public class EvenEntryLoop {

    public static void main(String[] args) {
        String usersChoiceString = JOptionPane.showInputDialog(null,
                "Enter an even number\n Enter 999 to stop");
        int usersChoice = Integer.parseInt(usersChoiceString);
        while (usersChoice != 999) {
            if (usersChoice % 2 != 0) {
                JOptionPane.showMessageDialog(null, "this is not an even number");
                usersChoiceString = JOptionPane.showInputDialog(null,
                        "Enter an even number\n Enter 999 to stop");
                usersChoice = Integer.parseInt(usersChoiceString);
            } else {
                JOptionPane.showMessageDialog(null, "Good job!");
                usersChoiceString = JOptionPane.showInputDialog(null,
                        "Enter an even number\n Enter 999 to stop");
                usersChoice = Integer.parseInt(usersChoiceString);
            }
        }
    }
}
