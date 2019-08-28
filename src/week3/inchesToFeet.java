package week3;

import java.util.Scanner;

public class inchesToFeet {

    public static void main(String[] args) {
        int inches;
        Scanner in = new Scanner(System.in);
        System.out.println("please enter inches");
        inches = in.nextInt();

        int feet = inches / 12;
        int leftover = inches % 12;

        System.out.println(feet + " Feet and " + leftover + " inches");

    }

}
