package src.democlass1_;

public class Book {

    private String name;
    private String author;
    private double price;

    public String getBookName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setBookName(String Bookname) {
        this.name = BookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "[name: " + this.name
                + ", author : " + this.author
                + " , price:" + this.price;
    }
}
