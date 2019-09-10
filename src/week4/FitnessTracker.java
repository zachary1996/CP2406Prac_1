package week4;


public class FitnessTracker {
    private String fitnessActivity;
    private int participationTime; // in minutes
    private int year;
    private int month;
    private int day;
    private int[] date;

    public FitnessTracker(String activity, int time, int yr, int mth, int d) {
        setFitnessActivity(activity);
        fitnessActivity = getFitnessActivity();

        setParticipationTime(time);
        participationTime = getParticipationTime();

        setYear(yr);
        year = getYear();

        setMonth(mth);
        month = getMonth();

        setDay(d);
        day = getDay();

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
