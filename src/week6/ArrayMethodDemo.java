package week6;

import javax.swing.*;

public class ArrayMethodDemo {

    public static void main(String[] args) {
        ArrayMethodDemo demo = new ArrayMethodDemo();
        String entry, limitEntry;
        int[] array = new int[4];
        limitEntry = JOptionPane.showInputDialog(null, "please enter an integer limit");
        int limit = Integer.parseInt(limitEntry);
        for (int i = 0; i < array.length; i++) {
            entry = JOptionPane.showInputDialog(null, "please enter 10 integers");
            int num = Integer.parseInt(entry);
            array[i] = num;
        }
        demo.displayIntegers(array);
        System.out.println();
        demo.displayIntsReversed(array);
        System.out.println();
        demo.sumInts(array);
        System.out.println();
        demo.displayIntsLessThan(array, limit);
        System.out.println();
        demo.higherThanAvg(array);
    }

    private void displayIntegers(int[] arrayInput) {
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i] + " ");
        }
    }

    private void displayIntsReversed(int[] arrayInput) {
        for (int i = arrayInput.length - 1; i >= 0; i--) {
            System.out.print(arrayInput[i] + " ");
        }
    }

    private void sumInts(int[] arrayInput) {
        int sum = 0;
        for (int i = arrayInput.length - 1; i >= 0; i--) {
            sum = sum + arrayInput[i];
        }
        System.out.print("the sum is " + sum);
    }

    private void displayIntsLessThan(int[] arrayInput, int limit) {
        System.out.print("integers less than the limit " + limit + " are: ");
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] < limit)
                System.out.print(arrayInput[i] + " ");
        }
    }

    private void higherThanAvg(int[] arrayInput) {
        int sum = 0, avg;
        for (int i = arrayInput.length - 1; i >= 0; i--) {
            sum = sum + arrayInput[i];
        }
        avg = sum / arrayInput.length;
        System.out.print("integers higher than the average are: ");
        for (int i = arrayInput.length - 1; i >= 0; i--) {
            if (arrayInput[i] > avg) {
                System.out.print(arrayInput[i] + " ");
            }
        }
    }
}
