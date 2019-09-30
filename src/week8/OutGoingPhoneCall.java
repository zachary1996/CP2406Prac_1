package week8;

public class OutGoingPhoneCall extends PhoneCall {
    private int time;

    OutGoingPhoneCall(String phoneNum, int time) {
        super(phoneNum);
        setPrice(0.04);
        this.time = time;
    }

    private int getTime() {
        return time;

    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public String getPhoneNum() {
        return super.phoneNum;
    }

    @Override
    public void getInfo() {
        System.out.println("the rate is $" + getPrice() + " per minute");
        System.out.println("the phone number is " + getPhoneNum());
        System.out.println("the call lasted for " + getTime() + "mins");
        System.out.println("the cost of the call is $" + getPrice() * getTime());
    }

}
