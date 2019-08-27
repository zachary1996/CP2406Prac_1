package week3;

import java.util.Random;

public class Game {
    int wins;
    int count;
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; //secret is assign a random value between 1-10 inclusive//

    void makeGuess(int value) {
        count = count + 1;
        if (value == secret) {
            wins = wins + 1;
        }
    }
}
