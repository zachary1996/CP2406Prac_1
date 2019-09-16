package week6;

// Sum and average an array of integers
public class fixDebugEight2 {
    public static void main(String[] args) {
        int[] someNums = {4, 17, 22, 8, 35};
        int tot;
        int x;
        int sum = 0;
        int avg;
        for (x = 0; x < someNums.length; ++x) {
            tot = someNums[x];
            sum = sum + tot;
        }
        avg = sum / someNums.length;
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + avg);
    }
}
