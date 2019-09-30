package week8;

public abstract class PhoneCall {
    protected String phoneNum;
    protected double price;

    PhoneCall(String phoneNum) {
        this.phoneNum = phoneNum;
        price = 0.0;
    }

    public abstract double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getPhoneNum();

    public abstract void getInfo();
}
