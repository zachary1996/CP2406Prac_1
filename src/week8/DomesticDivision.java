package week8;

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNum, String state) {
        super(divisionName, accountNum);
        this.state = state;
    }

    public void display() {
        System.out.println("Division name: " + divisionName + "\naccount number: " + accountNum + "\nState: " + state + "\n");
    }
}
