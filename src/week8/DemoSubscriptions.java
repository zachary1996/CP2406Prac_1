package week8;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewsPaperSubscription sub = new PhysicalNewsPaperSubscription();
        OnlineNewsPaperSubscription sub2 = new OnlineNewsPaperSubscription();
        sub.setName("Cairns post");
        sub.setAddress();
        System.out.println(sub.getName());
        System.out.println("address : " + sub.getAddress());
        System.out.println("the rate is $" + sub.getRate() + " per month");

        sub2.setName("7 news");
        sub2.setAddress();
        System.out.println(sub2.getName());
        System.out.println("Email : " + sub2.getAddress());
        System.out.println("the rate is $" + sub2.getRate() + " per month");
    }
}
