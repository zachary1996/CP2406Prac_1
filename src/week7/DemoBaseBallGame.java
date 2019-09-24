package week7;

import java.util.Random;

public class DemoBaseBallGame {
    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame("eagles", "rhinos", 9);
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            game.setTeam1Score(i, random.nextInt(10));
            game.setTeam2Score(i, random.nextInt(10));
        }
        game.checkWinner();
    }


}
