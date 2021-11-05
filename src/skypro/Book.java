package skypro;

import java.util.Objects;

public class Book {
    String bookName;
    String authorName;
    int age;

    public Book(String bookName, String authorName, int age) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.age = age;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return  "\n" + "============================================" +
                "\n" + "Книга" +
                "\n" + "Название книги: " + bookName + '\'' +
                "\n" + "Автор: " + authorName + '\'' +
                "\n" + "Выпущена: " + age +
                "\n" + "============================================"
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }
}
