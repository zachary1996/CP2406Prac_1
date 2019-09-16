package week6;// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid

import javax.swing.*;

public class fixDebugEight1 {
    public static void main(String[] args) {
        char userCode;
        String entry, message;
        boolean found = false;
        char[] okayCodes = {'A', 'C', 'T', 'H'};
        StringBuffer prompt = new
                StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
        for (char okayCode : okayCodes) {
            prompt.append(okayCode);
            prompt.append(", ");
        }
        entry = JOptionPane.showInputDialog(null,
                prompt);
        userCode = entry.charAt(0);
        for (char okayCode : okayCodes) {
            if (userCode == okayCode) {
                found = true;
            }
        }
        if (found)
            message = "Good code";
        else
            message = "Sorry code not found";
        JOptionPane.showMessageDialog(null, message);
    }
}