package week8;

import javax.swing.*;

public class OnlineNewsPaperSubscription extends NewsPaperSubscription {

    @Override
    public void setAddress() {
        super.address = JOptionPane.showInputDialog(null, "Enter email");
        for (int i = 0; i < address.length(); i++) {
            char symbol = address.charAt(i);
            if (symbol == '@')
                super.rate = 9;

        }
        if (super.rate != 9) {
            System.out.println("no @ symbol was found");
            super.rate = 0.00;
        }
    }
}
