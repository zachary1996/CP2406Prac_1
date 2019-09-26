package week8;

public abstract class Book {
    protected double price;
    private String title;

    Book(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public abstract void setPrice();
}
