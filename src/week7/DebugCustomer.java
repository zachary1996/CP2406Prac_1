package week7;

public class DebugCustomer {
    protected String name;
    double creditLimit;
    private int idNumber;

    DebugCustomer(int id, String name, double credit) {
        idNumber = id;
        this.name = name;
        creditLimit = credit;
    }

    public void display() {
        System.out.println("Customer #" + idNumber +
                " Name: " + name + "\nCredit limit $" + creditLimit);
    }
}
