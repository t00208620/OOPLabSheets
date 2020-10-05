package labsheet4.exercise5;

public class Book {
    String title;
    String ISBN;
    double price;
    int pages;

    public Book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.equals(""))
               this.title = "No valid title supplied";
            else
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN == null ||ISBN.equals(""))
        this.ISBN = "No valid ISBN supplied";
        else
            this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <0|| price>50000)
        this.price = price;
        else
            this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages<0||pages>4000)
            this.pages=0;
        else
        this.pages = pages;
    }

    public String toString() {
        return "Title:" + getTitle() + " ISBN:" + getISBN() + "Price:" + getPrice()
                + " Pages:" + getPages();
    }
}
