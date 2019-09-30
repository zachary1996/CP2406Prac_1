package week8;

public class DemoPhoneCalls {

    public static void main(String[] args) {
        OutGoingPhoneCall call = new OutGoingPhoneCall("0404503947", 5);
        IncomingPhoneCall call2 = new IncomingPhoneCall("40239401");

        call.getInfo();
        System.out.println();
        call2.getInfo();
    }
}

