package week8;

import javax.swing.*;

public class TwoEventParticipants {
    private static Participant[] miniMarathon = new Participant[2];
    private static Participant[] diving = new Participant[2];

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Enter mini marathon participants");
        buildArray(miniMarathon);
        JOptionPane.showMessageDialog(null, "Enter diving participants");
        buildArray(diving);
        display();
    }

    private static void buildArray(Participant[] array) {
        for (int x = 0; x < array.length; ++x) {
            String name = JOptionPane.showInputDialog(null, "Enter your name:");
            String input = JOptionPane.showInputDialog(null, "Enter your age");
            if (input.isEmpty())
                input = "0";
            int age = Integer.parseInt(input);
            String address = JOptionPane.showInputDialog(null, "Enter your address:");
            array[x] = new Participant(name, age, address);
        }
    }

    private static void display() {
        System.out.println("list of participants attending both events:");
        for (int i = 0; i < diving.length; i++) {
            for (int x = 0; x < diving.length; x++) {
                if (miniMarathon[i].equals(diving[x])) {
                    System.out.println(diving[x].toString());
                }

            }
        }
    }
}
