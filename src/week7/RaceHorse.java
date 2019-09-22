package week7;

public class RaceHorse extends Horse {
    private int completedRaces;

    RaceHorse(String nme, String clr, int year, int num) {
        super(nme, clr, year);
        completedRaces = num;
    }

    private int getCompletedRaces() {
        return completedRaces;
    }

    private void setCompletedRaces(int completedRaces) {
        this.completedRaces = completedRaces;
    }

    @Override
    public void display() {
        super.display();
        setCompletedRaces(completedRaces);
        System.out.println(name + " has completed " + getCompletedRaces() + " races");
    }
}
