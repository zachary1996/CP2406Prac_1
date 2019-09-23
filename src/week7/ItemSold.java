package week7;

public class ItemSold {
    private double price;
    private int invoiceNum;
    private String description;

    private double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    private String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void display() {
        System.out.println("the invoice number is " + getInvoiceNum());
        System.out.println(getDescription());
        System.out.println("the price is " + getPrice());
    }
}
