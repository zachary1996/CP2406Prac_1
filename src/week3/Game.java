package week3;

import java.util.Random;
import java.util.Scanner;

public class Game {

    int wins;
    int count;
    private Random random = new Random();
    int secret;

    public Game(int min, int max) {
        secret = min + random.nextInt(max - min + 1);
    }

    public static void main(String[] args) {
        System.out.println("guess a number from 1 to 10 you have 3 tries");
        int tries = 0;
        while (tries < 3) {
            tries = tries + 1;
            int guess;
            Game game = new Game(1, 10);
            Scanner in = new Scanner(System.in);
            System.out.println("please enter guess");
            guess = in.nextInt();
            game.makeGuess(guess);

        }
    }

    void makeGuess(int value) {
        count = count + 1;
        if (value == secret) {
            wins = wins + 1;
            System.out.println("you won");
        }
        if (value != secret) {
            System.out.println("you lost");
            System.out.println("the correct answer was " + secret);
        }
    }
}
