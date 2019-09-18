package week6;

import javax.swing.*;

public class CarCareChoice {
    public static void main(String[] args) {
        String entry;
        char[] services = {'A', 'B', 'C', 'D', 'a', 'b', 'c', 'd'};
        int[] prices = {25, 22, 15, 5};
        char service;
        int x, ser = 99;
        String prompt = "Please select a service\n" +
                "Our service's are:\n" + "A - An oil change\n" +
                "B - A tire rotation\n" +
                "C - A battery check\n" +
                "D - A brake inspection\n" +
                "Enter services letter";
        entry = JOptionPane.showInputDialog(null, prompt);
        service = entry.charAt(0);
        for (x = 0; x < services.length; ++x)
            if (service == services[x])
                ser = x;
        if (ser == 99)
            JOptionPane.showMessageDialog(null,
                    "Invalid floor plan code entered");
        else {
            if (ser >= services.length / 2)
                ser = ser - 4;
            JOptionPane.showMessageDialog(null, "Model " +
                    service + " is priced at only $" +
                    prices[ser] + ".00");
        }
    }
}
