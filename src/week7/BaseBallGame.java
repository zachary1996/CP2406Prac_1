package week7;


import java.util.Arrays;

public class BaseBallGame {
    protected int[] team1Score;
    protected int[] team2Score;
    String team1;
    String team2;

    BaseBallGame(String name1, String name2, int innings) {
        team1 = name1;
        team2 = name2;
        team1Score = new int[innings];
        team2Score = new int[innings];
        Arrays.fill(team1Score, -1);
        Arrays.fill(team2Score, -1);
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getTeam1Score(int inning) {
        return team1Score[inning - 1];
    }

    public int getTeam2Score(int inning) {
        return team2Score[inning - 1];
    }

    public void setTeam1Score(int inning, int score) {
        this.team1Score[inning] = score;
    }

    public void setTeam2Score(int inning, int score) {
        this.team2Score[inning] = score;
    }

    public void checkWinner() {
        int team1Sum = 0;
        int team2Sum = 0;
        for (int i = 0; i < team1Score.length; i++) {
            team1Sum = team1Sum + team1Score[i];
        }
        for (int i = 0; i < team2Score.length; i++) {
            team2Sum = team2Sum + team2Score[i];
        }
        if (team1Sum > team2Sum)
            System.out.println("the winner is " + getTeam1());
        else
            System.out.println("the winner is " + getTeam2());
    }

}
