package week8;

import javax.swing.*;

public class PhysicalNewsPaperSubscription extends NewsPaperSubscription {

    @Override
    public void setAddress() {
        super.address = JOptionPane.showInputDialog(null, "Enter address");
        char num = address.charAt(0);
        if (Character.isDigit(num))
            super.rate = 15;
        else {
            System.out.println("no number was found in the address");
            super.rate = 0.00;
        }

    }

}
