package week6;// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them

import java.util.Scanner;

public class fixDebugSeven2 {
    public static void main(String[] args) {
        String str;
        int x;
        int length;
        int num;
        int sum = 0;
        int lastSpace;
        String partStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        str = in.nextLine();
        length = str.length();
        for (x = 0; x < length; ++x) {
            if (str.charAt(x) == ' ') {
                lastSpace = x;
                partStr = str.substring(x - 1, lastSpace);
                num = Integer.parseInt(partStr);
                System.out.println("                " + num);
                sum = sum + num;

            }
        }
        System.out.println("         -------------------" +
                "\nThe sum of the integers is " + sum);
    }
}