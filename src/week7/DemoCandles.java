package week7;

public class DemoCandles {

    public static void main(String[] args) {
        Candle plain = new Candle();
        ScentedCandle vanilla = new ScentedCandle();
        vanilla.setScent("vanilla");
        vanilla.setColor("white");
        vanilla.setHeight(8);
        plain.setColor("blue");
        plain.setHeight(3);
        vanilla.display();
        System.out.println();
        plain.display();

    }

}
