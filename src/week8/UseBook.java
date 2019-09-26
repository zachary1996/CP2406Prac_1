package week8;

public class UseBook {

    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Aladdin");
        NonFiction book = new NonFiction("Planet Earth");
        System.out.println("The title of the book is " + fictionBook.getTitle() + "\nand it costs $" + fictionBook.getPrice());
        System.out.println("The title of the book is " + book.getTitle() + "\nand it costs $" + book.getPrice());
    }
}
