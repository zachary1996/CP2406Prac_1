package week7;

import java.util.Random;

public class DemoSchoolBaseBallGame {
    public static void main(String[] args) {
        HighSchoolBaseBallGame game = new HighSchoolBaseBallGame("cubs", "bears");
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            game.setTeam1Score(i, random.nextInt(10));
            game.setTeam2Score(i, random.nextInt(10));
        }
        game.checkWinner();
    }

}
