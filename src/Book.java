public class Book {

    private final String bookName;
    private final Author author;
    private int publishYear;

    public  Book (String bookName, Author author, int publishYear){
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
