package week6;

import java.util.Scanner;

public class InputCharacterInfo {
    public static void main(String[] args) {
        System.out.println("please enter a character");
        Scanner in = new Scanner(System.in);
        char aChar = in.next().charAt(0);
        System.out.println("The character is " + aChar);
        if (Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");
        if (Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");
        aChar = Character.toLowerCase(aChar);
        System.out.println("after toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("after toUpperCase(), aChar is " + aChar);
        if (Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar + " is neither a letter nor a digit");
        if (Character.isWhitespace(aChar))
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");
    }

}
