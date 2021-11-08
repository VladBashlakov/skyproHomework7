package skypro;

public class Main {

    public static void main(String[] args) {

        Book book0 = new Book("Муму", "Иван Тургенев", 1852);
        Book book1 = new Book("Война и мир", "Лев Толстой", 1867);

        Author author0 = new Author("Иван", "Тургенев");
        Author author1 = new Author("Лев", "Толстой");

        book0.setPublicationYear(1952);
        Book[] books = new Book[5];
        putInLibrary(book0, books);
        putInLibrary(book1, books);

        Library library = new Library(10);
        library.addBook(book0);
        library.addBook(book1);
        library.printBookInfo("Муму");
        library.changeBookAge("Муму", 9999);
        library.printBookInfo("Муму");
        library.printBookInfo("Война и мир");
        System.out.println(library);
//        library.changeBookAge("221", 123);


    }

    public static void putInLibrary(Book book, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;

            }
        }
    }


    public static void printLibrary(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthorName() + ": " + book.getBookName() + " " + book.getPublicationYear());
            }
        }
    }

}

