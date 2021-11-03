package skypro;

public class Main {

    public static void main(String[] args) {
        Book book0 = new Book("Муму", "Иван Тургенев", 1852);
        Book book1 = new Book("Война и мир", "Лев Толстой", 1867);

        Author author0 = new Author("Иван", "Тургенев");
        Author author1 = new Author("Лев", "Толстой");

        book0.setAge(1952);
        Book[] books = new Book[5];
        putInLibrary(book0, books);
        putInLibrary(book1, books);
        printLibrary(books);



    }


    public static void putInLibrary(Book book, Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public static void printLibrary(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthorName() + ": " + book.getBookName() + " " + book.getAge());
            }
        }
    }
}

