public class Book {
    String title;
    String author;
    int year;

    // Default constructor
    public Book() {
        title = "Not specified";
        author = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        System.out.println("Book 1:");
        Book b1 = new Book(); // Default constructor
        b1.displayInfo();

        System.out.println(); // ✅ Adds a blank line between Book 1 and Book 2

        System.out.println("Book 2:");
        Book b2 = new Book("Java Programming", "Sakshi", 2024); // Parameterized constructor
        b2.displayInfo();
    }
}
