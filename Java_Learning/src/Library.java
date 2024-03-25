import java.util.ArrayList;
public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void printBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void removeBook(long ISBN){
        for(int i=0; i<books.size(); i++){
            if (books.get(i).getISBN() == ISBN){
                books.remove(i);
                break;
            }
        }
    }

}