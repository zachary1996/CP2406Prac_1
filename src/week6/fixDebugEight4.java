package week6;// Allows user to enter a series of words
// and displays them in reverse order

import javax.swing.*;

public class fixDebugEight4 {
    public static void main(String[] args) {
        int x = 0, y;
        String[] array = new String[100];
        String entry;
        final String STOP = "XXX";
        StringBuffer message = new
                StringBuffer("The words in reverse order are\n");

        entry = JOptionPane.showInputDialog(null,
                "Enter any word\n" +
                        "Enter " + STOP + " when you want to stop");
        while (!(entry.equals(STOP))) {
            x++;
            array[x] = entry;
            entry = JOptionPane.showInputDialog(null,
                    "Enter another word\n" +
                            "Enter " + STOP + " when you want to stop");
        }
        for (y = array.length - 1; y > 0; --y) {
            if (array[y] != null) {
                message.append(array[y]);
                message.append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }
}

