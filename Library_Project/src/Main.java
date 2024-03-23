public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryRunner runner = new LibraryRunner(library);
        runner.run();
    }
}
