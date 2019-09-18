package week6;

import javax.swing.*;

public class CarCareChoice {
    public static void main(String[] args) {
        String entry;
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        int x, ser = 99;
        String prompt = "Please select a service\n" +
                "Our service's are:\n" + "1 - oil change\n" +
                "2 - tire rotation\n" +
                "3 - battery check\n" +
                "4 - brake inspection\n" +
                "Enter service";
        entry = JOptionPane.showInputDialog(null, prompt);
        for (x = 0; x < services.length; ++x)
            if (entry.regionMatches(0, services[x], 0, 3))
                ser = x;
        if (ser == 99)
            JOptionPane.showMessageDialog(null,
                    "Invalid service entered");
        else {
            JOptionPane.showMessageDialog(null, "The " +
                    services[ser] + " service is priced at $" +
                    prices[ser] + ".00");
        }
    }
}
