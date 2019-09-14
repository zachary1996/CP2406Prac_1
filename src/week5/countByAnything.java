package week5;

import java.util.Scanner;

public class countByAnything {
    public static void main(String[] args) {
        int max = 300;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int usersChoice = input.nextInt();
        int interval = 0;
        for (int count = 0; count <= max; count = count + usersChoice) {
            interval++;
            if (interval == 10) {
                System.out.print(" " + count);
                System.out.println();
                interval = 0;
            } else {
                System.out.print(" " + count);
            }
        }
    }
}
