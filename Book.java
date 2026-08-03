public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 15.99);
        Book b2 = new Book("Dune", "Frank Herbert", 20.50);
        
        b1.displayInfo();
        b2.displayInfo();
    }
}
