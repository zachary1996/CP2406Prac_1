package week5;

public class countByThree {


    public static void main(String[] args) {
        int max = 300;
        int interval = 3;
        for (int count = 3; count <= max; count = count + 3) {
            interval = interval + 3;
            if (interval == 30) {
                System.out.println();
                interval = 3;
            } else {
                System.out.print(" " + count);
            }
        }
    }
}
