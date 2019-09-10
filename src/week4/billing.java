package week4;

public class billing {

    public double computeBill(double price) {
        return price + price * 0.08;
    }

    public double computeBill(double price, int numberOrd) {
        return (price * numberOrd * 0.08) + (price * numberOrd);
    }

    public double computeBill(double price, int numberOrd, double couponVal) {
        return ((price * numberOrd - couponVal) * 0.08) + (price * numberOrd - couponVal);
    }
}
