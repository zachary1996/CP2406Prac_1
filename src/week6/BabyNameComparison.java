package week6;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String[] nameList = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("please enter a name");
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            nameList[i] = name;
        }
        System.out.println(nameList[0] + " " + nameList[1]);
        System.out.println(nameList[1] + " " + nameList[2]);
        System.out.println(nameList[2] + nameList[0]);
    }
}
