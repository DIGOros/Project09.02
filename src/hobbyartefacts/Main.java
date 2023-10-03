package hobbyartefacts;

public class Main {
    public static void main(String[] args) {
        // Creating objects of Book class
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281, "Fiction");
        Book book2 = new Book("1984", "George Orwell", 328, "Dystopian Fiction");

        // Outputting full description of each book
        System.out.println("Book 1:");
        book1.displayBookInfo();
        System.out.println("\nBook 2:");
        book2.displayBookInfo();

        // Modifying properties using setters
        book1.setTitle("The Great Gatsby");
        book1.setPages(180);

        // Outputting modified book information
        System.out.println("\nModified Book 1:");
        book1.displayBookInfo();
    }
}
