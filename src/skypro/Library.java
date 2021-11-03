package skypro;

public class Library {

    private int size;
    private Book [] books;
    public Library(int n) {
        books = new Book[n];
    }

     public void printBookInfo(String bookName) {
         for (Book book : books) {
             if (bookName.equals(book.getBookName())) {
                 printLibrary(books);
             }
         }
    }

     public void putInLibrary(Book book, Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void printLibrary(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthorName() + ": " + book.getBookName() + " " + book.getAge());
            }
        }
    }
}

