package week4;

public class Student {
    private int idNumber;
    private double creditHours;
    private int points;

    public Student() {
        idNumber = 9999;
        points = 12;
        creditHours = 3;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int number) {
        idNumber = number;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double hours) {
        creditHours = hours;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int number) {
        points = number;
    }

    public void gpa() {
        System.out.println("the students gpa is " + points / creditHours);
    }

}
