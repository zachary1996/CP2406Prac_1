package week4;

public class Sandwich {
    private String mainIng;
    private String breadType;
    private double cost;

    public String getMainIng() {
        return mainIng;
    }

    public void setMainIng(String ingredient) {
        mainIng = ingredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String type) {
        breadType = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double price) {
        cost = price;
    }
}
