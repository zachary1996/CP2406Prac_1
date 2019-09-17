package week6;

import javax.swing.*;

public class DistanceFromAverage {

    public static void main(String[] args) {
        int track = 0;
        int length = 20;
        double sum = 0;
        double[] numCollection = new double[length];
        String entry = "";
        String stop = "99999";
        double input = 0.0;
        int i = 0;
        int count = 0;
        while (!(entry.equals(stop))) {
            numCollection[i] = input;
            entry = JOptionPane.showInputDialog(null, "please enter a number \n" + "enter 99999 to stop");
            input = Double.parseDouble(entry);
            i++;
        }
        for (double number : numCollection) {
            sum = number + sum;
        }
        for (double v : numCollection) {
            if (v != 0.0)
                count++;
        }
        double average = sum / count;
        for (double v : numCollection) {
            double distance;
            if (v != 0.0) {
                if ((v - average) >= 0)
                    distance = v - average;
                else
                    distance = (v - average) * -1.0;
                System.out.println("number " + v + " is " + (distance) + " away from the average");
            } else {
                track++;
                if (track == numCollection.length)
                    System.out.println("no numbers were entered!");
            }
        }
    }
}
