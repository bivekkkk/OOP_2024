package week06;

public class BookShelf {
    public static void main(String[] args) {
        // Instantiate several Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);

        // Update information about book1
        book1.setPublisher("HarperCollins");
        book1.setAuthor("Harper Lee & Atticus Finch");

        // Display information about the books
        System.out.println("Book 1:\n" + book1 + "\n");
        System.out.println("Book 2:\n" + book2);
    }
}
