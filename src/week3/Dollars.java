package week3;

import java.util.Scanner;

public class Dollars {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalDollars;

        int twenties, tens, fives, ones;
        System.out.println("Enter an amount of dollars. ");

        totalDollars = in.nextInt();

        twenties = totalDollars / 20;
        totalDollars = totalDollars % 20;

        tens = totalDollars / 10;
        totalDollars = totalDollars % 10;

        fives = totalDollars / 5;
        totalDollars = totalDollars % 5;

        ones = totalDollars;

        System.out.println(twenties + " twenties, " + tens + " tens, " + fives + " fives and " + ones + " ones");

    }
}
