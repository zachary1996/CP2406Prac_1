package week8;

public abstract class NewsPaperSubscription {
    protected String address;
    protected double rate;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress();
}
