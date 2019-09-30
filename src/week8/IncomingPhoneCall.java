package week8;

public class IncomingPhoneCall extends PhoneCall {

    IncomingPhoneCall(String phoneNum) {
        super(phoneNum);
        setPrice(0.02);
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
        System.out.println("the rate is $" + getPrice() + " per call");
        System.out.println("the phone number is " + getPhoneNum());
        System.out.println("the cost of the call is $" + getPrice());
    }
}
