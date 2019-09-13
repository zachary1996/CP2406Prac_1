package week5;

import java.time.LocalDateTime;

public class CompareLoopTimes {
    public static void main(String[] args) {
        int startTime, endTime;
        final int REPEAT = 1000000000;
        final int FACTOR = 1_000_000;
        LocalDateTime now;

        startTime = 999999999;
        while (startTime > 990000000) {
            now = LocalDateTime.now();
            startTime = now.getNano();
        }
        for (int x = 0; x <= REPEAT; ++x)
            for (int y = 0; y <= REPEAT; ++y) ;
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops starting from 0: " + ((endTime - startTime) / FACTOR) + " milliseconds");

        startTime = 999999999;
        while (startTime > 990000000) {
            now = LocalDateTime.now();
            startTime = now.getNano();
        }
        for (int x = REPEAT; x >= 0; --x)
            for (int y = REPEAT; y >= 0; --y) ;
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops ending with 0: " + ((endTime - startTime) / FACTOR) + " milliseconds");

    }
}
