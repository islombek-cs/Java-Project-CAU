public class LibraryRunner {
    private Library library;

    public LibraryRunner(Library library) {
        this.library = library;
    }

    public void run() {
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

        System.out.println("Initial Catalog:");
        library.printCatalog();

        library.checkOutBook("1984");

        library.checkOutBook("1984");

        library.returnBook("1984");

        System.out.println("\nFinal Catalog:");
        library.printCatalog();
    }
}

