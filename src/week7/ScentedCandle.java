package week7;

public class ScentedCandle extends Candle {
    private String scent;

    private String getScent() {
        return scent;
    }

    void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.price = 3 * height;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("and the scent is " + getScent());
    }
}
