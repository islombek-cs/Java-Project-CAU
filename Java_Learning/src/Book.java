public class Book {
    private String title;
    private String author;
    private long ISBN;

    public Book(){};
    public Book(String title, String author, long ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public long getISBN(){
        return ISBN;
    }

    @Override
    public String toString(){
        return title + " " + author + " " + ISBN;
    }

}
