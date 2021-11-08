package skypro;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final String authorName;
    private int publicationYear;

    public Book(String bookName, String authorName, int age) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = age;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int age) {
        this.publicationYear = age;
    }

    @Override
    public String toString() {
        return "\n" + "============================================" +
                "\n" + "Книга: " +
                "\n" + "Название книги: " + bookName +
                "\n" + "Автор: " + authorName +
                "\n" + "Выпущена: " + publicationYear +
                "\n" + "============================================"
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }


}