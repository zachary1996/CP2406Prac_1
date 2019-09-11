package week5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        EvenOdd num = new EvenOdd();
        num.checkOddOrEven(number);

    }

    public void checkOddOrEven(int number) {
        if (odd(number))
            System.out.println("number is odd");
        else
            System.out.println("number is even");
    }

    private boolean odd(int input) {
        return input % 2 != 0;
    }
}
