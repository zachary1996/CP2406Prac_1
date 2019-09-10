package week4;


public class FitnessTracker {
    private String fitnessActivity;
    private int participationTime; // in minutes
    private int year;
    private int month;
    private int day;
    private int[] date;

    public FitnessTracker() {
        fitnessActivity = "running";
        participationTime = 0;
        year = 2019;
        month = 1;
        day = 1;
        date = new int[]{year, month, day};

    }

    public String getFitnessActivity() {
        return fitnessActivity;
    }

    public void setFitnessActivity(String activity) {
        fitnessActivity = activity;
    }

    public int getParticipationTime() {
        return participationTime;
    }

    public void setParticipationTime(int time) {
        participationTime = time;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        month = m;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        day = d;
    }

    public void getDate() {
        System.out.println("date: " + date[2] + "/" + date[1] + "/" + date[0]);
    }
}
