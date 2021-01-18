package OOP2;


import java.util.Arrays;

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book2(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getAuthorNames(){
        String authorNames = authors[0].getName();
        for (int i = 1; i < authors.length; i++){
            authorNames += ", " + authors[i].getName();
        }
        return authorNames;
    }

    @Override
    public String toString() {
        return "Book[" + "name='" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + ']';
    }


}
