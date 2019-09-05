package week4;

public class Lease {
    private String tenName; //tenet name
    private int apartmentNum;
    private double monthlyRent;
    private int leaseTerm;

    public Lease() {
        tenName = "bob";
        apartmentNum = 23;
        monthlyRent = 800;
        leaseTerm = 1;

    }

    public String getName() {
        return tenName;
    }

    public void setName(String name) {
        tenName = name;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(int number) {
        apartmentNum = number;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double dollars) {
        monthlyRent = dollars;
    }

    public int getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(int term) {
        leaseTerm = term;
    }

    public void addPetFee() {
        monthlyRent = monthlyRent + 10;
        explainPetPolicy();
    }

    private void explainPetPolicy() {
        System.out.println("$10.00 has been added to each months rent to account for having a pet/s");
    }
}

