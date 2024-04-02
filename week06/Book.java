package week06;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyright;

    // Constructor to initialize the Book object with title, author, publisher, and copyright
    public Book(String title, String author, String publisher, int copyright) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyright = copyright;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for publisher
    public String getPublisher() {
        return publisher;
    }

    // Setter method for publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter method for copyright
    public int getCopyright() {
        return copyright;
    }

    // Setter method for copyright
    public void setCopyright(int copyright) {
        this.copyright = copyright;
    }

    // toString method to return a nicely formatted multiline description of the book
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nCopyright: " + copyright;
    }
}
