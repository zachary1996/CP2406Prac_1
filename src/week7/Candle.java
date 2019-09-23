package week7;

public class Candle {
    int height; // in inches
    double price; //in dollars
    private String color;

    private String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    private double getPrice() {
        return price;
    }

    private int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = 2 * height;
    }

    public void display() {
        System.out.println("the color is " + getColor());
        System.out.println("the height is " + getHeight() + " inches");
        System.out.println("the price is $" + getPrice());
    }

}
