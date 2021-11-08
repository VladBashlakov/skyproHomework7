package skypro;

import java.util.Arrays;

public class Library {
    private int size;
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void printBookInfo(String bookName) {
        for (Book book : books) {
            if (book != null && (bookName.equals(book.getBookName()))) {
                System.out.println(book);
            }
        }
    }

    @Override
    public String toString() {
        return "<Библиотека>:" +
                "\n" + "Колличество книг: " + size +
                "\n" + Arrays.toString(books) +
                '}'
                ;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                size++;
                break;
            }
        }
    }

    public void changeBookAge(String bookName, int age) {
        for (Book book : books) {
            if (book != null && bookName.equals(book.getBookName())) {
                book.setPublicationYear(age);
                return;
            }
        }
        throw new RuntimeException("Книга не найдена");
    }
}






