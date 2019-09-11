package week5;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int numElements, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        numElements = input.nextInt();
        int[] array = new int[numElements];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < numElements; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < numElements; i++) {
            for (int j = i + 1; j < numElements; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < numElements - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[numElements - 1]);

        System.out.print(" descending Order: ");
        for (int i = numElements; i > 1; i--) {
            System.out.print(array[i - 1] + ",");
        }
        System.out.print(array[0]);
    }

}
