import java.util.Objects;

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

    @Override
    public String toString() {
        return getAuthor().getAuthorName() + ' ' + getAuthor().getAuthorSurname() +' '
                + bookName + ' '+ publishYear + " год";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}
