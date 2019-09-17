package week6;


public class TwelveInts {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int value : array) System.out.print(value + " ");
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");

    }
}
