import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void checkOutBook(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("\nBook checked out: " + title);
                return;
            }
        }
        System.out.println("Book not available for checkout: " + title);
    }

    public void returnBook(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("\nBook returned: " + title);
                return;
            }
        }
        System.out.println("Book not found for return: " + title);
    }

    public void printCatalog() {
        for (Book book : catalog) {
            System.out.println(book);
        }
    }
}
