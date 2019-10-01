package week8;

public abstract class Division {
    protected int accountNum;
    protected String divisionName;


    public Division(String divisionName, int accountNum) {
        this.accountNum = accountNum;
        this.divisionName = divisionName;
    }

    public abstract void display();
}
