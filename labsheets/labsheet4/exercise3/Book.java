package labsheet4.exercise3;

public class Book {
    private String title;
    private String ISBN;
    private double price;
    private int pages;

    public Book() {
        this(" Title Not Available", " Not Available",  0.00,  0);
    }

    public Book(String title, String ISBN, double price, int pages) {
        setTitle(title);
        setISBN(ISBN);
        setPrice(price);
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Title:" + getTitle() + " ISBN:" + getISBN() + "Price:" + getPrice()
                + " Pages:" + getPages();
    }
}
