package week8;

import javax.swing.*;

public class BookArray {
    private static Book[] bookArray = new Book[3];

    public static void main(String[] args) {
        buildArray();
        displayArray();
    }

    private static void buildArray() {
        char boatType;
        for (int x = 0; x < bookArray.length; ++x) {
            boatType = getBook();
            String bookTitle;
            bookTitle = JOptionPane.showInputDialog(null,
                    "Enter book title");
            if (boatType == 'f')
                bookArray[x] = new Fiction(bookTitle);
            else
                bookArray[x] = new NonFiction(bookTitle);
        }
    }

    private static char getBook() {
        String bookType;
        bookType = JOptionPane.showInputDialog(null,
                "Enter f for fiction; n for nonfiction ");
        return bookType.charAt(0);
    }

    private static void displayArray() {
        for (int x = 0; x < bookArray.length; ++x) {
            System.out.println("The title of the book is: " + bookArray[x].getTitle() + "\nand it costs $" + bookArray[x].getPrice());

        }

    }
}

