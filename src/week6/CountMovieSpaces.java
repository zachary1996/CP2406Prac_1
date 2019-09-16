package week6;

import java.util.Scanner;

public class CountMovieSpaces {
    public static void main(String[] args) {
        System.out.println("please enter your favourite movie quote");
        Scanner in = new Scanner(System.in);
        String quote = in.nextLine();
        int length = quote.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (quote.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("the number of spaces in " + "'" + quote + "'" + " is " + count);
    }
}
