

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Ефремов");
        Author author2 = new Author("Зигмунд", "Фрейд");

        Book book1 = new Book("Лезвие бритвы", author1, 1963);
        Book book2 = new Book("Толкование сновидений", author2, 1913);

        System.out.println("book2.getPublishYear() = " + book2.getPublishYear());
        book2.setPublishYear(1963);

        System.out.println("book2.getPublishYear() = " + book2.getPublishYear());

        System.out.println("book1 " + author1.getAuthorName() + ' ' + author1.getAuthorSurname() + ' ' +
                book1.getName() + ' ' + book1.getPublishYear());
        System.out.println("book2 " + author2.getAuthorName() + ' ' + author2.getAuthorSurname() + ' ' +
                book2.getName() + ' ' + book2.getPublishYear());

        System.out.println(author1);
        System.out.println(author2);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println(author1.equals(author2));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book2));
    }
}

