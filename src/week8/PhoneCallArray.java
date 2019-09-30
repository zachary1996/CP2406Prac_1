package week8;

import javax.swing.*;

public class PhoneCallArray {
    private static PhoneCall[] phoneCalls = new PhoneCall[4];

    public static void main(String[] args) {
        buildArray();
        displayArray();
    }

    private static void buildArray() {
        for (int x = 0; x < phoneCalls.length; ++x) {

            String option;
            String num;
            String time = "";
            int minutes;
            num = JOptionPane.showInputDialog(null,
                    "Enter phone number");
            option = JOptionPane.showInputDialog(null,
                    "Enter 'o' for outgoing or 'i' for incoming");
            char callType = option.charAt(0);
            if (callType == 'i')
                phoneCalls[x] = new IncomingPhoneCall(num);
            else {
                time = JOptionPane.showInputDialog(null, "Enter call time");
                minutes = Integer.parseInt(time);
                phoneCalls[x] = new OutGoingPhoneCall(num, minutes);
            }
        }
    }

    private static void displayArray() {
        for (int x = 0; x < phoneCalls.length; ++x) {
            phoneCalls[x].getInfo();

        }

    }
}
