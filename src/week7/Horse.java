package week7;

public class Horse {
    protected String name;
    private String color;
    private int birthYear;

    Horse(String nme, String clr, int year) {
        name = nme;
        color = clr;
        birthYear = year;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private int getBirthYear() {
        return birthYear;
    }

    private void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void display() {
        System.out.println("my horses name is " + getName() + ", its color is "
                + getColor() + " and it was born in " + getBirthYear());
    }

}
